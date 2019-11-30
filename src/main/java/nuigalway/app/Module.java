package nuigalway.app;

import java.util.ArrayList;

public class Module {
    private String moduleName;
    private String moduleCode;
    private ArrayList<Student> students;
    private ArrayList<CourseProgramme> relatedCourses;

    public Module(String moduleName, String moduleCode) {
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.students = students;
        this.relatedCourses = relatedCourses;
        students = new ArrayList<>();
        relatedCourses = new ArrayList<>();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
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

    public ArrayList<CourseProgramme> getRelatedCourses() {
        return relatedCourses;
    }

    public void setRelatedCourses(ArrayList<CourseProgramme> relatedCourses) {
        this.relatedCourses = relatedCourses;
    }

    public void addRelatedCourse(CourseProgramme course) {
        relatedCourses.add(course);
    }

    public void removeRelatedCourse(CourseProgramme course) {
        relatedCourses.remove(course);
    }

    @Override
    public String toString() {
        return moduleCode + " " + moduleName;
    }
}
