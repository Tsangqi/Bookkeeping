package com.bookkeeping.qitsang.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName helloController
 * @Author QiTsang
 * @Description 系统初始化测试是否能正常启动和访问
 * @Date Create in 0:31 2021/9/9
 * @Version v1.0
 * @ProjectName Bookkeeping
 */
@Controller
public class helloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
