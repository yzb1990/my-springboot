package com.yuzebo.demo.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author : yuzebo <511729587@qq.com>
 * @Date : 2020/7/5 - 2:44 下午 - 星期日
 * @Package : com.yuzebo.demo.entity
 * @ProjectName : springboot-jpa-demo
 */
@Entity
public class CreditCard {
    @Id
    @GeneratedValue
    private long id;

    @Column(length = 128)
    private String  number;

    private Date registerDate;

    @OneToOne(mappedBy = "creditCard",cascade = CascadeType.REMOVE)
    private Customer customer;

    public CreditCard() {

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }


}
