package Model;

/**
 * The Course class represents a course in the system.
 */
public class Course {
    private String name;
    private int id;
    private String program;
    private String email;
    private String classification;

    /**
     * Constructs a new Course object with the specified name, ID, program, and email.
     * 
     * @param name The name of the course.
     * @param id The ID of the course.
     * @param program The program to which the course belongs.
     * @param email The email address associated with the course.
     */
    public Course(String name, int id, String program, String email) {
        this.name = name;
        this.id = id;
        this.program = program;
        this.email = email;
    }
    
    /**
     * Gets the name of the course.
     * 
     * @return The name of the course.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the ID of the course.
     * 
     * @return The ID of the course.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the program to which the course belongs.
     * 
     * @return The program of the course.
     */
    public String getProgram() {
        return program;
    }

    /**
     * Gets the email address associated with the course.
     * 
     * @return The email address associated with the course.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets the classification of the course.
     * 
     * @return The classification of the course.
     */
    public String getClassification() {
        return classification;
    }
}
