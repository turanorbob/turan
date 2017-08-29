package com.jf.authentication.controller;


import com.google.common.collect.Lists;
import com.jf.authentication.entity.ManufacturerVersion;
import com.jf.authentication.entity.Parameters;
import com.jf.authentication.request.model.ParametersListModel;
import com.jf.authentication.request.model.ParametersModel;
import com.jf.authentication.response.model.ResponseHolder;
import com.jf.authentication.service.IManufacturerVersionParametersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import com.jf.authentication.response.model.ResponseHolder.BooleanResponse;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 版本参数映射 前端控制器
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@Controller
@RequestMapping("/manufacturerVersionParameters")
@Api(tags = "版本参数映射")
public class ManufacturerVersionParametersController extends BaseController {
    @Autowired
    IManufacturerVersionParametersService service;

    @ApiOperation(value = "创建或修改版本参数映射，每次只需要传最新的参数映射")
    @RequestMapping(value = "/param/{manufacturerName}/{manufacturerVersion}", method = RequestMethod.POST)
    @ResponseBody
    public BooleanResponse param(
            @PathVariable("manufacturerName") String manufacturerName,
            @PathVariable("manufacturerVersion") String manufacturerVersion,
            @RequestBody @Valid ParametersListModel param) throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();
        List<Parameters> parametersList = Lists.newArrayList();
        for(ParametersModel model : param.getData()){
            Parameters parameters = new Parameters();
            BeanUtils.copyProperties(model, parameters);
            parametersList.add(parameters);
        }
        ManufacturerVersion version = new ManufacturerVersion();
        version.setManufacturerName(manufacturerName);
        version.setManufacturerVersion(manufacturerVersion);
        boolean ret = service.param(version, parametersList);
        response.setData(ret);
        return response;
    }
}
