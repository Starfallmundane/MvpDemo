/*
 * Copyright 2017 JessYan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lx.mvpdemo.bean;


import com.lx.mvpdemo.utils.Api;

import java.io.Serializable;

/**
 * ================================================
 * 如果你服务器返回的数据格式固定为这种方式(这里只提供思想,服务器返回的数据格式可能不一致,可根据自家服务器返回的格式作更改)
 * 指定范型即可改变 {@code data} 字段的类型, 达到重用 {@link BaseResponse2}, 如果你实在看不懂, 请忽略
 * <p>
 * Created by JessYan on 26/09/2016 15:19
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
public class BaseResponse2<T> implements Serializable {
    private T data;
    private int count;
    private String status;
    private String msg;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 请求是否成功
     *
     * @return
     */
    public boolean isSuccess() {
        return status.equals("success");
    }

    @Override
    public String toString() {
        return "BaseResponse2{" +
                "data=" + data +
                ", count=" + count +
                ", status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
