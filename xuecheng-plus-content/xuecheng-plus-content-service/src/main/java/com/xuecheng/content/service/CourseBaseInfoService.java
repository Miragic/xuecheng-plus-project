package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.EditCourseDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @Description 课程基本信息管理业务接口
 * @Author Miragic
 * @Date 2023/5/30 17:11
 * @Version 1.0
 **/
public interface CourseBaseInfoService {

    /**
     * @return com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase>
     * @Author 课程查询接口
     * @Description
     * @Date 17:17 2023/5/30
     * @Param [pageParams, queryCourseParamsDto]
     **/
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    /**
     * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
     * @Author Miragic
     * @Description 新增课程基本信息
     * @Date 16:40 2023/7/16
     * @Param [companyId, addCourseDto]
     **/
    CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);

    /**
     * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
     * @Author Miragic
     * @Description 根据课程id查询课程基本信息，包括基本信息和营销信息
     * @Date 2023/9/8 15:24
     * @Param [courseId]
     **/
    CourseBaseInfoDto getCourseBaseInfo(long courseId);

    /**
     * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
     * @Author Miragic
     * @Description 修改课程信息
     * @Date 2023/9/8 16:41
     * @Param [companyId, editCourseDto]
     **/
    CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto editCourseDto);

    /**
     * @return void
     * @Author Miragic
     * @Description 删除课程
     * @Date 2023/9/9 11:41
     * @Param [companyId, courseId]
     **/
    void deleteCourse(Long companyId, Long courseId);
}
