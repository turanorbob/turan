package com.jf.authentication.response.model;

import com.jf.authentication.constant.ErrorMessage;
import com.jf.authentication.exception.ServiceException;

/**
 * Created by turan on 2017/8/4 0004.
 */
public class ResponseHolder {
    public static class ObjectResponse extends ResponseModel<Object>{}
    public static class IntegerResponse extends ResponseModel<Integer>{}
    public static class LongResponse extends ResponseModel<Long>{}
    public static class BooleanResponse extends ResponseModel<Boolean>{}

    public static IntegerResponse intResponse(){
        return new IntegerResponse();
    }
    public static LongResponse longResponse(){
        return new LongResponse();
    }
    public static ObjectResponse objResponse(){
        return new ObjectResponse();
    }
    public static BooleanResponse booleanResponse(){return new BooleanResponse();}

    public static BooleanResponse parseError(ErrorMessage errorMessage){
        BooleanResponse booleanResponse = produce(errorMessage.getCode(), errorMessage.getMessage());
        return booleanResponse;
    }

    public static BooleanResponse parseError(ServiceException serviceException){
        BooleanResponse booleanResponse = produce(serviceException.getCode(), serviceException.getMessage());
        return booleanResponse;
    }

    private static BooleanResponse produce(int code, String message){
        BooleanResponse booleanResponse = new BooleanResponse();
        booleanResponse.setCode(code);
        booleanResponse.setMessage(message);
        booleanResponse.setData(false);
        return booleanResponse;
    }
}
