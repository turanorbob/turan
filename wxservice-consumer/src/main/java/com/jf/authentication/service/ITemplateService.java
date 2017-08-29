package com.jf.authentication.service;

import com.baomidou.mybatisplus.service.IService;
import com.jf.authentication.entity.Template;
import com.jf.authentication.exception.ServiceException;

import java.io.Serializable;

/**
 * <p>
 * 认证模板 服务类
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
public interface ITemplateService extends IService<Template> {
	boolean deleteSelective(Serializable id) throws ServiceException;
	boolean updateSelective(Template entity, Serializable id) throws ServiceException;
	Template selectSelective(Serializable id) throws ServiceException;
}
