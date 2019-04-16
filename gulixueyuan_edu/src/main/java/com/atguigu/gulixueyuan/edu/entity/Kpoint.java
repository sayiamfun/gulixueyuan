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
 * 课程节点(章节)
 * </p>
 *
 * @author liwenjie
 * @since 2018-12-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("edu_kpoint")
@ApiModel(value="Kpoint对象", description="课程节点(章节)")
public class Kpoint implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "节点id")
    @TableId("KPOINT_ID")
    private String kpointId;

    @ApiModelProperty(value = "课程id")
    @TableField("COURSE_ID")
    private Long courseId;

    @ApiModelProperty(value = "父级ID")
    @TableField("PARENT_ID")
    private Long parentId;

    @ApiModelProperty(value = "节点名称")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "节点类型 0文件目录 1视频")
    @TableField("KPOINT_TYPE")
    private Integer kpointType;

    @ApiModelProperty(value = "显示排序")
    @TableField("SORT")
    private Integer sort;

    @ApiModelProperty(value = "播放次数")
    @TableField("PLAY_COUNT")
    private Long playCount;

    @ApiModelProperty(value = "是否可以试听：0免费 1收费")
    @TableField("IS_FREE")
    private Boolean isFree;

    @ApiModelProperty(value = "视频地址")
    @TableField("VIDEO_URL")
    private String videoUrl;

    @ApiModelProperty(value = "播放时间")
    @TableField("PLAY_TIME")
    private String playTime;

    @ApiModelProperty(value = "视频类型")
    @TableField("VIDEO_TYPE")
    private String videoType;

    @ApiModelProperty(value = "VIDEO视频 AUDIO音频 FILE文档 TXT文本 ATLAS图片集")
    @TableField("FILE_TYPE")
    private String fileType;

    @ApiModelProperty(value = "更新时间")
    @TableField("UPDATE_TIME")
    private Date updateTime;

    @ApiModelProperty(value = "添加时间")
    @TableField("CREATE_TIME")
    private Date createTime;


}
