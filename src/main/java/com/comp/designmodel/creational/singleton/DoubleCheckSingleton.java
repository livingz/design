package com.comp.designmodel.creational.singleton;

/**
 * @author Zouwx
 * @create 2019-10-22 22:26
 * @desc 双重检查单例模式
 **/
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton singleton = null;

    private DoubleCheckSingleton(){
    }

    public DoubleCheckSingleton getSingleton(){
        synchronized (this){
            if(singleton==null){
                synchronized (this){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
