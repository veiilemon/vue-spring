package com.example.demo;

import com.example.demo.mapper.VueTableMapper;
import com.example.demo.model.VueTable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author V
 * @ClassName:
 * @Description:
 * @date 2020年09月29日 15:33:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class VueMapperTest {

    @Resource
    private VueTableMapper vueTableMapper;

    /**
     * 测试mapper注解
     */
    @Test
    public void testUpdate() {
        //测试id
        Integer id = 3;
        VueTable vueTable = vueTableMapper.getOne(id);
        System.out.println("Title修改前: " + vueTable.getTitle());
        vueTable.setTitle("测试title");
        vueTable.setAuthor("测试admin");
        vueTableMapper.update(vueTable);
        vueTable = vueTableMapper.getOne(id);
        System.out.println("Title修改后：" + vueTable.getTitle());
    }

    /**
     * 测试动态SQL choose,when,otherwise
     */
    @Test
    public void testQuery() {
        Map<String, Object> param = new HashMap<>();
        param.put("title", "demoData");
        List<VueTable> list = vueTableMapper.queryTest(param);
        System.out.println("查询title结果数量：" + list.size());
        for (VueTable vueTable : list){
            System.out.println("title: " + vueTable.getTitle() + " author: " + vueTable.getAuthor() + " type: " + vueTable.getType());
        }
        param.clear();
        param.put("author", "admin");
        list = vueTableMapper.queryTest(param);
        System.out.println("查询author结果数量：" + list.size());
        for (VueTable vueTable : list){
            System.out.println("title: " + vueTable.getTitle() + " author: " + vueTable.getAuthor() + " type: " + vueTable.getType());
        }
        param.clear();
        list = vueTableMapper.queryTest(param);
        System.out.println("查询无参数结果数量：" + list.size());
        for (VueTable vueTable : list){
            System.out.println("title: " + vueTable.getTitle() + " author: " + vueTable.getAuthor() + " type: " + vueTable.getType());
        }
    }

    /**
     * 测试动态SQL foreach
     */
    @Test
    public void testQueryForeach(){
        List<String> paramList = new ArrayList<>();
        paramList.add("CN");
        paramList.add("EU");
        List<VueTable> vueTables = vueTableMapper.queryByForeachTest(paramList);
        System.out.println("查询结果数量：" + vueTables.size());
        for (VueTable vueTable : vueTables){
            System.out.println(vueTable.getTitle() + "  type: " + vueTable.getType());
        }
    }
}
