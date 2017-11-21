package com.liusl.controller;

import com.liusl.dao.SpittlerRepositoryImp;
import com.liusl.entity.Spittler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * created by l1 on 2017/11/21.
 */
@Controller
@RequestMapping("/spittler")
public class SpittlerController {

    @Autowired
    private SpittlerRepositoryImp spittlerRepositoryImp;

    /*
        返回注册表单视图
     */
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String showRegisterationForm(){
        return "registerForm";
    }

    /*
        保存表单提交的信息
     */
    public String processRegisteration(Spittler spittler){
        spittlerRepositoryImp.save(spittler);
        return "redirect:/spittler/"+spittler.getUsername();
    }
}
