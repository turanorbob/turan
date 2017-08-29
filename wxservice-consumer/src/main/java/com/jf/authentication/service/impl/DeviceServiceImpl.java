package com.jf.authentication.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jf.authentication.constant.ErrorMessage;
import com.jf.authentication.entity.Device;
import com.jf.authentication.exception.ServiceException;
import com.jf.authentication.mapper.DeviceMapper;
import com.jf.authentication.service.IDeviceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DeviceServiceImpl extends ServiceImpl<DeviceMapper, Device> implements IDeviceService {

    @Override
    public boolean deleteSelective(Serializable id) throws ServiceException {
        checkExist(id);
        return deleteById(id);
    }

    @Override
    public boolean updateSelective(Device entity, Serializable id) throws ServiceException {
        checkExist(id);
        EntityWrapper<Device> ew = new EntityWrapper<>();
        ew.where("id={0}", id);
        return update(entity, ew);
    }

    @Override
    public Device selectSelective(Serializable id) throws ServiceException {
        checkExist(id);
        return selectById(id);
    }

    // ---------------------------------------------------------------------
    private void checkExist(Serializable id) throws ServiceException {
        EntityWrapper<Device> ew = new EntityWrapper<>();
        ew.where("id={0}",id);
        int count = selectCount(ew);
        if(count == 0) {
            throw new ServiceException(ErrorMessage.ERR_NOT_EXIST);
        }
    }
}
