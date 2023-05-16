package com.jessie.edu.service.impl;

import com.jessie.edu.dao.AccountDao;
import com.jessie.edu.pojo.Account;
import com.jessie.edu.service.TransferService;

/**
 * ClassName: TransferServiceImpl
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-16 下午6:08   @Version 1.0        描述
 */
public class TransferServiceImpl implements TransferService {

    // 最佳状态
    private AccountDao accountDao;

    // 构造函数传值/set方法传值
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    @Override
    public void transfer(String fromCardNo, String toCardNo, int money) throws Exception {

        Account from = accountDao.queryAccountByCardNo(fromCardNo);
        Account to = accountDao.queryAccountByCardNo(toCardNo);

        from.setMoney(from.getMoney()-money);
        to.setMoney(to.getMoney()+money);

        accountDao.updateAccountByCardNo(to);
        int c = 1/0;
        accountDao.updateAccountByCardNo(from);

    }
}
