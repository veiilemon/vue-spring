package com.example.demo.service.impl;

import com.example.demo.mapper.VueTableMapper;
import com.example.demo.model.VueTable;
import com.example.demo.service.VueTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author V
 */
@Service
public class VueTableServiceImpl implements VueTableService {

    @Resource
    private VueTableMapper vueTableMapper;

    @Override
    public List<VueTable> queryAll(Map param) {
        return vueTableMapper.queryAll(param);
    }

    @Override
    public int queryCount(Map param) {
        return vueTableMapper.queryCount(param);
    }

    @Override
    public int addVueTable(VueTable vueTable) {
        return vueTableMapper.addVueTable(vueTable);
    }

    @Override
    public int delVueTable(Integer id) {
        return vueTableMapper.delVueTable(id);
    }

    @Override
    public int updateVueTable(Map param) {
        return vueTableMapper.updateVueTable(param);
    }
}
