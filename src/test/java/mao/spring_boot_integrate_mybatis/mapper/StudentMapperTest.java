package mao.spring_boot_integrate_mybatis.mapper;

import mao.spring_boot_integrate_mybatis.data.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：spring_boot_integrate_Mybatis
 * Package(包名): mao.spring_boot_integrate_mybatis.mapper
 * Class(测试类名): StudentMapperTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/10
 * Time(创建时间)： 12:22
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class StudentMapperTest
{

    @Autowired
    StudentMapper studentMapper;

    @Test
    void selectByPrimaryKey()
    {
        System.out.println(studentMapper);
        Student student = studentMapper.selectByPrimaryKey(202012340113L);
        System.out.println(student);
    }

    @Test
    void selectAll()
    {
        List<Student> studentList = studentMapper.selectAll();
        for (Student student : studentList)
        {
            System.out.println(student);
        }

        System.out.println("数量："+studentList.size());
    }
}