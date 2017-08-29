package com.jf.authentication.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.jf.authentication.entity.Manufacturer;
import com.jf.authentication.request.model.ManufacturerModel;
import com.jf.authentication.request.model.SearchModel;
import com.jf.authentication.response.model.ResponseHolder;
import com.jf.authentication.response.model.ResponseHolder.BooleanResponse;
import com.jf.authentication.response.model.ResponseModel;
import com.jf.authentication.service.IManufacturerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
/**
 * <p>
 * 设备厂商 前端控制器
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@Controller
@RequestMapping("/manufacturer")
@Api(tags = "设备厂商")
public class ManufacturerController extends BaseController {
    @Autowired
    IManufacturerService manufacturerService;
    public static class ManufacturerPageResponse extends ResponseModel<Page<Manufacturer>>{}
    public static class ManufacturerResponse extends ResponseModel<Manufacturer>{}

    @ApiOperation(value = "创建", response = BooleanResponse.class)
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public BooleanResponse create(@RequestBody @Valid ManufacturerModel param) throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();
        Manufacturer entity = new Manufacturer();
        BeanUtils.copyProperties(param, entity);
        boolean ret = manufacturerService.insert(entity);
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "更新", response = BooleanResponse.class)
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public ResponseHolder.BooleanResponse update(@RequestBody @Valid ManufacturerModel param) throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();

        Manufacturer entity = new Manufacturer();
        BeanUtils.copyProperties(param, entity);
        boolean ret = manufacturerService.updateSelective(entity, param.getManufacturerName());
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "删除", response = BooleanResponse.class)
    @RequestMapping(value = "/delete/{manufacturerName}", method = RequestMethod.GET)
    @ResponseBody
    public BooleanResponse delete(@PathVariable("manufacturerName") String manufacturerName) throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();

        boolean ret = manufacturerService.deleteSelective(manufacturerName);
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "查询", response = ManufacturerResponse.class)
    @RequestMapping(value = "/get/{manufacturerName}", method = RequestMethod.GET)
    @ResponseBody
    public ManufacturerResponse get(@PathVariable("manufacturerName") String manufacturerName) throws Exception{
        ManufacturerResponse response = new ManufacturerResponse();

        Manufacturer entity = manufacturerService.selectSelective(manufacturerName);
        response.setData(entity);
        return response;
    }

    @ApiOperation(value = "搜索", response = ManufacturerPageResponse.class)
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public ManufacturerPageResponse search(@RequestBody @Valid SearchModel param){
        ManufacturerPageResponse response = new ManufacturerPageResponse();
        Page<Manufacturer> page = new Page<>();
        page.setCurrent(param.getCurrent());
        page.setSize(param.getPageSize());
        page = manufacturerService.selectPage(page);
        response.setData(page);
        return response;
    }
}
