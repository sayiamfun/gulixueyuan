package com.atguigu.gulixueyuan.edu.service.impl;

import com.atguigu.gulixueyuan.edu.entity.Comment;
import com.atguigu.gulixueyuan.edu.mapper.CommentMapper;
import com.atguigu.gulixueyuan.edu.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课程评论 服务实现类
 * </p>
 *
 * @author liwenjie
 * @since 2018-12-18
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
