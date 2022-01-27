package com.example.wwm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author weiming wu
 * @date 2022/1/26 11:44
 */

@ApiModel(value = "返回的实体类")
@Data
public class ResultModel {

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("性别")
    private String sex;

    @ApiModelProperty("电话号码")
    private String phone;

}
