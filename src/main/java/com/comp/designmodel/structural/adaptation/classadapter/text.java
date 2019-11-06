package com.comp.designmodel.structural.adaptation.classadapter;

/**
 * @author Zouwx
 * @create 2019-11-06 21:54
 * @desc 类适配器模式
 **/
public class text {

    public static void main(String[] args){
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        Target adapter = new Adapter();
        adapter.request();
    }
}
