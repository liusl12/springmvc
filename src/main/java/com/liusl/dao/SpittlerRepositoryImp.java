package com.liusl.dao;

import com.liusl.entity.Spittler;
import org.springframework.stereotype.Repository;

/**
 * created by l1 on 2017/11/21.
 */
@Repository
public class SpittlerRepositoryImp implements SpittlerRepository{

    /*
        保存Spittler对象
     */
    public void save(Spittler spittler){
        System.out.println("保存成功！");
    }

    /*
        通过username查找Spittler对象
     */
    public Spittler findByUsername(String username){
        return new Spittler("c","b","a","d");
    }

}
