package com.jessie.edu.service;

/**
 * ClassName: TransferService
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-16 下午6:06   @Version 1.0        描述
 */
public interface TransferService {

    void transfer(String fromCardNo, String toCardNo, int money) throws Exception;
}
