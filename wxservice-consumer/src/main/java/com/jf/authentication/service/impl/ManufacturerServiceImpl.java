package com.jf.authentication.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jf.authentication.constant.ErrorMessage;
import com.jf.authentication.entity.Manufacturer;
import com.jf.authentication.exception.ServiceException;
import com.jf.authentication.mapper.ManufacturerMapper;
import com.jf.authentication.service.IManufacturerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * <p>
 * 设备厂商 服务实现类
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ManufacturerServiceImpl extends ServiceImpl<ManufacturerMapper, Manufacturer> implements IManufacturerService {

    @Override
    public boolean deleteSelective(Serializable id) throws ServiceException {
        checkExist(id);
        return deleteById(id);
    }

    @Override
    public boolean updateSelective(Manufacturer entity, Serializable id) throws ServiceException {
        checkExist(id);
        EntityWrapper<Manufacturer> ew = new EntityWrapper<>();
        ew.where("manufacturer_name={0}", id);
        return update(entity, ew);
    }

    @Override
    public Manufacturer selectSelective(Serializable id) throws ServiceException {
        checkExist(id);
        return selectById(id);
    }

    @Override
    public void checkExist(Serializable id) throws ServiceException {
        EntityWrapper<Manufacturer> ew = new EntityWrapper<>();
        ew.where("manufacturer_name={0}",id);
        int count = selectCount(ew);
        if(count == 0) {
            throw new ServiceException(ErrorMessage.ERR_NOT_EXIST);
        }
    }
}
