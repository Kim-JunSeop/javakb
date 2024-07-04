package com.multi.enum_exam;

import java.util.HashMap;
import java.util.Map;

public enum Week3 {
    MONDAY("월",1), TUESDAY("화",2), WEDNESDAY("수",3),
    THURSDAY("목",4), FRIDAY("금",5), SATURDAY("토",6),
    SUNDAY("일",7);

    public static Map<String,Week3> map = new HashMap();

    private final String day;
    private final int order;


    Week3(String day, int order) {
        this.day = day;
        this.order = order;
    }

    public String getDay() {
        return day;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Week3{" +
                "day='" + day + '\'' +
                ", order=" + order +
                '}';
    }
}
