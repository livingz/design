package com.comp.designmodel.creational.builder.standard;

/**
 * @author Zouwx
 * @create 2019-11-04 22:44
 * @desc
 **/
public class text {

    public static void main(String[] args) {

        Coach coach = new Coach(new PhoneActualBuilder());
        Phone phone = coach.getPhoneBuilder("一加","蓝色","晓龙855","8G","256G");
        System.out.println(phone);
    }
}
