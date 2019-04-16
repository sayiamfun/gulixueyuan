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
 * 课程播放记录(学习记录)
 * </p>
 *
 * @author liwenjie
 * @since 2018-12-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("edu_study_history")
@ApiModel(value="StudyHistory对象", description="课程播放记录(学习记录)")
public class StudyHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId("STUDY_HISTORY_ID")
    private String studyHistoryId;

    @ApiModelProperty(value = "用户id")
    @TableField("USER_ID")
    private Long userId;

    @ApiModelProperty(value = "课程id")
    @TableField("COURSE_ID")
    private Long courseId;

    @ApiModelProperty(value = "节点id")
    @TableField("KPOINT_ID")
    private Long kpointId;

    @ApiModelProperty(value = "观看次数,累加")
    @TableField("PLAYERCOUNT")
    private Long playercount;

    @ApiModelProperty(value = "课程名称")
    @TableField("COURSE_NAME")
    private String courseName;

    @ApiModelProperty(value = "节点名称")
    @TableField("KPOINT_NAME")
    private String kpointName;

    @ApiModelProperty(value = "playercount小于20时记录,备注观看的时间，叠加")
    @TableField("DATABACK")
    private String databack;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private Date createTime;

    @ApiModelProperty(value = "最后观看时间")
    @TableField("UPDATE_TIME")
    private Date updateTime;


}
