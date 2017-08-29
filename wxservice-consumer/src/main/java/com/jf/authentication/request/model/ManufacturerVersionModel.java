package com.jf.authentication.request.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by turan on 2017/8/5 0005.
 */
@Data
@ApiModel("厂商版本")
public class ManufacturerVersionModel {
    @ApiModelProperty("厂商版本号")
    private String manufacturerVersion;
    @ApiModelProperty("厂商名称")
    private String manufacturerName;

    private List<ParametersModel> data;
}
