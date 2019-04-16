package com.atguigu.gulixueyuan.edu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
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
 * 课程评论
 * </p>
 *
 * @author liwenjie
 * @since 2018-12-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("edu_comment")
@ApiModel(value="Comment对象", description="课程评论")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "评论ID")
    @TableId("COMMENT_ID")
    private Long commentId;

    @ApiModelProperty(value = "用户id")
    @TableField("MEMBER_ID")
    private Long memberId;

    @ApiModelProperty(value = "父级评论id(为0则是一级评论,不为0则是回复)")
    @TableField("PARENT_ID")
    private Long parentId;

    @ApiModelProperty(value = "评论内容")
    @TableField("CONTENT")
    private String content;

    @ApiModelProperty(value = "评论的相关id")
    @TableField("COURSE_ID")
    private Long courseId;

    @ApiModelProperty(value = "点赞数量")
    @TableField("PRAISE_COUNT")
    private Long praiseCount;

    @ApiModelProperty(value = "回复数量")
    @TableField("REPLY_COUNT")
    private Long replyCount;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private Date createTime;


}
