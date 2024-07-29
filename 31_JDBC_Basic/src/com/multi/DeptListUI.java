package com.multi;

import java.util.ArrayList;

public class DeptListUI {

    public static void main(String[] args) {

        DeptDAO dao = new DeptDAO();

        ArrayList<DeptVO> al = dao.list();

        for (DeptVO deptVO : al) {
            System.out.println("검색결과 >> deptno = " + deptVO.getDeptno());
            System.out.println("검색결과 >> deptname = " + deptVO.getDname());
            System.out.println("검색결과 >> Loc = " + deptVO.getLoc());
            System.out.println("====================================");
        }
    }
}
