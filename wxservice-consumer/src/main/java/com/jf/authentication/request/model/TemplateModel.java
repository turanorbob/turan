package com.jf.authentication.request.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by turan on 2017/8/4 0004.
 */
@Data
@ApiModel
public class TemplateModel {
    @ApiModelProperty("模板名")
    private String templateName;
    @ApiModelProperty("厂商名称")
    private String manufacturerName;
    @ApiModelProperty("厂商版本")
    private String manufacturerVersion;
    @ApiModelProperty("认证类型（1：portal 2:wifidog）")
    private Integer authType;
    @ApiModelProperty("认证类型版本")
    private String authTypeVersion;
    @ApiModelProperty("模板内容")
    private String templateContent;
}
