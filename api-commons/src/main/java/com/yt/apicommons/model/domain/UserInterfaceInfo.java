package com.yt.apicommons.model.domain;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户调用接口关系
 * @TableName user_interface_info
 */
@Data
public class UserInterfaceInfo implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 调用用户接口id
     */
    private Long userId;

    /**
     * 接口 id
     */
    private Long interfaceInfoId;

    /**
     * 总调用此时
     */
    private Integer totalNum;

    /**
     * 剩余调用次数
     */
    private Integer leftNum;

    /**
     * 0 - 正常, 1 - 禁用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除(0-未删除，1-删除)
     */
    private Integer isDelete;

    private static final long serialVersionUID = 1L;


}