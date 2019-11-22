package com.fsl.page;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: fsl
 * @date: 2019/11/22 下午2:47
 * @description: 2
 * @version:1.0.0 Copyright(C)易比得信息服务(北京)有限公司-版权所有
 */
@MapperScan("com.fsl.page.dao")
@SpringBootApplication
public class PageApplication {

    public static void main(String[] args) {
        SpringApplication.run(PageApplication.class, args);
    }


}
