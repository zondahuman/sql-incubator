package com.abin.lee.sql.incubator.group;

import sun.util.calendar.BaseCalendar;
import sun.util.calendar.Gregorian;
import sun.util.calendar.JulianCalendar;
import sun.util.calendar.LocalGregorianCalendar;

import java.util.Timer;

/**
 * Created by abin on 2018/3/19 18:36.
 * sql-incubator
 * com.abin.lee.sql.incubator.group
 */
public class GroupSorting {

    public static void main(String[] args) {
        System.out.println(System.nanoTime());
        System.out.println(System.currentTimeMillis());
        System.out.println(LocalGregorianCalendar.Date.TIME_UNDEFINED);
        System.out.println(Gregorian.getGregorianCalendar().getCalendarDate());
    }

}
