package nuigalway.app;

import org.junit.Test;
import org.joda.time.LocalDate;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class CourseProgrammeTest {

    public final String courseName = "Computer Science and Information Technology";
    public final String courseCode = "GY350";
    public final LocalDate courseStartDate = new LocalDate(2016,9,1);
    public final LocalDate courseEndDate =new LocalDate(2020,10,1);

    public CourseProgramme createCourseProgramme() {
        return new CourseProgramme(courseName, courseCode, courseStartDate, courseEndDate);
    }

    @Test
    public void testGetAndSetCourseName() {
        CourseProgramme c = createCourseProgramme();
        assertEquals(courseName, c.getName());
        String newCourseName = "Civil Engineering";
        c.setName(newCourseName);
        assertEquals(newCourseName, c.getName());
    }

    @Test
    public void testGetAndSetCourseCode() {
        CourseProgramme c = createCourseProgramme();
        assertEquals(courseCode, c.getCourseCode());
        String newCourseCode = "BA150";
        c.setCourseCode(newCourseCode);
        assertEquals(newCourseCode, c.getCourseCode());
    }

    @Test
    public void testGetAndSetCourseModules() {
        CourseProgramme c = createCourseProgramme();
        assertEquals(0, c.getModules().size());
        ArrayList<Module> modules = new ArrayList<>();
        Module m = new Module("Software Engineering", "CT417");
        modules.add(m);
        c.setModules(modules);
        assertEquals(1, c.getModules().size());
        c.addModule(m);
        assertEquals(2, c.getModules().size());
        c.removeModule(m);
        assertEquals(1, c.getModules().size());
    }

    @Test
    public void testGetAndSetStudentsTakingCourse() {
        CourseProgramme c = createCourseProgramme();
        assertEquals(0, c.getStudents().size());
        ArrayList<Student> students = new ArrayList<>();
        Student a = new Student("Marienella Gallo",
                new LocalDate(1998,2,25),
                16345993,
                c);
        students.add(a);
        c.setStudents(students);
        assertEquals(1, c.getStudents().size());
        c.addStudent(a);
        assertEquals(2, c.getStudents().size());
        c.removeStudent(a);
        assertEquals(1, c.getStudents().size());
    }

    @Test
    public void testGetAndSetStartDate() {
        CourseProgramme c = createCourseProgramme();
        assertEquals(courseStartDate, c.getStartDate());
        LocalDate newStartDate = new LocalDate(2019,10,01);
        c.setStartDate(newStartDate);
        assertEquals(newStartDate, c.getStartDate());
    }

    @Test
    public void testGetAndSetEndDate() {
        CourseProgramme c = createCourseProgramme();
        assertEquals(courseEndDate, c.getEndDate());
        LocalDate newEndDate = new LocalDate(2025,3,01);
        c.setEndDate(newEndDate);
        assertEquals(newEndDate, c.getEndDate());
    }
}
