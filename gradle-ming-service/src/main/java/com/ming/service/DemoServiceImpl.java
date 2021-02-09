package com.ming.service;


import com.ming.common.CommonConstant;
import com.ming.dao.entity.Demo;



public class DemoServiceImpl implements DemoService{


    @Override
    public String testDemo() {
        Demo demo = new Demo();
        demo.setName("Gradle");
        return CommonConstant.SUCCESS.getCode();
    }
}
