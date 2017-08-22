package com.jf.authentication.request.model;

import lombok.Data;

/**
 * Created by turan on 2017/8/4 0004.
 */
@Data
public class AuthTemplateModel {
    /**
     *
     */
    private String templateName;

    /**
     * 厂商名称
     */
    private String manufacturerName;

    /**
     * 厂商版本
     */
    private String manufacturerVersion;

    /**
     * 认证类型（1：portal 2:wifidog）
     */
    private Integer authType;

    /**
     * 认证类型版本
     */
    private String authTypeVersion;

    /**
     * 模板内容
     */
    private String templateContent;
}
