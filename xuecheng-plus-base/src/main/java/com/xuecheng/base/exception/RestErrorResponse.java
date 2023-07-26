package com.xuecheng.base.exception;

import java.io.Serializable;

/**
 * @Description 错误响应参数包装
 * @Author Miragic
 * @Date 2023/7/16 15:46
 * @Version 1.0
 **/
public class RestErrorResponse implements Serializable {

    private String errMessage;

    public RestErrorResponse(String errMessage) {
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
