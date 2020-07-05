package com.yuzebo.demo.controller;

import com.yuzebo.demo.entity.Customer;
import com.yuzebo.demo.repository.CustomerRespository;
import com.yuzebo.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @Author : yuzebo <511729587@qq.com>
 * @Date : 2020/7/5 - 8:50 下午 - 星期日
 * @Package : com.yuzebo.demo.controller
 * @ProjectName : springboot-jpa-demo
 */

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRespository customerRespository;

    @RequestMapping("all")
    public List<Customer> findAllCustomer(){
        return  customerRespository.findAll();
    }

    @RequestMapping("getone/{id}")
    public Customer findCustomerById(@PathVariable("id") Long id){

        Optional<Customer> byId = customerRespository.findById(id);
        return  byId.get();
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Customer addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);

        long id = customer.getId();

        return customerService.getCustomerById(id);
    }

    @RequestMapping(value = "get",method = RequestMethod.POST)
    public Customer getCustomer(@RequestParam long id){
        return customerService.getCustomerById(id);
    }
}
