var timetable = [];

function Course(code, name, type, startHour, startMinutes, endHour, endMinutes, lecturer, day) {
    this.code = code;
    this.name = name;
    this.type = type;
    this.startHour = startHour;
    this.startMinutes = startMinutes;
    this.endHour = endHour;
    this.endMinutes = endMinutes;
    this.lecturer = lecturer;
    this.day = day;
}

$("#course_form").submit(function() {

    var values = $(this).serialize();

    console.log(values);
});
