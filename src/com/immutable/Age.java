package com.immutable;

public class Age {
    private String month;
    private int day;
    private int year;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Age{" +
                "month='" + month + '\'' +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}
