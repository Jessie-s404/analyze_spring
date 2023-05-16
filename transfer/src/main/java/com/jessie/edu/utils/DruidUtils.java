package com.jessie.edu.utils;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * ClassName: DruidUtils
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-15 下午6:35   @Version 1.0        描述
 */
public class DruidUtils {

    private DruidUtils() {

    }

    private static DruidDataSource druidDataSource = new DruidDataSource();

    static {
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/bank");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
    }

    public static DruidDataSource getInstance() {
        return druidDataSource;
    }
}
