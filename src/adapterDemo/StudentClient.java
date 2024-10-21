package adapterDemo;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();
        UniversityStudent universityStudent = new UniversityStudent("a", "b", "ab@gmail.com");       //UniversityStudent class implement Student interface
        SchoolStudent schoolStudent = new SchoolStudent("c", "d", "cd.email.com");  //SchoolStudent class not implement Student interface
        students.add(universityStudent);                                                                          //can add UniversityStudent instance here

      // students.add(schoolStudent);             //==> error
        students.add(new SchoolStudentAdapter(schoolStudent));              //but we can't add schoolStudent here. because it is not a type of student.

        return students;
    }

}
