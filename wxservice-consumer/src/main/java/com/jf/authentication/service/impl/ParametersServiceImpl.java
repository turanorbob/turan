package com.jf.authentication.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jf.authentication.constant.ErrorMessage;
import com.jf.authentication.entity.Parameters;
import com.jf.authentication.exception.ServiceException;
import com.jf.authentication.mapper.ParametersMapper;
import com.jf.authentication.service.IParametersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 映射参数 服务实现类
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ParametersServiceImpl extends ServiceImpl<ParametersMapper, Parameters> implements IParametersService {

    @Override
    public boolean deleteSelective(Serializable id) throws ServiceException {
        checkExist(id);
        Parameters param = (Parameters) id;
        EntityWrapper<Parameters> ew = new EntityWrapper<>();
        ew.where("device_config_name={0} and parameter_name={1}", param.getDeviceConfigName(), param.getParameterName());
        return delete(ew);
    }

    @Override
    public boolean updateSelective(Parameters entity, Serializable id) throws ServiceException {
        Parameters param = (Parameters) id;
        checkExist(id);
        EntityWrapper<Parameters> ew = new EntityWrapper<>();
        ew.where("device_config_name={0} and parameter_name={1}", param.getDeviceConfigName(), param.getParameterName());
        return update(entity, ew);
    }

    @Override
    public boolean deleteAll() {
        EntityWrapper<Parameters> ew = new EntityWrapper<>();
        ew.setSqlSelect("delete from auth_parameters");
        return delete(ew);
    }

    @Override
    public boolean deleteAll(List<Parameters> data) {
        for(Parameters param : data){
            EntityWrapper<Parameters> ew = new EntityWrapper<>();
            ew.where("device_config_name={0} and parameter_name={1}", param.getDeviceConfigName(), param.getParameterName());
            delete(ew);
        }
        return true;
    }

    @Override
    public Parameters selectSelective(Serializable id) throws ServiceException {
        checkExist(id);
        Parameters param = (Parameters) id;
        EntityWrapper<Parameters> ew = new EntityWrapper<>();
        ew.where("device_config_name={0} and parameter_name={1}", param.getDeviceConfigName(), param.getParameterName());
        return selectOne(ew);
    }

    // ---------------------------------------------------------------------
    private void checkExist(Serializable id) throws ServiceException {
        Parameters param = (Parameters) id;

        EntityWrapper<Parameters> ew = new EntityWrapper<>();
        ew.where("device_config_name={0} and parameter_name={1}", param.getDeviceConfigName(), param.getParameterName());
        int count = selectCount(ew);
        if (count == 0) {
            throw new ServiceException(ErrorMessage.ERR_NOT_EXIST);
        }
    }
}
