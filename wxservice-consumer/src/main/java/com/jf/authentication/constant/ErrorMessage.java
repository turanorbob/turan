package com.jf.authentication.constant;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by turan on 2017/8/5 0005.
 */
@Data
@AllArgsConstructor
public class ErrorMessage {
    public static final ErrorMessage ERR_UNKNOW = new ErrorMessage(-1, "Unknow");
    public static final ErrorMessage ERR_DUPLICATE_PRIMARY = new ErrorMessage(10000,"Duplicate Primary");
    public static final ErrorMessage ERR_NOT_EXIST = new ErrorMessage(10001, "Not Exist");

    private int code;
    private String message;
}
