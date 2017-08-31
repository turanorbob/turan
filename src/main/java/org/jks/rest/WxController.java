package org.jks.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by turan on 2017/7/18 0018.
 */
@Controller
public class WxController {
    @RequestMapping("/api/wechat")
    public String greeting(HttpServletRequest request, HttpServletResponse response) {
        return "greeting";
    }
}
