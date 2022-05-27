package com.example.javacourse2.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        today.DaysInfo();
        System.out.println(today.weekDay);
        WeekDays w1 = WeekDays.FRIDAY;
        WeekDays w2 = WeekDays.SUNDAY;
        WeekDays w3 = WeekDays.TUESDAY;
        System.out.println(WeekDays.FRIDAY.equals(WeekDays2.FRIDAY));//false

        WeekDays w4 = WeekDays.valueOf("FRIDAY");

        WeekDays[] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }
}

@AllArgsConstructor
enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("soso"),
    THURSDAY("better"),
    FRIDAY("good"),
    SATURDAY("happy"),
    SUNDAY("soso");

    private String mood;

    public String getMood() {
        return mood;
    }
}

enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

@Data
@AllArgsConstructor
class Today {
    WeekDays weekDay;

    void DaysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("WORK");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("WeeKEND");
                break;
        }
        System.out.println("nastrouha :" + weekDay.getMood());
    }
}
