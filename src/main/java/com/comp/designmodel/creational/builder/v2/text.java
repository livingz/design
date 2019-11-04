package com.comp.designmodel.creational.builder.v2;

/**
 * @author Zouwx
 * @create 2019-11-04 23:16
 * @desc
 **/
public class text {

    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder().builderName("一加")
                .builderStyle("蓝色")
                .builderCpu("晓龙855Plus").buid();

        System.out.println(phone);
    }

    StringBuffer stringBuffer = new StringBuffer("123").append("asd").append("sadf");

}
