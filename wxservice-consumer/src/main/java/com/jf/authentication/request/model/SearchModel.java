package com.jf.authentication.request.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by turan on 2017/8/5 0005.
 */
@Data
@ApiModel
public class SearchModel {
    @ApiModelProperty(value = "页号，从1开始，默认1", example = "1")
    private int current=1;
    @ApiModelProperty(value = "页大小，默认10", example = "10")
    private int pageSize=10;
}
