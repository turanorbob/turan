package com.jf.authentication.controller;

import com.jf.authentication.constant.ErrorMessage;
import com.jf.authentication.exception.ServiceException;
import com.jf.authentication.response.model.ResponseHolder;
import lombok.extern.java.Log;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import com.jf.authentication.response.model.ResponseHolder.BooleanResponse;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Level;

/**
 * Created by turan on 2017/8/5 0005.
 */
@Log
public class BaseController {
    @ExceptionHandler
    @ResponseBody
    public BooleanResponse exception(HttpServletRequest request, Exception ex){
        ex.printStackTrace();
        if(ex instanceof DuplicateKeyException){
            return ResponseHolder.parseError(ErrorMessage.ERR_DUPLICATE_PRIMARY);
        }
        else if(ex instanceof ServiceException){
            return ResponseHolder.parseError((ServiceException) ex);
        }
        return ResponseHolder.parseError(ErrorMessage.ERR_UNKNOW);
    }


}
