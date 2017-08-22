package com.jf.authentication.controller;

import com.jf.authentication.model.ResponseModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by turan on 2017/8/2 0002.
 */
@Controller
@Api(tags = "测试")
public class GreetingController {

    @ApiOperation(value = "问候", response = ResponseModel.class)
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public ResponseModel hello(){
        ResponseModel response = new ResponseModel();
        response.setSuccess(true);
        response.setMessage("aaa");
        return response;
    }

}
