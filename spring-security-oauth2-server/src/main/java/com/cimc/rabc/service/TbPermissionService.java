package com.cimc.rabc.service;

import com.cimc.rabc.domain.TbPermission;

import java.util.List;

/**
 * @author chenz
 * @create 2019-08-09 21:19
 */
public interface TbPermissionService {
    List<TbPermission> selectByUserId(Long userId);
}
