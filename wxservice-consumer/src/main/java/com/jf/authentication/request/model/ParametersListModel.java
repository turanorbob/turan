package com.jf.authentication.request.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * Created by turan on 2017/8/4 0004.
 */
@Data
@ApiModel
public class ParametersListModel {
    private List<ParametersModel> data;
}
