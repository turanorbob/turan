package com.jf.authentication.service;

import com.baomidou.mybatisplus.service.IService;
import com.jf.authentication.entity.Device;
import com.jf.authentication.exception.ServiceException;

import java.io.Serializable;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
public interface IDeviceService extends IService<Device> {
    boolean deleteSelective(Serializable id) throws ServiceException;
    boolean updateSelective(Device entity, Serializable id) throws ServiceException;
    Device selectSelective(Serializable id) throws ServiceException;
}
