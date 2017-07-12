package on.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Dongfang on 2017/7/11.
 */
@Controller
public class TestController
{
    @RequestMapping(value = "/returnSuccess")
    public String returnSuccess() {
        return "success";
    }

    @RequestMapping(value = "/returnString", produces = {"text/plain;charset=UTF-8"})
    //produces用于解决返回中文乱码问题，application/json;为json解决中文乱码
    @ResponseBody
    //用于返回字符串,不写即返回视图
    public String returnString() {
        return "hello return string 这是中文，并没有乱码";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("msg", "Spring MVC Hello World");
        return "hello";
    }
}
