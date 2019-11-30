package nuigalway.app;

import org.joda.time.LocalDate;
import java.util.ArrayList;

public class CourseProgramme {
    private String name;
    private String courseCode;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private LocalDate startDate;
    private LocalDate endDate;

    public CourseProgramme(String name, String courseCode, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.courseCode = courseCode;
        this.startDate = startDate;
        this.endDate = endDate;
        modules = new ArrayList<>();
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public void removeModule(Module module) {
        modules.remove(module);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return courseCode + " " + name;
    }
}
