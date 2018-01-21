package com.jonaszwiacek.Coursify;

public class CourseHours {
    int day;
    Time startTime;
    Time endTime;
    Time duration;

    public CourseHours(int startHour, int startMinutes, int endHour, int endMinutes, int day) {
        this.startTime = new Time(startHour, startMinutes);
        this.endTime = new Time(endHour, endMinutes);
        this.day = day;
        this.duration = startTime.duration(endTime);
    }

    public int getDay() {
        return day;
    }
}
