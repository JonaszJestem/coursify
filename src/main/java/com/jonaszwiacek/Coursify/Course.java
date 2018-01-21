package com.jonaszwiacek.Coursify;

public class Course {
    String code;
    String name;
    CourseType type;
    CourseHours hours;
    String lecturer;


    public Course(String name, String type, String lecturer) {
        this.name = name;
        this.type = CourseType.valueOf(type);
        this.lecturer = lecturer;
        this.code = code(name,type,lecturer);
    }

    public Course(String code, String name, String type, String lecturer) {
        this.code = code;
        this.name = name;
        this.type = CourseType.valueOf(type);
        this.lecturer = lecturer;
    }

    public Course() {

    }

    private String code(String name, String type, String lecturer) {
        System.out.println("Coding...");
        return name.trim().toLowerCase() + type + lecturer.trim().toLowerCase();
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

    public Time getStartTime() {
        return hours.startTime;
    }

    public Time getEndTime() {
        return hours.endTime;
    }

    public void setHours(int startHour, int startMinutes, int endHour, int endMinutes, int day) {
        this.hours = new CourseHours(startHour,startMinutes,endHour,endMinutes, day);
    }

    public int getDay() {
        return hours.getDay();
    }

    @Override
    public String toString() {
        return this.code + " : " + this.name + " " + this.lecturer + "\n";
    }
}
