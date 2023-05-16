package com.jessie.edu.dao;

import com.jessie.edu.pojo.Account;

/**
 * ClassName: AccountDao
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-15 下午4:30   @Version 1.0        描述
 */
public interface AccountDao {

    Account queryAccountByCardNo(String cardNo) throws Exception;

    int updateAccountByCardNo(Account account) throws Exception;
}
