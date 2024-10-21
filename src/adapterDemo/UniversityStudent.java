package adapterDemo;

public class UniversityStudent implements Student {
    private String name;
    private String surname;
    private String email;

    // the parameters passed to the constructor are used to initialize the instance variables.
    public UniversityStudent(String name, String surname, String email ){
        this.name=name;
        this.surname=surname;
        this.email=email;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurName() {
        return surname;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
