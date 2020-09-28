package com.yeonji.sanggoe.plastic.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateObj {
    private static DateObj instance = null;
    private Calendar calendar = Calendar.getInstance();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");

    public static synchronized DateObj getInstance() {
        if (instance == null) {
            instance = new DateObj();
        }
        return instance;
    }

    @Override
    public String toString() {
        return dateFormat.format(calendar.getTime());
    }
}
