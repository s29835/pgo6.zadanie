import java.util.ArrayList;
import java.util.List;

public class Students {
    private static List<Student> studentList = new ArrayList<>();

    public static void addStudent(Student student){
        studentList.add(student);
    }
    public static void promoteAllStudents(){
        for (Student student : studentList){
            student.promoteToNextSemester();
        }
    }
    public static void displayInfoAboutAllStudents(){
        for(Student student : studentList){
            System.out.println(student.getName()+ " " +student.getLastName()+" "+student.getIndexNumber()+
                    "\nstudy programme: "+student.getStudyprogramme()+ "\ncurrent semester: "+student.getCurrentSemester()+
                    "\nstatus: "+student.getStatus());
            System.out.println();
        }
    }
}
