package com.fsl.page;

import com.fsl.page.dao.StudentDao;
import com.fsl.page.entity.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



import java.util.List;

/**
 * @author: fsl
 * @date: 2019/11/22 下午3:03
 * @description: 1
 * @version:1.0.0 Copyright(C)易比得信息服务(北京)有限公司-版权所有
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestProcessBuilder {

    @Autowired
    private StudentDao studentDao;


    @Test
    public void test1(){

        //PageHelper  和 PageInfo   一定要使用 com.github.pagehelper  包的不能使用baomidou包的，否则会导致没办法分页
        PageHelper.startPage(0, 5);

        List<Student> users = studentDao.selectAll();

        PageInfo<Student> pageInfo = new PageInfo(users);
        System.out.println(pageInfo);




    }
}
