package Model;

/**
 * Student
 */
public class Student {
    private String name;
    private int id;
    private String program;
    private String email;
    private String classification;

    public Student(String name, int age, int id, String program, String email) {
        this.name = name;
        this.id = id;
        this.program = program;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }

    public String getProgram() {
        return program;
    }

    public String getEmail() {
        return email;
    }

    public String getClassification() {
        return classification;
    }
}