package com.atguigu.gulixueyuan.ucenter.controller.admin;


import com.atguigu.entity.PageResult;
import com.atguigu.entity.R;
import com.atguigu.gulixueyuan.ucenter.entity.Member;
import com.atguigu.gulixueyuan.ucenter.entity.query.QueryMember;
import com.atguigu.gulixueyuan.ucenter.service.MemberService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
@Api(description = "admin端学员管理")
@RestController
@RequestMapping("/admin/ucenter/member")
public class AdminMemberController {

    @Autowired
    private MemberService memberService;

    @ApiModelProperty(value = "批量添加学员")
    @PostMapping("import")
    public R addUser(@RequestParam("file") MultipartFile file,
                     @RequestParam("mark") Integer mark) throws Exception {
        System.err.println(file.getOriginalFilename()+"   "+mark);
        List<String> msg = memberService.batchImport(file, mark);
        if(msg.size() == 0){
            return R.ok().message("批量开通成功");
        }else{
            return R.error().message("批量开通失败").data(msg);
        }
    }

    @ApiModelProperty(value = "查询所有学员列表")
    @GetMapping
    public R list(){
        List<Member> memberList = memberService.list(null);
        return R.ok().data(memberList);
    }

    @ApiModelProperty(value = "根据id删除学员")
    @DeleteMapping("{memberId}")
    public R deleteById(@PathVariable Long memberId){
        memberService.removeById(memberId);
        return R.ok();
    }

    @ApiOperation(value = "分页学员列表")
    @PostMapping(value = "{pageNum}/{size}")
    public R pageQuery(
            @ApiParam(name = "searchObj", value = "查询条件", required = true)
            @RequestBody QueryMember searchObj,

            @ApiParam(name = "pageNum", value = "当前页码", required = true)
            @PathVariable Long pageNum,

            @ApiParam(name = "size", value = "每页记录数", required = true)
            @PathVariable Long size){

        Page<Member> page = new Page<>(pageNum, size);
        memberService.pageQuery(page, searchObj);
        PageResult<Member> pageResult = new PageResult<>(page.getTotal(), page.getRecords());
        return R.ok().data(pageResult);
    }


}

