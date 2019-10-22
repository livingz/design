package com.comp.designmodel.factory.abstracts;

/**
 * @author Zouwx
 * @create 2019-10-13 12:15
 * @desc 抽象工厂
 **/
public class textMain {

    public static void main(String[] args) {
        //申明小米产品工厂
        FactoryMobiler xiaoMi = new XiaoMiFactory();
        Phone xiaomiPh = xiaoMi.getPhone();
        Headset xiaoMiHead = xiaoMi.getHeadset();
        xiaomiPh.getPhone();
        xiaoMiHead.getHeadset();
    }
}
