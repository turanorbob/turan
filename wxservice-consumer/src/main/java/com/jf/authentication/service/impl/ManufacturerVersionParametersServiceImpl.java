package com.jf.authentication.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.google.common.collect.Lists;
import com.jf.authentication.entity.ManufacturerVersion;
import com.jf.authentication.entity.ManufacturerVersionParameters;
import com.jf.authentication.entity.Parameters;
import com.jf.authentication.exception.ServiceException;
import com.jf.authentication.mapper.ManufacturerVersionParametersMapper;
import com.jf.authentication.service.IManufacturerVersionParametersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jf.authentication.service.IManufacturerVersionService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 版本参数映射 服务实现类
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ManufacturerVersionParametersServiceImpl extends ServiceImpl<ManufacturerVersionParametersMapper, ManufacturerVersionParameters> implements IManufacturerVersionParametersService {
    @Autowired
    IManufacturerVersionService versionService;

    @Override
    public boolean param(ManufacturerVersion manufacturerVersion, List<Parameters> parametersList) throws ServiceException {
        versionService.checkExist(manufacturerVersion);
        delete(manufacturerVersion);
        if(CollectionUtils.isEmpty(parametersList)){
            return true;
        }
        List<ManufacturerVersionParameters> entities = Lists.newArrayList();
        for(Parameters parameters : parametersList){
            ManufacturerVersionParameters versionParam = new ManufacturerVersionParameters();
            versionParam.setManufacturerVersion(manufacturerVersion.getManufacturerVersion());
            versionParam.setManufacturerName(manufacturerVersion.getManufacturerName());
            versionParam.setDeviceConfigName(parameters.getDeviceConfigName());
            versionParam.setParameterName(parameters.getParameterName());
            entities.add(versionParam);
        }
        return insertBatch(entities);
    }

    //---------------------------------------------------------------------------------
    private void delete(ManufacturerVersion manufacturerVersion){
        EntityWrapper<ManufacturerVersionParameters> ew = new EntityWrapper<>();
        ew.where("manufacturer_version={0} and manufacturer_name={1}",
                manufacturerVersion.getManufacturerVersion(),
                manufacturerVersion.getManufacturerName());
        delete(ew);
    }
}
