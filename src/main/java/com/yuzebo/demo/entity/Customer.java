package com.yuzebo.demo.entity;

import com.yuzebo.demo.listener.CustomerListener;
import org.hibernate.boot.model.relational.Sequence;

import javax.persistence.*;
import java.util.List;

/**
 * @Author : yuzebo <511729587@qq.com>
 * @Date : 2020/7/5 - 2:22 下午 - 星期日
 * @Package : com.yuzebo.demo.entity
 * @ProjectName : springboot-jpa-demo
 */
@Entity
@Access(value = AccessType.FIELD)
@EntityListeners(value = {CustomerListener.class})
public class Customer {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToOne
    private CreditCard creditCard;

    @ManyToOne
    private Store store;

    @ManyToMany
    private List<Book> books;

    public Customer() {

    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

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

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creditCard=" + creditCard +
                ", store=" + store +
                ", books=" + books +
                '}';
    }
}
