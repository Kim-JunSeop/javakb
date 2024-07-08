package com.multi.ex06.date;

import java.text.SimpleDateFormat;
import java.util.Date;

// 날짜 관련 Library
public class DateTest {
    public static void main(String[] args) {
        // Date : java 1.0 부터 날짜 Type 활용, Calendar와 병행 사용을 권장
        // -> 1.8 이후 LocalDateTime으로 교체되고 있다.
        // -> JSP사용 하는 레거시에는 활용 불가!

        java.util.Date date1 = new java.util.Date(); // 이게 정석적이다.
//        java.sql.Date date2 = new java.sql.Date();
        Date date = new Date();
        System.out.println(date); // 오늘날짜, Mon Jul 08 14:35:01 KST 2024 -> 미국식 포멧
        System.out.println(date.getTime()); // 1720416962869
        System.out.println(System.currentTimeMillis()); // 1720417025603
        // GMT -> 그리니치 표준시, 영국 : 0시, 우리나라 GMT+9, 9시간 시차 존재!
        // 1720417025603 -> 1970년 1월 1일 0시로부터 현재까지 흐른 ms 시차!

        Date date2 = new Date(System.currentTimeMillis()); // currentTimeMillis : OS 시스템의 현재 시간을 가져오는 메소드
        System.out.println(date2);

        // Date format 바꾸는 방법 ★★★★★
        // https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss.SSS");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시간 mm분 ss초");
        // 주의점! MM : 월, mm : 분

        System.out.println(sdf1.format(new Date()));
        System.out.println(sdf2.format(new Date()));
        System.out.println("--------------------------------------------------------");
    }

}