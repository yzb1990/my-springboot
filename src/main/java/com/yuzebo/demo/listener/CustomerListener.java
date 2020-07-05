package com.yuzebo.demo.listener;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

/**
 * @Author : yuzebo <511729587@qq.com>
 * @Date : 2020/7/5 - 10:01 下午 - 星期日
 * @Package : com.yuzebo.demo.listener
 * @ProjectName : springboot-jpa-demo
 */
public class CustomerListener {

    @PrePersist
    public void perPersist(Object o){
        System.out.println("PrePersist:"+o);
    }

    @PostPersist
    public  void postPersist(Object o){
        System.out.println("PostPersist" + o);
    }

}
