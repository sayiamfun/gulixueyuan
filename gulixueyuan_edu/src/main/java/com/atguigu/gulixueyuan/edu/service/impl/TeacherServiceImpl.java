package com.atguigu.gulixueyuan.edu.service.impl;

import com.atguigu.gulixueyuan.edu.entity.Teacher;
import com.atguigu.gulixueyuan.edu.entity.query.QueryTeacher;
import com.atguigu.gulixueyuan.edu.mapper.TeacherMapper;
import com.atguigu.gulixueyuan.edu.service.TeacherService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * <p>
 * 讲师 服务实现类
 * </p>
 *
 * @author liwenjie
 * @since 2018-12-18
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

    @Override
    public void pageQuery(Page<Teacher> pageParam, QueryTeacher queryTeacher) {
        String name = queryTeacher.getName();
        Integer level = queryTeacher.getLevel();
        Date begin = queryTeacher.getBegin();
        Date end = queryTeacher.getEnd();
        QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();
        if(!StringUtils.isEmpty(name)){
            queryWrapper.eq("NAME", name);
        }
        if(!StringUtils.isEmpty(level)){
            queryWrapper.eq("LEVEL", level);
        }
         if(!StringUtils.isEmpty(begin)){
            queryWrapper.ge("CREATE_TIME", begin);
        }
         if(!StringUtils.isEmpty(end)){
            queryWrapper.le("CREATE_TIME", end);
        }
        baseMapper.selectPage(pageParam, queryWrapper);

    }
}
