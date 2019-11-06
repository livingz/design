package com.comp.designmodel.structural.adaptation.objectadapte;

/**
 * @author Zouwx
 * @create 2019-11-06 21:53
 * @desc 适配者
 **/
public class Adapter implements Target {

    Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.addpteeRequest();
    }
}
