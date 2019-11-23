package com.comp.designmodel.structural.fiyweight;

/**
 * @author Zouwx
 * @create 2019-11-23 15:33
 * @desc 应用层代码
 **/
public class test {

    private static final String deparments[] = {"RD","QA","PM","AC"};

    public static void main(String[] args){

        for (int i = 0 ;i<10; i++) {
            String deparment = deparments[(int)(Math.random()*deparments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(deparment);
            manager.report();
        }

    }
}
