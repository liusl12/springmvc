package com.liusl.controller;

import com.liusl.dao.SpittlerRepositoryImp;
import com.liusl.entity.Spittler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;


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
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String processRegisteration(@Valid Spittler spittler, Errors errors){
        if(errors.hasErrors()){//如果校验有错误，重新返回表单
            return "registerForm";
        }
        spittlerRepositoryImp.save(spittler);
        return "redirect:/spittler/"+spittler.getUsername();
    }

    /*
        表单提交成功之后返回
     */
    @RequestMapping(value = "/{username}",method = RequestMethod.GET)
    public String showSpittlerProfile(@PathVariable String username,Model model){
        Spittler spittler = spittlerRepositoryImp.findByUsername(username);//通过username查询Spittler对像
        model.addAttribute(spittler);
        return "profile";

    }
}
