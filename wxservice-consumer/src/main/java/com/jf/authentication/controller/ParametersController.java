package com.jf.authentication.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.google.common.collect.Lists;
import com.jf.authentication.entity.Parameters;
import com.jf.authentication.request.model.ParametersListModel;
import com.jf.authentication.request.model.ParametersModel;
import com.jf.authentication.request.model.ParametersUpdateModel;
import com.jf.authentication.request.model.SearchModel;
import com.jf.authentication.response.model.ResponseHolder;
import com.jf.authentication.response.model.ResponseHolder.BooleanResponse;
import com.jf.authentication.response.model.ResponseModel;
import com.jf.authentication.service.IParametersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 映射参数 前端控制器
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@Controller
@RequestMapping("/parameters")
@Api(tags = "映射参数")
public class ParametersController extends BaseController{
    @Autowired
    IParametersService parametersService;
    public static class ParametersPageResponse extends ResponseModel<Page<Parameters>>{}
    public static class ParametersResponse extends ResponseModel<Parameters>{}

    @ApiOperation(value = "创建", response = BooleanResponse.class)
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public BooleanResponse create(@RequestBody @Valid ParametersModel param) throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();
        Parameters entity = new Parameters();
        BeanUtils.copyProperties(param, entity);
        boolean ret = parametersService.insert(entity);
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "批量创建", response = BooleanResponse.class)
    @RequestMapping(value = "/batch/create", method = RequestMethod.POST)
    @ResponseBody
    public BooleanResponse batchCreate(@RequestBody @Valid ParametersListModel param) throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();
        List<Parameters> entities = Lists.newArrayList();
        for(ParametersModel model : param.getData()){
            Parameters entity = new Parameters();
            BeanUtils.copyProperties(model, entity);
            entities.add(entity);
        }

        boolean ret = parametersService.insertBatch(entities);
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "更新", response = BooleanResponse.class)
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public BooleanResponse update(@RequestBody @Valid ParametersUpdateModel param) throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();
        Parameters entity = new Parameters();
        BeanUtils.copyProperties(param, entity);
        Parameters old = new Parameters();
        old.setDeviceConfigName(param.getOldDeviceConfigName());
        old.setParameterName(param.getOldParameterName());
        boolean ret = parametersService.updateSelective(entity, old);
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "删除", response = BooleanResponse.class)
    @RequestMapping(value = "/delete/{deviceConfigName}/{parameterName}", method = RequestMethod.GET)
    @ResponseBody
    public BooleanResponse delete(@PathVariable("deviceConfigName") String deviceConfigName, @PathVariable("parameterName") String parameterName)
            throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();
        Parameters entity = new Parameters();
        entity.setDeviceConfigName(deviceConfigName);
        entity.setParameterName(parameterName);
        boolean ret = parametersService.deleteSelective(entity);
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "查询", response = ParametersResponse.class)
    @RequestMapping(value = "/get/{deviceConfigName}/{parameterName}", method = RequestMethod.GET)
    @ResponseBody
    public ParametersResponse get(@PathVariable("deviceConfigName") String deviceConfigName, @PathVariable("parameterName") String parameterName)
            throws Exception{
        ParametersResponse response = new ParametersResponse();
        Parameters entity = new Parameters();
        entity.setDeviceConfigName(deviceConfigName);
        entity.setParameterName(parameterName);
        Parameters ret = parametersService.selectSelective(entity);
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "批量删除", response = BooleanResponse.class)
    @RequestMapping(value = "/batch/delete", method = RequestMethod.POST)
    @ResponseBody
    public BooleanResponse batchDelete(@RequestBody @Valid ParametersListModel param)
            throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();
        List<Parameters> entities = Lists.newArrayList();
        for(ParametersModel model : param.getData()){
            Parameters entity = new Parameters();
            BeanUtils.copyProperties(model, entity);
            entities.add(entity);
        }
        boolean ret = parametersService.deleteAll(entities);
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "全部删除", response = BooleanResponse.class)
    @RequestMapping(value = "/deleteAll", method = RequestMethod.GET)
    @ResponseBody
    public BooleanResponse deleteAll()
            throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();

        boolean ret = parametersService.deleteAll();
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "搜索", response = ParametersPageResponse.class)
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public ParametersPageResponse search(@RequestBody @Valid SearchModel param){
        ParametersPageResponse response = new ParametersPageResponse();
        Page<Parameters> page = new Page<>();
        page.setCurrent(param.getCurrent());
        page.setSize(param.getPageSize());
        page = parametersService.selectPage(page);
        response.setData(page);
        return response;
    }
}
