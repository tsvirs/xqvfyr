package com.jn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import utils.DesUtils;
import utils.MD5Utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by think on 2017/5/8.
 */
@Controller
@RequestMapping("/student")
public class StudentController {


    @RequestMapping(value = "/login")
    public String toLogin() {

        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login/validate")
    public @ResponseBody
    void validate(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletResponse response) throws IOException {

        String md5 = MD5Utils.encode(password);
        if ("12345678".equals(password) && "vhsj".equals(username)){

            Long createDate = new Date().getTime();
            String str = 123 + "=" + createDate;

            String result = DesUtils.encrypt(str, password);


        }else{

        }




        response.sendRedirect("/student/test");
    }

    @RequestMapping(value = "/test")
    public String toTest() {

        return "callback";
    }

}
