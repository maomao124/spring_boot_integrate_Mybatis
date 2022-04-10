package mao.spring_boot_integrate_mybatis.mapper;

import java.util.List;

import mao.spring_boot_integrate_mybatis.data.Student;
import mao.spring_boot_integrate_mybatis.data.StudentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper
{
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Long studentNo);

    int insert(Student row);

    int insertSelective(Student row);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Long studentNo);

    int updateByExampleSelective(@Param("row") Student row, @Param("example") StudentExample example);

    int updateByExample(@Param("row") Student row, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student row);

    int updateByPrimaryKey(Student row);

    @Select("select * from student")
    List<Student> selectAll();
}