package com.control;

import com.model.IntermediateTable;
import com.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 测试
 *
 * @author dell
 * @date 2019-08-28 11:38
 */
@Controller
public class testController{
    @Autowired
    private testService testService;

    @RequestMapping("test")
    @ResponseBody
    public List<IntermediateTable> test(){
        System.out.println(111);
       return testService.seletAll();
    }

}
