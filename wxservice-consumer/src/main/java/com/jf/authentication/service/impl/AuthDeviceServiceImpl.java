package com.jf.authentication.service.impl;

import com.jf.authentication.dao.AuthDeviceMapper;
import com.jf.authentication.model.AuthDevice;
import com.jf.authentication.model.AuthDeviceCriteria;
import com.jf.authentication.request.model.AuthDeviceModel;
import com.jf.authentication.service.AuthDeviceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by turan on 2017/8/4 0004.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthDeviceServiceImpl implements AuthDeviceService {
    @Autowired
    AuthDeviceMapper authDeviceMapper;

    @Override
    public boolean create(AuthDeviceModel model) {
        AuthDevice authDevice = new AuthDevice();
        BeanUtils.copyProperties(model, authDevice);
        return authDeviceMapper.insertSelective(authDevice) > 0;
    }

    @Override
    public boolean update(AuthDeviceModel model) {
        AuthDeviceCriteria criteria = new AuthDeviceCriteria();
        criteria.createCriteria().andIdEqualTo(model.getId());
        AuthDevice authDevice = new AuthDevice();
        BeanUtils.copyProperties(model, authDevice);
        return authDeviceMapper.updateByExampleSelective(authDevice, criteria) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        AuthDeviceCriteria criteria = new AuthDeviceCriteria();
        criteria.createCriteria().andIdEqualTo(id);
        return authDeviceMapper.deleteByExample(criteria) > 0;
    }
}
