package com.atguigu.gulixueyuan.edu.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 讲师
 * </p>
 *
 * @author liwenjie
 * @since 2018-12-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("edu_teacher")
@ApiModel(value="Teacher对象", description="讲师")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "教师ID")
    @TableId("TEACHER_ID")
    private String teacherId;

    @ApiModelProperty(value = "教师名称")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "教师资历,一句话说明老师")
    @TableField("INTRO")
    private String intro;

    @ApiModelProperty(value = "教师简介")
    @TableField("CAREER")
    private String career;

    @ApiModelProperty(value = "头衔 1高级讲师 2首席讲师")
    @TableField("LEVEL")
    private Integer level;

    @ApiModelProperty(value = "图片路径")
    @TableField("PIC_PATH")
    private String picPath;

    @ApiModelProperty(value = "排序")
    @TableField("SORT")
    private Integer sort;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "CREATE_TIME", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(value = "UPDATE_TIME", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "逻辑删除 1已删除 0未删除", hidden = true)
    @TableLogic
    @TableField(value = "DELETED", fill = FieldFill.INSERT)
    private Boolean deleted;


}
