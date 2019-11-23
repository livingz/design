package com.comp.designmodel.structural.fiyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zouwx
 * @create 2019-11-23 15:04
 * @desc 员工工厂
 **/
public class EmployeeFactory {

    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String deparment){
        Manager manager = (Manager) EMPLOYEE_MAP.get(deparment);
        if(manager == null){
            manager = new Manager(deparment);
            System.out.println("创建报告"+deparment);
            manager.setReportContent("报告的内容是。。。。。。。。");
            System.out.println("创建部门经理:"+deparment);
            EMPLOYEE_MAP.put(deparment,manager);
        }
        return  manager;
    }
}
