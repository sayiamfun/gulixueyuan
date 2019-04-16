package com.atguigu.gulixueyuan.edu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 课程和课程分类关联表
 * </p>
 *
 * @author liwenjie
 * @since 2018-12-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("edu_course_subject")
@ApiModel(value="CourseSubject对象", description="课程和课程分类关联表")
public class CourseSubject implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Long id;

    @ApiModelProperty(value = "课程id")
    @TableField("COURSE_ID")
    private Long courseId;

    @ApiModelProperty(value = "分类id")
    @TableField("SUBJECT_ID")
    private Long subjectId;


}
