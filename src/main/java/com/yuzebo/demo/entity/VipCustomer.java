package com.yuzebo.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

/**
 * @Author : yuzebo <511729587@qq.com>
 * @Date : 2020/7/5 - 8:40 下午 - 星期日
 * @Package : com.yuzebo.demo.entity
 * @ProjectName : springboot-jpa-demo
 */

@Entity
@Inheritance
public class VipCustomer extends Customer {
    private double discount;
}
