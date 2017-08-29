package com.jf.authentication.request.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by turan on 2017/8/4 0004.
 */
@Data
@ApiModel
public class ParametersUpdateModel extends ParametersModel{
    @ApiModelProperty("需修改设备参数名")
    private String oldDeviceConfigName;
    @ApiModelProperty("需修改映射参数名")
    private String oldParameterName;
}
