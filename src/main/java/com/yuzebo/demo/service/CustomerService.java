package com.yuzebo.demo.service;

import com.yuzebo.demo.entity.Customer;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * @Author : yuzebo <511729587@qq.com>
 * @Date : 2020/7/5 - 8:51 下午 - 星期日
 * @Package : com.yuzebo.demo.service
 * @ProjectName : springboot-jpa-demo
 */

@Service
public class CustomerService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void addCustomer(Customer customer){
        entityManager.persist(customer);
    }

    public Customer getCustomerById(long id){
        return entityManager.find(Customer.class,id);
    }
}
