package com.xuecheng.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuecheng.content.model.po.CourseTeacher;

import java.util.List;

/**
 * <p>
 * 课程-教师关系表 服务类
 * </p>
 *
 * @author itcast
 * @since 2023-02-11
 */
public interface CourseTeacherService extends IService<CourseTeacher> {

    /**
     * @return java.util.List<com.xuecheng.content.model.po.CourseTeacher>
     * @Author Miragic
     * @Description 查询教师
     * @Date 2023/9/9 11:35
     * @Param [courseId]
     **/
    List<CourseTeacher> getCourseTeacherList(Long courseId);

    /**
     * @return com.xuecheng.content.model.po.CourseTeacher
     * @Author Miragic
     * @Description 保存教师
     * @Date 2023/9/9 11:35
     * @Param [courseTeacher]
     **/
    CourseTeacher saveCourseTeacher(CourseTeacher courseTeacher);

    /**
     * @return void
     * @Author Miragic
     * @Description 删除教师
     * @Date 2023/9/9 11:36
     * @Param [courseId, teacherId]
     **/
    void deleteCourseTeacher(Long courseId, Long teacherId);

}
