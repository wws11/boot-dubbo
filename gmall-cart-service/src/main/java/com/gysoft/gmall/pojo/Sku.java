package com.gysoft.gmall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 魏文思
 * @date 2019/8/20$ 19:38$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sku implements Serializable {
private Integer id;
private  String skuName;
private  String skuCount;
}
