package com.example.demo.service;

import com.example.demo.model.VueTable;

import java.util.List;
import java.util.Map;

/**
 * @author V
 * @ClassName:
 */
public interface VueTableService {
    /**
     * 查询全部
     * @param param
     * @return
     */
    List<VueTable> queryAll(Map param);
    /**
     * 查询总数
     * @param param
     * @return
     */
    int queryCount(Map param);

    /**
     * 添加
     * @param vueTable
     * @return
     */
    int addVueTable(VueTable vueTable);

    /**
     * 删除
     * @param id
     * @return
     */
    int delVueTable(Integer id);

    /**
     * 更新
     * @param param
     * @return
     */
    int updateVueTable(Map param);
}
