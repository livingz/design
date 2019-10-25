package com.comp.designmodel.singleton;

/**
 * @author Zouwx
 * @create 2019-10-22 22:16
 * @desc 懒汉式单例模式
 **/
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){
    }

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton =  new LazySingleton();
        }
        return lazySingleton;
    }

}
