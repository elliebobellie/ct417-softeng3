package nuigalway.app;

import org.junit.Test;
import org.joda.time.LocalDate;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class StudentTest {

    public final String studentName = "Ella Gallo";
    public final LocalDate studentDob = new LocalDate(1998,02,25);
    public final int studentAge = 21;
    public final String studentUsername = "EllaGallo21";
    public final int studentID = 16345993;
    public final String courseName = "Computer Science and Information Technology";
    public final String courseCode = "GY350";
    public final LocalDate courseStartDate = new LocalDate(2016,9,1);
    public final LocalDate courseEndDate =new LocalDate(2020,10,1);
    public final CourseProgramme studentCourse = new CourseProgramme(courseName, courseCode, courseStartDate, courseEndDate);

    public Student createStudent() {
        Student a = new Student(studentName,
                studentDob,
                studentID,
                studentCourse);
        return a;
    }

    @Test
    public void testGetAndSetStudentName() {
        Student a = createStudent();
        assertEquals(studentName, a.getName());
        a.setName("marienella gallo");
        assertEquals("marienella gallo", a.getName());
    }

    @Test
    public void testGetAndSetStudentDob() {
        Student a = createStudent();
        assertEquals(studentAge, a.getAge());
        assertEquals(studentDob, a.getDob());
        LocalDate newDob = new LocalDate(2000, 01,01);
        a.setDob(newDob);
        assertEquals(19, a.getAge());
        assertEquals(newDob, a.getDob());
    }

    @Test
    public void testGetAndSetStudentId() {
        Student a = createStudent();
        assertEquals(studentID, a.getId());
        long newid = 17000223;
        a.setId(newid);
        assertEquals(newid, a.getId());
    }

    @Test
    public void testGetAndSetStudentCourse() {
        Student a = createStudent();
        assertEquals(studentCourse, a.getCourse());
        CourseProgramme newcourse = new CourseProgramme("Nursing",
                "NS3",
                new LocalDate(2019,9,01),
                new LocalDate(22,10,01));
        a.setCourse(newcourse);
        assertEquals(newcourse, a.getCourse());
    }

    @Test
    public void testGetAndSetStudentModules() {
        Student a = createStudent();
        assertEquals(0, a.getModules().size());
        ArrayList<Module> modules = new ArrayList<>();
        Module module1 = new Module("CT417", "Software Engineering");
        modules.add(module1);
        a.setModules(modules);
        assertEquals(1, a.getModules().size());
        a.addModule(module1);
        assertEquals(2, a.getModules().size());
        a.removeModule(module1);
        assertEquals(1, a.getModules().size());
    }

    @Test
    public void testGetAndSetStudentUsername() {
        Student a = createStudent();
        assertEquals(studentUsername, a.getUsername());
        a.setDob(new LocalDate(2000,01,01));
        assertEquals("EllaGallo"+a.getAge(), a.getUsername());
    }
}
