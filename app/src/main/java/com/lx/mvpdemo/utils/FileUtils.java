package com.lx.mvpdemo.utils;

import android.os.Environment;
import android.util.Log;

import com.lx.mvpdemo.MyApplication;
import com.lx.mvpdemo.listener.DownloadListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import okhttp3.ResponseBody;

import static android.os.Environment.getExternalStorageDirectory;

public class FileUtils {

    private static final String ROOT = "Kjzj";
    private static final String VIDEO = "Video";
    private static final String IMAGE = "Image";

    public static File getDir(String dir) {
        //创建相册下的文件夹
        StringBuilder path = new StringBuilder();
        if (isSDAvailable()) {
            path.append(getExternalStorageDirectory().getAbsolutePath()); // /mnt/sdcard
            path.append(File.separator);
            path.append(Environment.DIRECTORY_DCIM); // /mnt/sdcard/DCIM    相册
            path.append(File.separator);
            path.append(ROOT); // /mnt/sdcard/DCIM/HXWY
            path.append(File.separator);
            path.append(dir);// /mnt/sdcard/DCIM/HXWY/VIDEO
        } else {
            //  /data/data/包名/cache/cache
            //  /data/data/包名/cache/icon
            path.append(MyApplication.getInstance().getCacheDir().getAbsolutePath());
            path.append(File.separator);
            path.append(dir);
        }


        File file = new File(path.toString());
        // 如果不存在 或者 不是一个文件夹 就创建出来
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }

    /**
     * sd 卡是否可用
     *
     * @return
     */
    private static boolean isSDAvailable() {
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
    }

    public static File getDownVideo() {
        return getDir(VIDEO);
    }

    public static File getDownImage() {
        return getDir(IMAGE);
    }

    public static File getRoot() {
        String rootPath = getExternalStorageDirectory().getAbsolutePath() + "/" + ROOT;
        File file = new File(rootPath);
        // 如果不存在 或者 不是一个文件夹 就创建出来
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }

    /**
     * 保存文件
     */
    public static void writeFile2Disk2(ResponseBody response, File file) {
        OutputStream os = null;
        InputStream is = response.byteStream();
        try {
            os = new FileOutputStream(file);
            int len;
            byte[] buff = new byte[1024];
            while ((len = is.read(buff)) != -1) {
                os.write(buff, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * 保存文件，并监听保存进度
     *
     * @param response
     * @param file
     * @param downloadListener
     */
    public static void writeFile2Disk2(ResponseBody response, File file, DownloadListener downloadListener) {
        //开始下载
        downloadListener.onStart();
        long currentLength = 0;
        OutputStream os = null;
        InputStream is = response.byteStream();
        long totalLength = response.contentLength();
        try {
            os = new FileOutputStream(file);
            int len;
            byte[] buff = new byte[1024];
            while ((len = is.read(buff)) != -1) {
                os.write(buff, 0, len);
                currentLength += len;
                downloadListener.onProgress(currentLength, totalLength);
            }
            //下载完成，并返回保存的文件路径
            downloadListener.onFinish(file.getAbsolutePath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            downloadListener.onFail("IOException");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * 获取文件名称(包含文件格式)
     *
     * @param pathandname
     * @return
     */
    public static String getFileName(String pathandname) {
        int start = pathandname.lastIndexOf("/");
        int end = pathandname.length();
        if (start != -1 && end != -1) {
            return pathandname.substring(start + 1, end);
        } else {
            return null;
        }
    }

    /**
     * 获取文件名称(不包含文件格式，只针对于图片使用)
     *
     * @param pathandname
     * @return
     */
    public static String getFileName2(String pathandname) {
        int start = pathandname.lastIndexOf("/");
//        int end = pathandname.length();
        int end = pathandname.lastIndexOf(".");
        if (start != -1 && end != -1) {
            return pathandname.substring(start + 1, end);
        } else {
            return null;
        }
    }


    //判断文件是否存在
    public static boolean isExists(File file) {
        try {
            if (!file.exists()) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * 获取指定文件大小
     */
    public static long getFileSize(File file) {
        long size = 0;
        try {
            if (file.exists()) {
                FileInputStream fis = null;

                fis = new FileInputStream(file);

                size = fis.available();
            } else {
                file.createNewFile();
                Log.e("获取文件大小", "文件不存在!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return size;
    }

}
