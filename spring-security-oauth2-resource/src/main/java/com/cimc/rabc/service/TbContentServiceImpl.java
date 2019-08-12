package com.cimc.rabc.service;

import com.cimc.rabc.domain.TbContent;
import com.cimc.rabc.mapper.TbContentMapper;
import com.cimc.rabc.service.impl.TbContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenz
 * @create 2019-08-10 12:25
 */
@Service
public class TbContentServiceImpl implements TbContentService {

    @Resource
    private TbContentMapper tbContentMapper;

    @Override
    public TbContent getById(Long id) {
        return (TbContent) tbContentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }

    @Override
    public int insert(TbContent tbContent) {
        return tbContentMapper.insert(tbContent);
    }

    @Override
    public int update(TbContent tbContent) {
        return tbContentMapper.updateByPrimaryKey(tbContent);
    }

    @Override
    public int delete(Long id) {
        return tbContentMapper.deleteByPrimaryKey(id);
    }

}

