package com.jf.authentication.service;

import com.jf.authentication.entity.ManufacturerVersion;
import com.jf.authentication.entity.ManufacturerVersionParameters;
import com.baomidou.mybatisplus.service.IService;
import com.jf.authentication.entity.Parameters;
import com.jf.authentication.exception.ServiceException;

import java.util.List;

/**
 * <p>
 * 版本参数映射 服务类
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
public interface IManufacturerVersionParametersService extends IService<ManufacturerVersionParameters> {
	boolean param(ManufacturerVersion manufacturerVersion, List<Parameters> parametersList) throws ServiceException;
}
