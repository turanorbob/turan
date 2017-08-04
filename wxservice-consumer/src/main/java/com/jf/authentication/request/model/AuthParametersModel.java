package com.jf.authentication.request.model;

import lombok.Data;

/**
 * Created by turan on 2017/8/4 0004.
 */
@Data
public class AuthParametersModel {
    /**
     * 设备参数
     */
    private String deviceConfigName;

    /**
     * 系统参数
     */
    private String parameterName;
}
