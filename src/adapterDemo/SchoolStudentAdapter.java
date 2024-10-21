package adapterDemo;



public class SchoolStudentAdapter implements Student{
    public SchoolStudent schoolStudent;                      // creating an instance of SchoolStudent

    public SchoolStudentAdapter(SchoolStudent schoolStudent){
        this.schoolStudent=schoolStudent;
    }
    @Override
    public String getName() {
        return this.schoolStudent.getFirstname();              // calling the functions in schoolStudent class and return the value.
    }

    @Override
    public String getSurName() {
        return this.schoolStudent.getLastname();
    }

    @Override
    public String getEmail() {
      return this.schoolStudent.getEmailaddress();
    }
}
