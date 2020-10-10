package com.example.demo.controller;

import com.example.demo.model.Result;
import com.example.demo.model.VueTable;
import com.example.demo.service.VueTableService;
import com.example.demo.util.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author V
 * @ClassName:
 * @Description:
 * @date 2020年09月28日 21:43:25
 */
@RestController
@RequestMapping("/vue")
public class VueTableController {

    @Autowired
    private VueTableService vueTableService;

    /**
     * 查询
     * @param page
     * @param size
     * @param title
     * @param type
     * @return
     */
    @GetMapping("/queryAll")
    public Result<Map> queryAll(@RequestParam(value = "page",defaultValue = "1",required = false) Integer page,
                                @RequestParam(value = "limit",defaultValue = "10",required = false) Integer size,
                                @RequestParam(value = "title",defaultValue = "",required = false) String title,
                                @RequestParam(value = "type",defaultValue = "",required = false) String type){
        Map<String, Object> param = new HashMap<>(16);
        int startRow = (page - 1) * size;

        param.put("title", title);
        param.put("type", type);
        int count = vueTableService.queryCount(param);
        param.put("startRow", startRow);
        param.put("rows", size);
        List<VueTable> list = vueTableService.queryAll(param);
        Map data = new HashMap(10);
        data.put("items", list);
        data.put("total", count);
        return ResultGenerator.genSuccessResult(data);
    }

    /**
     * 新增
     * @param vueTable
     * @return
     */
    @PostMapping("/addVueTable")
    public Result addVueTable(VueTable vueTable){
        vueTableService.addVueTable(vueTable);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @PostMapping("delVueTable")
    public Result delVueTable(@RequestParam(value = "id",required = true)Integer id){
        vueTableService.delVueTable(id);
        return ResultGenerator.genSuccessResult();

    }

    /**
     * 更新
     * @param vueTable
     * @return
     */
    @PostMapping("/updateVueTable")
    public Result updateDish(VueTable vueTable){
        Map<String, Object> param = new HashMap(16);
        param.put("id", vueTable.getId());
        param.put("title", vueTable.getTitle());
        param.put("type", vueTable.getType());
        param.put("remark", vueTable.getRemark());
        param.put("reviewer", vueTable.getReviewer());
        vueTableService.updateVueTable(param);
        return ResultGenerator.genSuccessResult();
    }
}
