package com.jf.authentication.service;

import com.baomidou.mybatisplus.service.IService;
import com.jf.authentication.entity.ManufacturerVersion;
import com.jf.authentication.exception.ServiceException;
import com.jf.authentication.request.model.ManufacturerVersionModel;

import java.io.Serializable;

/**
 * <p>
 * 设备版本 服务类
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
public interface IManufacturerVersionService extends IService<ManufacturerVersion> {
    boolean create(ManufacturerVersionModel param) throws ServiceException;
    boolean deleteSelective(Serializable id) throws ServiceException;
    boolean updateSelective(ManufacturerVersion entity, Serializable id) throws ServiceException;
    ManufacturerVersion selectSelective(Serializable id) throws ServiceException;
    void checkExist(Serializable id) throws ServiceException;
}
