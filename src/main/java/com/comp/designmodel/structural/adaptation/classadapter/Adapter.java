package com.comp.designmodel.structural.adaptation.classadapter;

/**
 * @author Zouwx
 * @create 2019-11-06 21:53
 * @desc 适配者
 **/
public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        super.addpteeRequest();
    }
}
