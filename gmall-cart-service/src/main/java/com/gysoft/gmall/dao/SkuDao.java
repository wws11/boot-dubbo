package com.gysoft.gmall.dao;

import com.gysoft.gmall.pojo.Sku;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 魏文思
 * @date 2019/8/20$ 19:56$
 */
@Mapper
public interface SkuDao {

    Sku getSku(Integer id);
}
