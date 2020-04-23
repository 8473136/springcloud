package com.ooo.dataservertwo.dto;

import lombok.Data;

import javax.persistence.Table;

/**
 * @author LiuchangLan
 * @date 2020/4/22 14:31
 */
@Table(name = "student")
@Data
public class StudentDTO {

    private Integer id;
    private String name;
    private Integer age;
    private Integer sex;
    private String address;
    private String phone;

}
