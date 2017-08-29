package com.jf.authentication.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.jf.authentication.entity.Device;
import com.jf.authentication.request.model.DeviceModel;
import com.jf.authentication.request.model.SearchModel;
import com.jf.authentication.response.model.ResponseHolder;
import com.jf.authentication.response.model.ResponseHolder.BooleanResponse;
import com.jf.authentication.response.model.ResponseModel;
import com.jf.authentication.service.IDeviceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@Controller
@RequestMapping("/device")
@Api(tags = "认证设备")
public class DeviceController extends BaseController {
    @Autowired
    IDeviceService deviceService;
    public static class DevicePageResponse extends ResponseModel<Page<Device>>{}
    public static class DeviceResponse extends ResponseModel<Device>{}

    @ApiOperation(value = "创建", response = BooleanResponse.class)
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public BooleanResponse create(@RequestBody @Valid DeviceModel param) throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();
        Device entity = new Device();
        BeanUtils.copyProperties(param, entity);
        boolean ret = deviceService.insert(entity);
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "更新", response = BooleanResponse.class)
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public BooleanResponse update(@RequestBody @Valid DeviceModel param) throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();
        Device entity = new Device();
        BeanUtils.copyProperties(param, entity);
        boolean ret = deviceService.updateSelective(entity, param.getId());
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "删除", response = BooleanResponse.class)
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public BooleanResponse delete(@PathVariable("id") Integer id) throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();
        boolean ret = deviceService.deleteSelective(id);
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "查询", response = DeviceResponse.class)
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public DeviceResponse get(@PathVariable("id") Integer id) throws Exception{
        DeviceResponse response = new DeviceResponse();
        Device entity = deviceService.selectSelective(id);
        response.setData(entity);
        return response;
    }

    @ApiOperation(value = "搜索", response = DevicePageResponse.class)
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public DevicePageResponse search(@RequestBody @Valid SearchModel param){
        DevicePageResponse response = new DevicePageResponse();
        Page<Device> page = new Page<>();
        page.setCurrent(param.getCurrent());
        page.setSize(param.getPageSize());
        page = deviceService.selectPage(page);
        response.setData(page);
        return response;
    }
}
