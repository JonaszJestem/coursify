import com.jonaszwiacek.Coursify.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {
    Timetable timetable;
    Course dummyCourse, dummyCourse2;

    @Before
    public void setUpDummyTimetable() {
        dummyCourse = new Course("code1", "name1", "LABORATORY", "lecturer1");
        dummyCourse2 = new Course("code2", "name2", "SEMINARY", "lecturer2");
        timetable = new Timetable();
        timetable.add(dummyCourse);
        timetable.add(dummyCourse2);
    }

    @Test
    public void shouldAllowToAddCoursesToTimetable() {
        assertEquals("Wrong courses codes", timetable.getCourseCodes(), "code1, code2");
        assertEquals("Wrong number of courses added", timetable.getNumberOfCourses(), 2);
    }

    @Test
    public void shouldAllowToRemoveCoursesFromTimetable() {
        timetable.remove("code1");
        assertEquals("Wrong courses codes", timetable.getCourseCodes(), "code2");
        assertEquals("Wrong number of courses", timetable.getNumberOfCourses(), 1);

        timetable.remove("code2");
        assertEquals("Wrong courses codes", timetable.getCourseCodes(), "");
        assertEquals("Wrong number of courses", timetable.getNumberOfCourses(), 0);
    }
}
