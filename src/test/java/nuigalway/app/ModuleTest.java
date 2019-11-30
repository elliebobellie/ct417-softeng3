package nuigalway.app;

import org.junit.Test;
import org.joda.time.LocalDate;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class ModuleTest {

    @Test
    public void testGetAndSetModuleName() {
        String moduleName = "Software Engineering";
        String moduleCode = "CT417";
        Module m = new Module(moduleName,moduleCode);
        assertEquals(moduleName, m.getModuleName());
        String newModuleName = "Software Engineering III";
        m.setModuleName(newModuleName);
        assertEquals(newModuleName, m.getModuleName());
    }

    @Test
    public void testGetAndSetModuleCode() {
        String moduleName = "CT4101";
        String moduleCode = "Machine Learning";
        Module m = new Module(moduleName,moduleCode);
        assertEquals(moduleCode, m.getModuleCode());
        String newModuleCode = "CT475";
        m.setModuleCode(newModuleCode);
        assertEquals(newModuleCode, m.getModuleCode());
    }

    @Test
    public void testGetAndSetStudentsTakingModule() {
        String moduleName = "CT15";
        String moduleCode = "Database Systems";
        Module m = new Module(moduleName,moduleCode);
        ArrayList<Student> studentsTakingModule = new ArrayList<>();
        assertEquals(0, m.getStudents().size());
        Student a = new Student("Marienella Gallo",
                new LocalDate(1998,02,25),
        16345993,
        new CourseProgramme("Computer Science",
                "GY350",
                new LocalDate(2016,9,01),
                new LocalDate(2020,10,01)));
        studentsTakingModule.add(a);
        m.setStudents(studentsTakingModule);
        assertEquals(1, m.getStudents().size());
        m.addStudent(a);
        assertEquals(2, m.getStudents().size());
        m.removeStudent(a);
        assertEquals(1, m.getStudents().size());
    }

    @Test
    public void testGetAndSetRelatedCourses() {
        String moduleName = "C404";
        String moduleCode = "Graphics and Image Processing";
        Module m = new Module(moduleName,moduleCode);
        ArrayList<CourseProgramme> relatedCourses = new ArrayList<>();
        assertEquals(0, m.getRelatedCourses().size());
        CourseProgramme c1 = new CourseProgramme("Computer Science",
                "GY350",
                new LocalDate(2016,9,01),
                new LocalDate(2020,10,01));
        relatedCourses.add(c1);
        m.setRelatedCourses(relatedCourses);
        assertEquals(1, m.getRelatedCourses().size());
        m.addRelatedCourse(c1);
        assertEquals(2, m.getRelatedCourses().size());
        m.removeRelatedCourse(c1);
        assertEquals(1, m.getRelatedCourses().size());
    }
}
