package com.atguigu.gulixueyuan.ucenter.service;

import com.atguigu.entity.PageResult;
import com.atguigu.gulixueyuan.ucenter.entity.Member;
import com.atguigu.gulixueyuan.ucenter.entity.query.QueryMember;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * <p>
 * 学员表 服务类
 * </p>
 *
 * @author liwenjie
 * @since 2018-12-17
 */

public interface MemberService extends IService<Member> {

    void pageQuery(Page<Member> page, QueryMember queryMember);

    List<String> batchImport(MultipartFile file, Integer mark) throws Exception;
}
