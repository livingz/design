package com.comp.designmodel.structural.fiyweight;

/**
 * @author Zouwx
 * @create 2019-11-23 15:02
 * @desc 经理类
 **/
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    private String deparment;
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String deparment) {
        this.deparment = deparment;
    }
}
