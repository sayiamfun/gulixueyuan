package com.atguigu.gulixueyuan.edu.service;

import com.atguigu.gulixueyuan.edu.entity.Teacher;
import com.atguigu.gulixueyuan.edu.entity.query.QueryTeacher;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author liwenjie
 * @since 2018-12-18
 */
public interface TeacherService extends IService<Teacher> {

    void pageQuery(Page<Teacher> pageParam, QueryTeacher queryTeacher);
}
