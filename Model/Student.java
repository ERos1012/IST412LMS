package Model;

/**
 * The Student class represents a student in the system.
 */
public class Student {
    private String name;
    private int id;
    private String program;
    private String email;
    private String classification;

    /**
     * Constructs a new Student object with the specified name, ID, program, and email.
     * 
     * @param name The name of the student.
     * @param id The ID of the student.
     * @param program The program in which the student is enrolled.
     * @param email The email address of the student.
     */
    public Student(String name, int id, String program, String email) {
        this.name = name;
        this.id = id;
        this.program = program;
        this.email = email;
    }
    
    /**
     * Gets the name of the student.
     * 
     * @return The name of the student.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the ID of the student.
     * 
     * @return The ID of the student.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the program in which the student is enrolled.
     * 
     * @return The program of the student.
     */
    public String getProgram() {
        return program;
    }

    /**
     * Gets the email address of the student.
     * 
     * @return The email address of the student.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets the classification of the student.
     * 
     * @return The classification of the student.
     */
    public String getClassification() {
        return classification;
    }


}
