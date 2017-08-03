package org.jks.demo.controller;

import org.jks.demo.model.ResponseModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by turan on 2017/8/2 0002.
 */
@Controller
public class GreetingController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public ResponseModel hello(){
        ResponseModel response = new ResponseModel();
        response.setSuccess(true);
        response.setMessage("aaa");
        return response;
    }

}
