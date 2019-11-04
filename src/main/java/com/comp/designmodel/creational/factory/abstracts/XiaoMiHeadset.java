package com.comp.designmodel.creational.factory.abstracts;

/**
 * @author Zouwx
 * @create 2019-10-22 21:22
 * @desc 小米耳机工厂
 **/
public class XiaoMiHeadset extends Headset{
    @Override
    public void getHeadset() {
        System.out.println("小米耳机出厂了");
    }
}
