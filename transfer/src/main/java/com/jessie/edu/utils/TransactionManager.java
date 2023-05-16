package com.jessie.edu.utils;

import java.sql.SQLException;

/**
 * ClassName: TransactionManager
 * Description: 事务管理器类：负责手动事务的开启、提交、回滚
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-15 下午6:28   @Version 1.0        描述
 */
public class TransactionManager {

    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    // 开启手动事务控制
    public void beginTransaction() throws SQLException {
        connectionUtils.getCurrentThreadConn().setAutoCommit(false);
    }

    // 提交事务
    public void commit() throws SQLException {
        connectionUtils.getCurrentThreadConn().commit();
    }

    // 回滚事务
    public void rollback() throws SQLException {
        connectionUtils.getCurrentThreadConn().rollback();
    }
}
