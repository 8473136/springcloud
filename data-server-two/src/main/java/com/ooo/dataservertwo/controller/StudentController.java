package com.ooo.dataservertwo.controller;

import com.ooo.dataservertwo.dto.StudentDTO;
import com.ooo.dataservertwo.mapper.StudentMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LiuchangLan
 * @date 2020/4/22 14:35
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Resource
    private StudentMapper studentMapper;

    @GetMapping("/selectAll")
    public List<StudentDTO> selectAll(){
        return studentMapper.selectAll();
    }

}
