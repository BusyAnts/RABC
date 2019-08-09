package com.cimc.rabc.service.impl;

import com.cimc.rabc.domain.TbPermission;
import com.cimc.rabc.mapper.TbPermissionMapper;
import com.cimc.rabc.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenz
 * @create 2019-08-09 21:21
 */
@Service
public class TbPermissionServiceImpl implements TbPermissionService {
    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
