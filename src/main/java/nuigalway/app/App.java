package nuigalway.app;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Module> mymodules = new ArrayList<Module>();
        Module ml = new Module("Machine Learning", "CT4100");
        Module ai = new Module("Artificial Intelligence", "CT4200");
        Module se = new Module("Software Engineering III", "CT4300");
        mymodules.add(ml);
        mymodules.add(ai);
        mymodules.add(se);
        DateTime mycourseStartDate = new DateTime(2016,9,1,0,0);
        DateTime mycourseEndDate = new DateTime(2020,10,1,0,0);
        Course mycourse = new Course("Computer Science and Information Technology", "GY350", mycourseStartDate, mycourseEndDate);
        Student s = new Student("ella gallo",
                21,
                new DateTime(1998,02,25,0,0),
                16345993,
                mycourse);
        s.setModules(mymodules);
        System.out.println(s.getUsername());
        System.out.println(s.getCourse());
    }
}
