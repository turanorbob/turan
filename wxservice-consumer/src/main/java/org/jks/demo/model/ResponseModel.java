package org.jks.demo.model;

/**
 * Created by turan on 2017/8/2 0002.
 */
public class ResponseModel {
    boolean success = false;
    String message;
    Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
