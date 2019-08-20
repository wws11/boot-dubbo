package com.gysoft.gmall.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户地址
 *
 * @author lfy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress implements Serializable {
    @ApiModelProperty("主键id")
    private Integer id;
    @ApiModelProperty("用户地址")
    private String userAddress; //用户地址
    @ApiModelProperty("用户id")
    private String userId; //用户id
    @ApiModelProperty("收货人")
    private String consignee; //收货人
    @ApiModelProperty("电话号码")
    private String phoneNum; //电话号码
    @ApiModelProperty("是否为默认地址")
    private String isDefault; //是否为默认地址    Y-是     N-否


}
