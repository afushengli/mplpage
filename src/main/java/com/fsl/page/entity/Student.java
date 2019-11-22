package com.fsl.page.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: fsl
 * @date: 2019/11/22 下午2:48
 * @description: 1
 * @version:1.0.0 Copyright(C)易比得信息服务(北京)有限公司-版权所有
 */
@TableName(value = "student")
@AllArgsConstructor
@Data
public class Student {

        private Long id;
        private String stuName;
        private Integer stuSex;
        private Integer stuAge;
        private String stuSchoolName;
        private String stuClassName;
        private int ver;

}
