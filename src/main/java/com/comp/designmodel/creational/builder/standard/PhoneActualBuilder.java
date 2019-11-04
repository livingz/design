package com.comp.designmodel.creational.builder.standard;

/**
 * @author Zouwx
 * @create 2019-11-04 22:33
 * @desc 手机实际构造者
 **/
public class PhoneActualBuilder extends PhoneBuilder {

    Phone phone = new Phone();

    @Override
    public void builderName(String name) {
        phone.setName(name);
    }

    @Override
    public void builderStyle(String style) {
        phone.setStyle(style);
    }

    @Override
    public void builderCpu(String cpu) {
        phone.setCpu(cpu);
    }

    @Override
    public void builderRam(String ram) {
        phone.setRam(ram);
    }

    @Override
    public void builderPhysicalMemory(String physicalMemory) {
        phone.setPhysicalMemory(physicalMemory);
    }

    @Override
    public Phone makePhone() {
        return this.phone;
    }
}
