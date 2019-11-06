package com.comp.designmodel.structural.adaptation;

/**
 * @author Zouwx
 * @create 2019-11-06 22:08
 * @desc 5V电
 **/
public class DC5 implements Adapter{

   private AC220 ac220 = new AC220();

    @Override
    public void payByCard() {
        //电伏
        ac220.outputAC220V();
        //变压电伏中间操作
        System.out.println("电压变成了5v");

    }
}
