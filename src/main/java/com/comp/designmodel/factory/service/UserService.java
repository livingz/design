package com.comp.designmodel.factory.service;

import java.sql.*;

/**
 * @author Zouwx
 * @create 2019-10-13 20:41
 * @desc
 **/
public class UserService {
    public Connection getConnection() throws ClassNotFoundException,
            SQLException {
        // 加载MySQL的JDBC的驱动
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "123456";

        // 创建与MySQL数据库的连接类的实例
        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Database connection established");
        return conn;
    }

    public void save() throws Exception {
        Connection conn = getConnection();

        try {
            // 禁用自动提交
            conn.setAutoCommit(false);

            System.out.println("默认的事务隔离级别:" + conn.getTransactionIsolation());

            // 用conn创建Statement对象类实例
            Statement sql_statement = conn.createStatement();

            // 插入数据
            sql_statement.executeUpdate("insert person values(10,'aabb', 88)");
            System.out.println("Insert success");

            //错误的插入
            sql_statement.executeUpdate("insert person values(11,'aabb', 'error')");
            System.out.println("Insert success");

            //提交事务
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (conn != null){
                //事务回滚
                conn.rollback();
            }
        } finally {
            if (conn != null) {
                // 关闭连接
                try {
                    conn.close();
                    System.out.println("Database connection terminated");
                } catch (Exception e) { /* ignore close errors */
                }
            }
        }

    }

    public void query() throws Exception {
        Connection conn = getConnection();
        try {
            // 用conn创建Statement对象类实例
            Statement sql_statement = conn.createStatement();

            // 执行查询，用ResultSet类的对象，返回查询的结果
            String query = "select * from person";
            ResultSet result = sql_statement.executeQuery(query);

            // 处理结果
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                String age = result.getString("age");

                System.out.println("id: " + id + " name: " + name + " age: " + age);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                // 关闭连接
                try {
                    conn.close();
                    System.out.println("Database connection terminated");
                } catch (Exception e) { /* ignore close errors */
                }
            }
        }
    }
}
