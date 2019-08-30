package com.control;

import com.common.utils.Data;
import com.common.utils.Result;
import com.model.IntermediateTable;
import com.model.OtherPub;
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

    @RequestMapping("testTwo")
    @ResponseBody
    public Result testTwo(){

        try {
            List<OtherPub> otherPubs = testService.selectAll();
            Data data = new Data();
            data.setContent(otherPubs);
            data.setTotal(100);
            return new Result(1,"访问成功",data);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(0,"访问失败",e.getMessage());
        }
    }

}
