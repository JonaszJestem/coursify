package com.jonaszwiacek.Coursify;

public class Time {
    int hour;
    int minutes;

    public Time(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    Time duration(Time other) {
        return new Time(this.hour - other.hour, this.minutes - other.minutes);
    }

    @Override
    public boolean equals(Object obj) {
        if((obj instanceof Time)) {
            Time other = (Time) obj;
            if(other.hour == this.hour && other.minutes == this.minutes) return true;
        }
        return false;
    }
}