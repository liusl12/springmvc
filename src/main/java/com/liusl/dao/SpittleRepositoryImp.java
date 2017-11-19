package com.liusl.dao;

import com.liusl.entity.Spittle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * created by l1 on 2017/11/19.
 */
@Repository
public class SpittleRepositoryImp implements SpittleRepository{
    public List<Spittle> findSpittles(long max, int count){
        List<Spittle> SpittleList = new ArrayList<Spittle>();//初始化一个ArrayList
        for(int i=0;i<count;i++){
            SpittleList.add(new Spittle("Spittle"+i,new Date()));//初始化一个Spittle对象，添加到ArrayList中
        }
        return SpittleList;
    }

}
