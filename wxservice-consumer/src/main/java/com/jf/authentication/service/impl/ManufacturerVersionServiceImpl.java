package com.jf.authentication.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.jf.authentication.constant.ErrorMessage;
import com.jf.authentication.entity.ManufacturerVersion;
import com.jf.authentication.entity.ManufacturerVersionParameters;
import com.jf.authentication.entity.Parameters;
import com.jf.authentication.exception.ServiceException;
import com.jf.authentication.mapper.ManufacturerVersionMapper;
import com.jf.authentication.request.model.ManufacturerVersionModel;
import com.jf.authentication.request.model.ParametersModel;
import com.jf.authentication.service.IManufacturerService;
import com.jf.authentication.service.IManufacturerVersionParametersService;
import com.jf.authentication.service.IManufacturerVersionService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 设备版本 服务实现类
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ManufacturerVersionServiceImpl extends ServiceImpl<ManufacturerVersionMapper, ManufacturerVersion> implements IManufacturerVersionService {
    @Autowired
    IManufacturerVersionParametersService versionParametersService;
    @Autowired
    IManufacturerService manufacturerService;

    @Override
    public boolean create(ManufacturerVersionModel param) throws ServiceException {
        manufacturerService.checkExist(param.getManufacturerName());
        ManufacturerVersion version = new ManufacturerVersion();
        BeanUtils.copyProperties(param, version);
        boolean ret = insert(version);
        if(ret && !CollectionUtils.isEmpty(param.getData())){
            List<Parameters> parametersList = Lists.newArrayList();
            for(ParametersModel model : param.getData()){
                Parameters parameters = new Parameters();
                BeanUtils.copyProperties(model, parameters);
                parametersList.add(parameters);
            }
            versionParametersService.param(version, parametersList);
        }
        return ret;
    }

    @Override
    public boolean deleteSelective(Serializable id) throws ServiceException {
        checkExist(id);
        ManufacturerVersion version = (ManufacturerVersion)id;
        EntityWrapper<ManufacturerVersion> ew = new EntityWrapper<>();
        ew.where("manufacturer_version={0} and manufacturer_name={1}",version.getManufacturerVersion(), version.getManufacturerName());
        boolean ret = delete(ew);
        if(ret){
            EntityWrapper<ManufacturerVersionParameters> ew1 = new EntityWrapper<>();
            ew1.where("manufacturer_version={0}", version.getManufacturerVersion());
            version.delete(ew1);
        }
        return ret;
    }

    @Override
    public boolean updateSelective(ManufacturerVersion entity, Serializable id) throws ServiceException {
        ManufacturerVersion version = (ManufacturerVersion)id;
        checkExist(id);
        EntityWrapper<ManufacturerVersion> ew = new EntityWrapper<>();
        ew.where("manufacturer_version={0} and manufacturer_name={1}",version.getManufacturerVersion(), version.getManufacturerName());
        return update(entity, ew);
    }

    @Override
    public ManufacturerVersion selectSelective(Serializable id) throws ServiceException {
        checkExist(id);
        ManufacturerVersion version = (ManufacturerVersion)id;
        EntityWrapper<ManufacturerVersion> ew = new EntityWrapper<>();
        ew.where("manufacturer_version={0} and manufacturer_name={1}",version.getManufacturerVersion(), version.getManufacturerName());
        return selectOne(ew);
    }

    @Override
    public void checkExist(Serializable id) throws ServiceException {
        ManufacturerVersion version = (ManufacturerVersion)id;
        EntityWrapper<ManufacturerVersion> ew = new EntityWrapper<>();
        ew.where("manufacturer_version={0} and manufacturer_name={1}",version.getManufacturerVersion(), version.getManufacturerName());
        int count = selectCount(ew);
        if(count == 0) {
            throw new ServiceException(ErrorMessage.ERR_NOT_EXIST);
        }
    }
}
