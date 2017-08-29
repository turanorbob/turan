package com.jf.authentication.service;

import com.baomidou.mybatisplus.service.IService;
import com.jf.authentication.entity.Parameters;
import com.jf.authentication.exception.ServiceException;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 映射参数 服务类
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
public interface IParametersService extends IService<Parameters> {
    boolean deleteSelective(Serializable id) throws ServiceException;
    boolean updateSelective(Parameters entity, Serializable id) throws ServiceException;
    boolean deleteAll();
    boolean deleteAll(List<Parameters> data);
    Parameters selectSelective(Serializable id) throws ServiceException;
}
