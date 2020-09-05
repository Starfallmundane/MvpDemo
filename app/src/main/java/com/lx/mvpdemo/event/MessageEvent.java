package com.lx.mvpdemo.event;


/**
 * 消息体，就是一个javaBean,可以按照javaBean写法去做，不一定按照该写法
 */
public class MessageEvent {

    public final String message;

    public static MessageEvent getInstance(String message) {
        return new MessageEvent(message);
    }

    private MessageEvent(String message) {
        this.message = message;
    }
}
