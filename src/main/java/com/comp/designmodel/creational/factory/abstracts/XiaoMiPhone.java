package com.comp.designmodel.creational.factory.abstracts;

/**
 * @author Zouwx
 * @create 2019-10-22 21:21
 * @desc 小米手机产品工厂
 **/
public class XiaoMiPhone extends Phone{
    @Override
    public void getPhone() {
        System.out.println("小米手机出厂了");
    }
}
