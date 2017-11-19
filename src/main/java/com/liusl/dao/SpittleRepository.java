package com.liusl.dao;

import com.liusl.entity.Spittle;

import java.util.List;

/**
 * created by l1 on 2017/11/18.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(Long max, int count);//返回前count个Spittle对象，对象最大的ID是“max”
}
