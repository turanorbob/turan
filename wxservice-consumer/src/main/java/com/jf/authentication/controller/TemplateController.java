package com.jf.authentication.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.jf.authentication.entity.Template;
import com.jf.authentication.request.model.SearchModel;
import com.jf.authentication.request.model.TemplateModel;
import com.jf.authentication.response.model.ResponseHolder;
import com.jf.authentication.response.model.ResponseHolder.BooleanResponse;
import com.jf.authentication.response.model.ResponseModel;
import com.jf.authentication.service.ITemplateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * <p>
 * 认证模板 前端控制器
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@Controller
@RequestMapping("/template")
@Api(tags = "认证模板")
public class TemplateController extends BaseController{
    @Autowired
    ITemplateService templateService;
    public static class TemplateResponse extends ResponseModel<Template>{}
    public static class TemplatePageResponse extends ResponseModel<Page<Template>>{}

    @ApiOperation(value = "创建", response = BooleanResponse.class)
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public BooleanResponse create(@RequestBody @Valid TemplateModel param) throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();
        Template entity = new Template();
        BeanUtils.copyProperties(param, entity);
        boolean ret = templateService.insert(entity);
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "更新", response = BooleanResponse.class)
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public BooleanResponse update(@RequestBody @Valid TemplateModel param) throws Exception{
        BooleanResponse response = ResponseHolder.booleanResponse();
        Template entity = new Template();
        BeanUtils.copyProperties(param, entity);

        boolean ret = templateService.updateSelective(entity, param.getTemplateName());
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "删除", response = BooleanResponse.class)
    @RequestMapping(value = "/delete/{templateName}", method = RequestMethod.GET)
    @ResponseBody
    public BooleanResponse delete(@PathVariable("templateName") String templateName) throws Exception {
        BooleanResponse response = ResponseHolder.booleanResponse();
        boolean ret = templateService.deleteSelective(templateName);
        response.setData(ret);
        return response;
    }

    @ApiOperation(value = "查询", response = TemplateResponse.class)
    @RequestMapping(value = "/get/{templateName}", method = RequestMethod.GET)
    @ResponseBody
    public TemplateResponse get(@PathVariable("templateName") String templateName) throws Exception {
        TemplateResponse response = new TemplateResponse();
        Template entity = templateService.selectSelective(templateName);
        response.setData(entity);
        return response;
    }

    @ApiOperation(value = "搜索", response = TemplatePageResponse.class)
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public TemplatePageResponse search(@RequestBody @Valid SearchModel param){
        TemplatePageResponse response = new TemplatePageResponse();
        Page<Template> page = new Page<>();
        page.setCurrent(param.getCurrent());
        page.setSize(param.getPageSize());
        page = templateService.selectPage(page);
        response.setData(page);
        return response;
    }
}
