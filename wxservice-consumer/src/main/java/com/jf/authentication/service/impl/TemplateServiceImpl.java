package com.jf.authentication.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jf.authentication.constant.ErrorMessage;
import com.jf.authentication.entity.Template;
import com.jf.authentication.exception.ServiceException;
import com.jf.authentication.mapper.TemplateMapper;
import com.jf.authentication.service.ITemplateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * <p>
 * 认证模板 服务实现类
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TemplateServiceImpl extends ServiceImpl<TemplateMapper, Template> implements ITemplateService {

    @Override
    public boolean deleteSelective(Serializable id) throws ServiceException {
        checkExist(id);
        // TODO 检查是否有设备在使用
        return deleteById(id);
    }

    @Override
    public boolean updateSelective(Template entity, Serializable id) throws ServiceException {
        checkExist(id);
        EntityWrapper<Template> ew = new EntityWrapper<>();
        ew.where("template_name={0}", id);
        return update(entity, ew);
    }

    @Override
    public Template selectSelective(Serializable id) throws ServiceException {
        checkExist(id);
        return selectById(id);
    }

    // ---------------------------------------------------------------------
    private void checkExist(Serializable id) throws ServiceException {
        EntityWrapper<Template> ew = new EntityWrapper<>();
        ew.where("template_name={0}",id);
        int count = selectCount(ew);
        if(count == 0) {
            throw new ServiceException(ErrorMessage.ERR_NOT_EXIST);
        }
    }
}
