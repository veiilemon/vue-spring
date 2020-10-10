package com.example.demo.mapper;

import com.example.demo.model.VueTable;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author V
 * @ClassName:
 * @Description:
 * @date 2020年09月28日 21:35:19
 */
public interface VueTableMapper {

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

    /**
     * 更新 注解方式
     * @param vueTable
     */
    @Update("UPDATE vue_table SET title=#{title},author=#{author} WHERE id =#{id}")
    void update(VueTable vueTable);

    /**
     * 通过id查询
     * @param id
     * @return
     */
    @Select("SELECT * FROM vue_table WHERE id = #{id}")
    VueTable getOne(Integer id);

    /**
     * 查询测试 choose, when, otherwise
     * @param param
     * @return
     */
    List<VueTable> queryTest(Map param);

    /**
     * 查询测试 foreach
     * @param list
     * @return
     */
    List<VueTable> queryByForeachTest(List list);
}
