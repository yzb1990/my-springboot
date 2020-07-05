package com.yuzebo.demo.repository;

import com.yuzebo.demo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

/**
 * @Author : yuzebo <511729587@qq.com>
 * @Date : 2020/7/5 - 10:23 下午 - 星期日
 * @Package : com.yuzebo.demo.repository
 * @ProjectName : springboot-jpa-demo
 */
@Repository
@Transactional(readOnly = false)
public class CustomerRespository extends SimpleJpaRepository<Customer, Long> {

    @Autowired
    public CustomerRespository(EntityManager em) {
        super(Customer.class, em);
    }
}
