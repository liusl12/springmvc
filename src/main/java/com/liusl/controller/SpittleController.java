package com.liusl.controller;

import com.liusl.dao.SpittleRepositoryImp;
import com.liusl.entity.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

/**
 * created by l1 on 2017/11/19.
 */
@Controller
@RequestMapping(value = "/spittle")
public class SpittleController {
    private SpittleRepositoryImp spittleRepositoryImp;
    //注入依赖SpittleRepositoory
    @Autowired
    public SpittleController(SpittleRepositoryImp spittleRepositoryImp){
        this.spittleRepositoryImp = spittleRepositoryImp;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model){
        ArrayList<Spittle> spittleList = (ArrayList<Spittle>) spittleRepositoryImp.findSpittles(Long.MAX_VALUE,20);
        model.addAttribute("spittleList",spittleList);

        return "spittle";
    }
}
