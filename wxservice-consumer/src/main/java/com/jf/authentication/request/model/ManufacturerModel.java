package com.jf.authentication.request.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by turan on 2017/8/5 0005.
 */
@Data
@ApiModel
public class ManufacturerModel {
    @ApiModelProperty("厂商名")
    private String manufacturerName;
    @ApiModelProperty("描述")
    private String description;
}
