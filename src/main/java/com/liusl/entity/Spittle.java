package com.liusl.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

/**
 * created by l1 on 2017/11/18.
 */
public class Spittle {
    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longitude;

    //构造函数
    public Spittle(String message,Date time){
        this(message,time,null,null);
    }
    //构造函数
    public Spittle(String message,Date time,Double latitude,Double longitude){
        this.id = null;
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;

    }
    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
    @Override
    public boolean equals(Object that){
        return EqualsBuilder.reflectionEquals(this,that,"id","time");
    }

    public int hashcode(){
        return HashCodeBuilder.reflectionHashCode(this,"id","time");
    }


}
