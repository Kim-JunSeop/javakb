package com.multi.enum_exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _run {
    public static void main(String[] args) {
        EnumBasic enumValue = EnumBasic.VALUE2;

        System.out.println("enumValue = " + enumValue);
        System.out.println(enumValue.name());
        System.out.println(enumValue.ordinal());
        System.out.println(enumValue.getStringValue());
        System.out.println(enumValue.getIntValue());

        for (EnumBasic e : EnumBasic.values()){
            System.out.println(e.name());
        }
        EnumBasic enumValue1 = EnumBasic.VALUE1;
        EnumBasic enumValue2 = EnumBasic.VALUE2;

        System.out.println(enumValue1 == EnumBasic.VALUE1);
        System.out.println(enumValue2 == enumValue2);

        System.out.println(enumValue1.compareTo(EnumBasic.VALUE2));
        System.out.println(enumValue2.compareTo(enumValue2));

        System.out.println(Arrays.toString(Week1.values()));
        System.out.println(Arrays.toString(Week2.values()));
        System.out.println(Arrays.toString(Week3.values()));

        List<Week3> list = new ArrayList<>();
        list.add(Week3.THURSDAY);
        list.add(Week3.MONDAY);
        list.add(Week3.TUESDAY);
        list.add(Week3.SUNDAY);

        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        System.out.println("list = " + list);

        list.sort((o1, o2) -> o1.getOrder() - o2.getOrder());
        System.out.println("list = " + list);
    }
}

