package com.multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q1_JDBC {

    public static Connection conn = null;
    // SQL을 담는 객체
    public static Statement stmt = null;
    // select문의 결과 값을 받는 객체
    public static ResultSet rs = null;

    public static String driverClass = "com.mysql.cj.jdbc.Driver";
    //public static String url = "jdbc:mysql://localhost:3306/jdbc"; // localhost 자기자신
    public static String url = "jdbc:mysql://127.0.0.1:3306/project"; // 127.0.0.1 = loofback IP, 3306 = 포트주소
    public static String user = "root";
    public static String password = "root";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName(driverClass);
            System.out.println("1. 자바 연결함 DRIVER 설정 성공");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("2. MYSQL 연결 성공");

            System.out.print("deptno>>");
            int depno = sc.nextInt();
            sc.nextLine();

            System.out.print("deptname>>");
            String deptname = sc.nextLine();

            System.out.print("loc>>");
            String loc = sc.nextLine();

            conn.setAutoCommit(false);

            stmt = conn.createStatement();
            insert(depno, deptname, loc);

            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println("끝");
        }
    }

    private static void insert(int depno, String deptname, String loc) throws SQLException {
        System.out.println("3. SQL문 부품(객체)로 만들어주기 성공");

        String sql = String.format("INSERT INTO DEPT (deptno, dname, loc) VALUES (%d, '%s', '%s')",
                depno, deptname, loc);

        int result = stmt.executeUpdate(sql);

        if(result > 0){
            System.out.println("4. SQL문 MYSQL로 보내기 성공");
        }else{
            System.out.println("insert 실패!");
        }
        System.out.println("삽입 성공");
    }

}