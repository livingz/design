package com.comp.designmodel.structural.adaptation.objectadapte;

/**
 * @author Zouwx
 * @create 2019-11-06 21:52
 * @desc
 **/
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("实现Target");
    }
}
