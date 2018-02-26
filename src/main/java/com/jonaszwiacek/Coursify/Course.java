package com.jonaszwiacek.Coursify;

public class Course {
    String code;
    String name;
    CourseType type;
    int startHour;
    int startMinutes;
    int endHour;
    int endMinutes;
    String lecturer;
    Day day;

    public Course(String name, String type, String lecturer) {
        this.name = name;
        this.type = CourseType.valueOf(type);
        this.lecturer = lecturer;
        code();
    }

    public Course(String code, String name, String type, String lecturer) {
        this.code = code;
        this.name = name;
        this.type = CourseType.valueOf(type);
        this.lecturer = lecturer;
    }

    public Course() {

    }

    public void code() {
        this.code = this.name.trim().toLowerCase() + this.type + this.lecturer.trim().toLowerCase();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getStartMinutes() {
        return startMinutes;
    }

    public void setStartMinutes(int startMinutes) {
        this.startMinutes = startMinutes;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public int getEndMinutes() {
        return endMinutes;
    }

    public void setEndMinutes(int endMinutes) {
        this.endMinutes = endMinutes;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = Day.valueOf(day);
    }
/*
    @Override
    public String toString() {
        return this.code + " : " + this.name + " " + this.lecturer + "\n";
    }
*/
    public String toString() {
        return this.name;
    }
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }
}
