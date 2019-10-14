package com.comp.designmodel.factory.mothed;

/**
 * @author Zouwx
 * @create 2019-10-13 11:57
 * @desc 苹果手机工厂实现类
 **/
public class IPhone extends Phone {

    @Override
    public void getPhone() {
        System.out.println("生成苹果手机");
    }
}
