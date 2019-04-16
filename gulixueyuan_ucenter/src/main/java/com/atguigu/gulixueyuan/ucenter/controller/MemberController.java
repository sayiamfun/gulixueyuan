package com.atguigu.gulixueyuan.ucenter.controller;


import com.atguigu.entity.R;
import com.atguigu.gulixueyuan.ucenter.entity.Member;
import com.atguigu.gulixueyuan.ucenter.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 学员表 前端控制器
 * </p>
 *
 * @author liwenjie
 * @since 2018-12-17
 */
@CrossOrigin //跨域
@Api(description = "web端学员管理")
@RestController
@RequestMapping("/ucenter/member")
public class MemberController {

    @Autowired
    private MemberService memberService;


    @ApiModelProperty(value = "学员注册")
    @PostMapping
    public R register(Member member){
        memberService.save(member);
        return R.ok();
    }

}

