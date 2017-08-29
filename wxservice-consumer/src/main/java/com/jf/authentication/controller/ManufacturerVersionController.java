package com.jf.authentication.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.jf.authentication.entity.ManufacturerVersion;
import com.jf.authentication.request.model.ManufacturerVersionModel;
import com.jf.authentication.request.model.SearchModel;
import com.jf.authentication.response.model.ResponseHolder;
import com.jf.authentication.response.model.ResponseHolder.BooleanResponse;
import com.jf.authentication.response.model.ResponseModel;
import com.jf.authentication.service.IManufacturerVersionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
/**
 * <p>
 * 设备版本 前端控制器
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@Controller
@RequestMapping("/manufacturerVersion")
@Api(tags = "设备版本")
public class ManufacturerVersionController extends BaseController{
    @Autowired
    IManufacturerVersionService manufacturerVersionService;
    public static class ManufacturerVersionPageResponse extends ResponseModel<Page<ManufacturerVersion>>{}
    public static class ManufacturerVersionResponse extends ResponseModel<ManufacturerVersion>{}

    @ApiOperation(value = "创建", response = BooleanResponse.class)
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public BooleanResponse create(@RequestBody @Valid ManufacturerVersionModel param) throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();
        boolean ret = manufacturerVersionService.create(param);
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "删除", response = BooleanResponse.class)
    @RequestMapping(value = "/delete/{manufacturerName}/{manufacturerVersion}", method = RequestMethod.GET)
    @ResponseBody
    public BooleanResponse delete(@PathVariable("manufacturerName") String manufacturerName, @PathVariable("manufacturerVersion") String manufacturerVersion) throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();

        ManufacturerVersion param = new ManufacturerVersion();
        param.setManufacturerVersion(manufacturerVersion);
        param.setManufacturerName(manufacturerName);

        boolean ret = manufacturerVersionService.deleteSelective(param);
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "查询", response = ManufacturerVersionResponse.class)
    @RequestMapping(value = "/get/{manufacturerName}/{manufacturerVersion}", method = RequestMethod.GET)
    @ResponseBody
    public ManufacturerVersionResponse get(@PathVariable("manufacturerName") String manufacturerName, @PathVariable("manufacturerVersion") String manufacturerVersion) throws Exception{
        ManufacturerVersionResponse response = new ManufacturerVersionResponse();

        ManufacturerVersion param = new ManufacturerVersion();
        param.setManufacturerVersion(manufacturerVersion);
        param.setManufacturerName(manufacturerName);

        ManufacturerVersion entity = manufacturerVersionService.selectSelective(param);
        response.setData(entity);
        return response;
    }

    @ApiOperation(value = "搜索", response = ManufacturerVersionPageResponse.class)
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public ManufacturerVersionPageResponse search(@RequestBody @Valid SearchModel param){
        ManufacturerVersionPageResponse response = new ManufacturerVersionPageResponse();
        Page<ManufacturerVersion> page = new Page<>();
        page.setCurrent(param.getCurrent());
        page.setSize(param.getPageSize());
        page = manufacturerVersionService.selectPage(page);
        response.setData(page);
        return response;
    }
}
