package com.xuecheng.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;
import com.xuecheng.content.model.po.Teachplan;

import java.util.List;

/**
 * <p>
 * 课程计划 服务类
 * </p>
 *
 * @author itcast
 * @since 2023-02-11
 */
public interface TeachplanService extends IService<Teachplan> {


    /**
     * @param courseId 课程id
     * @return List<TeachplanDto>
     * @description 查询课程计划树型结构
     * @author Mr.M
     * @date 2022/9/9 11:13
     */
    public List<TeachplanDto> findTeachplanTree(long courseId);

    /**
     * @return void
     * @Author Miragic
     * @Description 保存课程计划
     * @Date 2023/9/9 09:08
     * @Param [teachplanDto]
     **/
    public void saveTeachplan(SaveTeachplanDto teachplanDto);

    /**
     * @return void
     * @Author Miragic
     * @Description 删除课程计划
     * @Date 2023/9/9 10:05
     * @Param [teachplanId]
     **/
    void deleteTeachplan(Long teachplanId);

    /**
     * @return void
     * @Author Miragic
     * @Description 课程计划排序
     * @Date 2023/9/9 11:36
     * @Param [moveType, teachplanId]
     **/
    void orderByTeachplan(String moveType, Long teachplanId);
}
