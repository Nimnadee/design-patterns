package adapterDemo;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
    StudentClient client =new StudentClient();
        List<Student> studentList= client.getStudentList();           //prints out Student list
        System.out.println(studentList);

    }
}
