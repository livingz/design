package com.comp.designmodel.creational.builder.standard;

/**
 * @author Zouwx
 * @create 2019-11-04 22:29
 * @desc 手机抽象建造者
 **/
public abstract class PhoneBuilder {

    //建造基本数据
    public abstract void builderName(String name);
    public abstract void builderStyle(String style);
    public abstract void builderCpu(String cpu);
    public abstract void builderRam(String ram);
    public abstract void builderPhysicalMemory(String physicalMemory);
    //建造手机
    public abstract Phone makePhone();
}
