package com.multi;

import java.util.Scanner;

public class DeptOneUI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("deptNo>>");
        int n = sc.nextInt();

        DeptDAO dao = new DeptDAO();

        DeptVO deptVO = dao.one(n);

        System.out.println("검색결과 >> deptno = " + deptVO.getDeptno());
        System.out.println("검색결과 >> deptname = " + deptVO.getDname());
        System.out.println("검색결과 >> Loc = " + deptVO.getLoc());
    }
}
