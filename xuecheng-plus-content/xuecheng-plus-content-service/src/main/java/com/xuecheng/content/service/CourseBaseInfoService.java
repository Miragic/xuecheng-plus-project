package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
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
}
