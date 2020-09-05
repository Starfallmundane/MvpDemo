
### android MVP基本封装框架
mvp+retrofit2+rxjava  三合一使用

mvp封装逐步嵌套加深

（1）M--Model数据层，处理数据  
（2）V--View界面（视图）层，仅展示数据，不写逻辑（或者处理很少逻辑）  
（3）P--逻辑（控制）层，处理V与M之间的关系，作为一个桥梁作用  

MVC中是允许Model和View进行交互的，而MVP中很明显，Model与View之间的交互由Presenter完成。还有一点就是Presenter与View之间的交互是通过接口的（代码中会体现)。


### android butterknife基本使用步骤

步骤1：导入远程库
implementation 'com.jakewharton:butterknife:10.2.1'  
annotationProcessor 'com.jakewharton:butterknife-compiler:10.2.1'  

步骤2：Activity和Fragment配置
（1）创建时绑定：ButterKnife.bind(this);  
（2）销毁时解绑： bind.unbind();

    private Unbinder bind;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind=ButterKnife.bind(this);
    } 
    
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_item, null);
        bind = ButterKnife.bind(this, view);
        return view;
    }
 
    @Override
    public void onDestroy() {
        super.onDestroy();
        //解除绑定
        bind.unbind();
    }
    
步骤3：剩余用法参考   https://blog.csdn.net/wen_haha/article/details/85878292


### android eventbus 基本使用步骤  发送消息

步骤1：导入远程库  
 implementation 'org.greenrobot:eventbus:3.2.0'

步骤2：EventBus创建和销毁   
 EventBus.getDefault().register(this);   
 EventBus.getDefault().unregister(this);  
 
步骤3：创建消息体，就是一个javaBean对象，如下，更具需求变化  
 
    public class MessageEvent {
 
         public final String message;
     
         public static MessageEvent getInstance(String message) {
             return new MessageEvent(message);
         }
     
         private MessageEvent(String message) {
             this.message = message;
         }
   }
   
  
步骤4：发送消息和接收消息  
发送  
 EventBus.getDefault().post(MessageEvent.getInstance("消息内容"));

接收  (该方法不可以在Fragmen里使用)  
 @Subscribe(threadMode = ThreadMode.MAIN)
    public void onGetMessage(MessageEvent message) {
        tvResult.setText(message.message);
    }