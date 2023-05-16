package com.jessie.edu.utils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * ClassName: ConnectionUtils
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-15 下午6:29   @Version 1.0        描述
 */
public class ConnectionUtils {

    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();  // 用于存储当前线程的连接对象

    public Connection getCurrentThreadConn() throws SQLException {
        Connection connection = threadLocal.get();
        if (connection == null) {
            // 从连接池获取连接并绑定到当前线程
            connection = DruidUtils.getInstance().getConnection();
            threadLocal.set(connection);
        }
        return connection;
    }
}
