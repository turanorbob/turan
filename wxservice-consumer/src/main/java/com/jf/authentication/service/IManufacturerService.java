package com.jf.authentication.service;

import com.baomidou.mybatisplus.service.IService;
import com.jf.authentication.entity.Manufacturer;
import com.jf.authentication.exception.ServiceException;

import java.io.Serializable;

/**
 * <p>
 * 设备厂商 服务类
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
public interface IManufacturerService extends IService<Manufacturer> {
    boolean deleteSelective(Serializable id) throws ServiceException;
    boolean updateSelective(Manufacturer entity, Serializable id) throws ServiceException;
    Manufacturer selectSelective(Serializable id) throws ServiceException;
    void checkExist(Serializable id) throws ServiceException;
}
