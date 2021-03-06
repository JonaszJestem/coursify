package com.jonaszwiacek.Coursify;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Timetable {
    List<Course> courseList;

    public Timetable() {
        courseList = new ArrayList<>();
    }

    public void add(Course course) {
        courseList.add(course);
    }

    public String getCourseNames() {
        return courseList.stream().map(Course::getName).collect(Collectors.joining(", "));
    }

    public String getCourseCodes() {
        return courseList.stream().map(Course::getCode).collect(Collectors.joining(", "));
    }

    public int getNumberOfCourses() {
        return courseList.size();
    }

    public void remove(String code) {
        courseList.removeIf(course -> course.getCode().equalsIgnoreCase(code));
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Map<String, List<Course>> getCourseGroups() {
        return this.getCourseList().stream().collect(Collectors.groupingBy(Course::getName));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Courses: \n");
        courseList.forEach(course -> sb.append(
                course.getName() + " "
  //              + course.getStartTime() + " - "
    //            + course.getEndTime() + " "
//                + course.getDay()
        + "\n"
        ));
        return sb.toString();
    }
}
