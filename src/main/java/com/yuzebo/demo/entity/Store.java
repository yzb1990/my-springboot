package com.yuzebo.demo.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @Author : yuzebo <511729587@qq.com>
 * @Date : 2020/7/5 - 8:17 下午 - 星期日
 * @Package : com.yuzebo.demo.entity
 * @ProjectName : springboot-jpa-demo
 */
@Entity
public class Store {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "store")
    private List<Customer>  customers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
