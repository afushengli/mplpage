package com.fsl.page.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.fsl.page.entity.Student;
import java.util.List;

/**
 * @author: fsl
 * @date: 2019/11/22 下午2:54
 * @description: w
 * @version:1.0.0 Copyright(C)易比得信息服务(北京)有限公司-版权所有
 */
public interface StudentDao  extends BaseMapper<Student> {


    List<Student> selectAll();
}
