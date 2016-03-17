package com.brainacad.oop.testenum1;

public enum MyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public MyDayOfWeek nextDay(){
        int inputDay = this.ordinal();
        if(inputDay == SATURDAY.ordinal()){
            return SUNDAY;
        } else return MyDayOfWeek.values()[inputDay+1];
    }
}
