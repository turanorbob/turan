package com.jf.authentication.model;

import lombok.Data;

/**
 * Created by turan on 2017/8/4 0004.
 */
@Data
public class ResponseModel {
    private boolean success;
    private String message;
    private Object data;
}
