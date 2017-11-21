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

    private static final String MAX_LONG_AS_STRING = Long.MAX_VALUE+"";//Long.MAX_VALUE转换成String类型

    /*
    返回创建的20个spittle对象
     */
    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model){
        ArrayList<Spittle> spittleList = (ArrayList<Spittle>) spittleRepositoryImp.findSpittles(Long.MAX_VALUE,20);
        model.addAttribute("spittleList",spittleList);

        return "spittle";
    }

    /*
        @Param "max" 返回的Spittle对象中 ID最大w为“max”
        @Param "count" 返回Spittle对象的个数
     */
//    @RequestMapping(method = RequestMethod.GET)
//    public List<Spittle> spittles(
//            @RequestParam(value = "max",defaultValue = MAX_LONG_AS_STRING) long max,
//            @RequestParam(value = "count",defaultValue = "20") int count){
//        return spittleRepositoryImp.findSpittles(max,count);
//    }

}
