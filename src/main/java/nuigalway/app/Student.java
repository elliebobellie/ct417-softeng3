package nuigalway.app;

import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Student {
    private String name;
    private int age;
    private LocalDate dob;
    private long id;
    private String username;
    private CourseProgramme course;
    private ArrayList<Module> modules;

    public Student(String name, LocalDate dob, long id, CourseProgramme course) {
        this.name = name;
        this.dob = dob;
        this.id = id;
        this.course = course;
        username = "";
        modules = new ArrayList<>();
        age = calculateAge(dob);
    }

    public int calculateAge(LocalDate dob) {
        if (dob != null) {
            Years age = Years.yearsBetween(dob, new LocalDate());
            return age.getYears();
        } else {
            return -1;
        }
    }

    public int getAge() { return age; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
        age = calculateAge(dob);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        String nameNoSpecialChars = name;
        username = nameNoSpecialChars.replaceAll("[^A-Za-z0-9]+", "");
        return username+age;
    }

    public CourseProgramme getCourse() {
        return course;
    }

    public void setCourse(CourseProgramme course) {
        this.course = course;
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

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
