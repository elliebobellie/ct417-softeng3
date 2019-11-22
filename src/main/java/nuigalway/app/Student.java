package nuigalway.app;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Student {
    private String name;
    private int age;
    private DateTime dob;
    private int id;
    private String username;
    private Course course;
    private ArrayList<Module> modules;

    public Student(String name, int age, DateTime dob, int id, Course course) {
        this.name = name;
        this.age =age;
        this.dob = dob;
        this.id = id;
        this.course = course;
        username = "";
        modules = new ArrayList<Module>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        String nameNoSpecialChars = name;
        username = nameNoSpecialChars.replaceAll("[^A-Za-z0-9]+", "");
        return username+age;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
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
