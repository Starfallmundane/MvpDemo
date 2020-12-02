package com.lx.mvpdemo;

import android.Manifest;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.lx.mvpdemo.base.BaseActivity;
import com.lx.mvpdemo.contract.FileContract;
import com.lx.mvpdemo.presenter.FilePresenter;
import com.lx.mvpdemo.utils.ToastUtils;

import butterknife.OnClick;

public class FileActivity extends BaseActivity implements FileContract {

    private FilePresenter mPresenter;
    private static final int PICTURE_CODE = 101;
    private static final int PERMISSIONS_CODE1 = 102;
    private static final int PERMISSIONS_CODE2 = 103;
    private String selectImagePath;


    @Override
    protected int getLayoutResId() {
        return R.layout.activity_file;
    }

    @Override
    protected void initView() {
        mPresenter = new FilePresenter(this);

    }


    @OnClick({R.id.bt_select, R.id.bt_put, R.id.bt_down})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_select:       //选择图片
                checkPermission(Manifest.permission.READ_EXTERNAL_STORAGE,PERMISSIONS_CODE1);

                break;
            case R.id.bt_put:       //上传图片
                mPresenter.putFile(selectImagePath);

                break;
            case R.id.bt_down:       //下载
                checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE,PERMISSIONS_CODE2);
                break;
        }
    }

    private void checkPermission(String permissionType,int code) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, permissionType) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{permissionType}, code);
            } else {
                ToastUtils.showToast(this, "权限已申请");
                if (code==PERMISSIONS_CODE1) {       //选择图片
                    selectPicture();
                } else if (code==PERMISSIONS_CODE2) {       //下载
                    downFile();
                }
            }
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

        if (requestCode == PERMISSIONS_CODE1) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                ToastUtils.showToast(this, "读取权限已申请");
                selectPicture();
            } else {
                ToastUtils.showToast(this, "读取权限已拒绝");
            }
        }else if (requestCode == PERMISSIONS_CODE2) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                ToastUtils.showToast(this, "写入权限已申请");
                downFile();
            } else {
                ToastUtils.showToast(this, "写入权限已拒绝");
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    private void downFile() {
        String downurl="http://47.100.44.106/app/kjzj-v0.0.2.apk";
        mPresenter.downloadFileNet(downurl);
    }

    /**
     * 调用系统单选图片
     */
    private void selectPicture() {
        Intent intent;
        if (Build.VERSION.SDK_INT < 19) {
            intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("image/*");
        } else {
            intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }
        if (intent != null) {
            startActivityForResult(intent, PICTURE_CODE);
        }
    }

    /**
     * 选择图片后的回调
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode) {
            case RESULT_OK:
                //选择图片
                if (requestCode == PICTURE_CODE) {
                    Uri uri = data.getData();
                    ContentResolver resolver = this.getContentResolver();
                    // ContentResolver对象的getType方法可返回形如content://的Uri的类型
                    // 如果是一张图片，返回结果为image/jpeg或image/png等
                    String fileType = resolver.getType(uri);
                    if (fileType.startsWith("image")) {  // 判断用户选择的是否为图片
                        // 根据返回的uri获取图片路径
                        Cursor cursor = resolver.query(uri, new String[]{MediaStore.Images.Media.DATA}, null, null, null);
                        cursor.moveToFirst();
                        String imagePath = cursor.getString(cursor.getColumnIndex(MediaStore.Images.Media.DATA));
                        showImage(imagePath);
                    }
                }
                break;
            default:
                break;
        }
    }


    //显示图片
    private void showImage(String imaePath) {
        selectImagePath = imaePath;
        Bitmap bm = BitmapFactory.decodeFile(imaePath);
        ((ImageView) findViewById(R.id.iv_image)).setImageBitmap(bm);
    }

    @Override
    public Activity getActivity() {
        return this;
    }


}