package com.comp.designmodel.creational.builder.standard;

/**
 * @author Zouwx
 * @create 2019-11-04 22:26
 * @desc 手机实体类
 **/
public class Phone {

    private String name;
    private String style;
    private String cpu;
    private String ram;
    private String physicalMemory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPhysicalMemory() {
        return physicalMemory;
    }

    public void setPhysicalMemory(String physicalMemory) {
        this.physicalMemory = physicalMemory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", physicalMemory='" + physicalMemory + '\'' +
                '}';
    }
}
