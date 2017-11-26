package com.liusl.dao;

import com.liusl.entity.Spittler;

/**
 * created by l1 on 2017/11/21.
 */
public interface SpittlerRepository {
    public void save(Spittler spittler);    //保存spittler信息
    public Spittler findByUsername(String username);    //通过username寻找Spittler
}
