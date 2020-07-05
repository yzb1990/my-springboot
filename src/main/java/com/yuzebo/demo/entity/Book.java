package com.yuzebo.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.List;

/**
 * @Author : yuzebo <511729587@qq.com>
 * @Date : 2020/7/5 - 8:32 下午 - 星期日
 * @Package : com.yuzebo.demo.entity
 * @ProjectName : springboot-jpa-demo
 */

@Entity
public class Book {

    @Id
    @GeneratedValue
    private long id;

    private String bookname;

    private boolean isban;

    private Date cratetime;

    @ManyToMany(mappedBy = "books")
    private List<Customer> customers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public boolean isIsban() {
        return isban;
    }

    public void setIsban(boolean isban) {
        this.isban = isban;
    }

    public Date getCratetime() {
        return cratetime;
    }

    public void setCratetime(Date cratetime) {
        this.cratetime = cratetime;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
