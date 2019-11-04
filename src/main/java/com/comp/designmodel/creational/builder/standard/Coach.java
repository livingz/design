package com.comp.designmodel.creational.builder.standard;

/**
 * @author Zouwx
 * @create 2019-11-04 22:37
 * @desc 教练类
 **/
public class Coach {

    private PhoneBuilder phoneBuilder;

    public Coach(){

    }
    public Coach(PhoneBuilder phoneBuilder){
        this.phoneBuilder = phoneBuilder;
    }

    public void setPhoneBuilder(PhoneBuilder phoneBuilder){
        this.phoneBuilder = phoneBuilder;
    }

    public Phone getPhoneBuilder(String name,String style,String cpu,String ram,String physicalMemory){
        this.phoneBuilder.builderName(name);
        this.phoneBuilder.builderStyle(style);
        this.phoneBuilder.builderCpu(cpu);
        this.phoneBuilder.builderRam(ram);
        this.phoneBuilder.builderPhysicalMemory(physicalMemory);
        return phoneBuilder.makePhone();
    }


}
