package com.jf.authentication.exception;

import com.jf.authentication.constant.ErrorMessage;
import lombok.Data;

/**
 * Created by turan on 2017/8/5 0005.
 */
@Data
public class ServiceException extends Exception{

    private int code;
    private String message;

    public ServiceException(ErrorMessage errorMessage){
        this.code = errorMessage.getCode();
        this.message = errorMessage.getMessage();
    }
}
