package com.multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {

    public static Connection conn = null;
    public static PreparedStatement pstmt = null;
    public static ResultSet rs = null;

    public static String user = "root";
    public static String password = "root";
    public static String driverclass = "com.mysql.cj.jdbc.Driver";
    public static String url = "jdbc:mysql://localhost:3306/school2";


    public DeptVO one(int deptNo) {

        try {
            Class.forName(driverclass);
            conn = DriverManager.getConnection(url, user, password);

            String sql = "select * from dept where deptno = ?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, deptNo);

            rs = pstmt.executeQuery();
            DeptVO dept = new DeptVO();

            if (rs.next()) {
                dept.setDeptno(rs.getInt("deptno"));
                dept.setDname(rs.getString("dname"));
                dept.setLoc(rs.getString("loc"));
            }

            return dept;


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;


    }

    public ArrayList<DeptVO> list() {

        try {
            ArrayList<DeptVO> list = new ArrayList<>();

            Class.forName(driverclass);
            conn = DriverManager.getConnection(url, user, password);
            String sql = "select * from dept";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                DeptVO dept = new DeptVO();
                dept.setDeptno(rs.getInt("deptno"));
                dept.setDname(rs.getString("dname"));
                dept.setLoc(rs.getString("loc"));
                list.add(dept);
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}


