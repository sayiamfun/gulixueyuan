package com.atguigu.gulixueyuan.edu.controller.admin;

import com.atguigu.entity.PageResult;
import com.atguigu.entity.R;
import com.atguigu.gulixueyuan.edu.entity.Teacher;
import com.atguigu.gulixueyuan.edu.entity.query.QueryTeacher;
import com.atguigu.gulixueyuan.edu.service.TeacherService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(description="讲师管理")
@CrossOrigin //跨域
@RestController
@RequestMapping("/admin/edu/teacher")
public class AdminTeacherController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "分页讲师列表")
    @PostMapping(value = "{pageNum}/{size}")
    public R pageQuery(
            @ApiParam(name = "pageNum", value = "当前页码", required = true)
            @PathVariable Long pageNum,

            @ApiParam(name = "size", value = "每页记录数", required = true)
            @PathVariable Long size,

            @ApiParam(name = "queryTeacher", value = "查询对象", required = false)
            @RequestBody QueryTeacher queryTeacher){

        Page<Teacher> pageParam = new Page<Teacher>(pageNum, size);

        teacherService.pageQuery(pageParam, queryTeacher);
        PageResult<Teacher> result = new PageResult<Teacher>(pageParam.getTotal(), pageParam.getRecords());

        return  R.ok().data(result);
    }

    @ApiOperation(value = "根据ID删除讲师")
    @DeleteMapping(value = "{teacherId}")
    public R deleteById(
            @ApiParam(name = "teacherId", value = "讲师ID", required = true)
            @PathVariable String teacherId){
        teacherService.removeById(teacherId);
        return R.ok();
    }

    @ApiOperation(value = "根据ID查询讲师")
    @GetMapping(value = "{teacherId}")
    public R getById(
            @ApiParam(name = "teacherId", value = "讲师ID", required = true)
            @PathVariable String teacherId){
        Teacher teacher = teacherService.getById(teacherId);
        return R.ok().data(teacher);
    }

    @ApiOperation(value = "新增讲师")
    @PostMapping
    public R save(
            @ApiParam(name = "teacher", value = "讲师对象", required = true)
            @RequestBody Teacher teacher){
        teacherService.save(teacher);
        return R.ok();
    }

    @ApiOperation(value = "根据ID修改讲师")
    @PutMapping(value = "{teacherId}")
    public R updateById(
            @ApiParam(name = "teacherId", value = "讲师ID", required = true)
            @PathVariable String teacherId,

            @ApiParam(name = "teacher", value = "讲师对象", required = true)
            @RequestBody Teacher teacher){

        teacher.setTeacherId(teacherId);
        teacherService.updateById(teacher);
        return R.ok();
    }
}
