package com.jf.authentication.service.impl;

import com.jf.authentication.service.AuthManufacturerVersionParametersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by turan on 2017/8/4 0004.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthManufacturerVersionParametersServiceImpl implements AuthManufacturerVersionParametersService {
}
