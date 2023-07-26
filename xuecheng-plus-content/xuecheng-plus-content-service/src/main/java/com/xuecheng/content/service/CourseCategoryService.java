package com.xuecheng.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import com.xuecheng.content.model.po.CourseCategory;

import java.util.List;

/**
 * <p>
 * 课程分类 服务类
 * </p>
 *
 * @author itcast
 * @since 2023-02-11
 */
public interface CourseCategoryService extends IService<CourseCategory> {

    /**
     * @return java.util.List<com.xuecheng.content.model.dto.CourseCategoryTreeDto>
     * @Author Miragic
     * @Description 课程分类树形结构查询
     * @Date 00:03 2023/7/7
     * @Param [id]
     **/
    public List<CourseCategoryTreeDto> queryTreeNodes(String id);

}
