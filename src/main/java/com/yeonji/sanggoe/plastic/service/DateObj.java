package com.yeonji.sanggoe.plastic.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateObj {
    private Calendar calendar;
    private SimpleDateFormat dateFormat;



    public DateObj () {
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
    }

    @Override
    public String toString() {
        return dateFormat.format(calendar.getTime());
    }
}
