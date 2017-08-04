package com.jf.authentication.controller;

import com.jf.authentication.model.ResponseModel;
import com.jf.authentication.request.model.AuthDeviceModel;
import com.jf.authentication.service.AuthDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by turan on 2017/8/4 0004.
 */
@Controller("/auth-device")
public class AuthDeviceController {
    @Autowired
    AuthDeviceService authDeviceService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public ResponseModel create(@RequestBody @Valid AuthDeviceModel model){
        ResponseModel response = new ResponseModel();
        boolean ret = authDeviceService.create(model);
        response.setSuccess(ret);
        return response;
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    @ResponseBody
    public ResponseModel modify(@RequestBody @Valid AuthDeviceModel model){
        ResponseModel response = new ResponseModel();
        boolean ret = authDeviceService.update(model);
        response.setSuccess(ret);
        return response;
    }

    @RequestMapping(value = "/delete/{deviceId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseModel delete(@PathVariable("deviceId") Integer deviceId){
        ResponseModel response = new ResponseModel();
        boolean ret = authDeviceService.delete(deviceId);
        response.setSuccess(ret);
        return response;
    }

    @RequestMapping(value = "/query",method = RequestMethod.POST)
    @ResponseBody
    public ResponseModel query(){
        return null;
    }
}
