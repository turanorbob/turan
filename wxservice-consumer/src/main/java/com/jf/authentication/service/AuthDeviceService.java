package com.jf.authentication.service;

import com.jf.authentication.request.model.AuthDeviceModel;

/**
 * Created by turan on 2017/8/4 0004.
 */
public interface AuthDeviceService {
    boolean create(AuthDeviceModel model);
    boolean update(AuthDeviceModel model);
    boolean delete(Integer id);
}
