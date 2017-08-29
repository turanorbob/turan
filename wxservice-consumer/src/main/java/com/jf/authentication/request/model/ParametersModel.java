package com.jf.authentication.request.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by turan on 2017/8/4 0004.
 */
@Data
@ApiModel
public class ParametersModel {
    @ApiModelProperty("设备参数名")
    private String deviceConfigName;
    @ApiModelProperty("映射参数名")
    private String parameterName;
}
