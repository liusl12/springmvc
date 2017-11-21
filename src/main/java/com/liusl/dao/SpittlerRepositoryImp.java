package com.liusl.dao;

import com.liusl.entity.Spittler;
import org.springframework.stereotype.Repository;

/**
 * created by l1 on 2017/11/21.
 */
@Repository
public class SpittlerRepositoryImp {
    public void save(Spittler spittler){
        System.out.println("保存成功！");
    }
}
