package com.hmx.ssm.demo1.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/5/31 20:47
 */
public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
