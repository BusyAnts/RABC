package com.cimc.rabc.service;

import com.cimc.rabc.domain.TbUser;

/**
 * @author chenz
 * @create 2019-08-09 20:35
 */
public interface TbUserService {
    TbUser getByUsername(String username);
}
