package Model;

/**
 * The Quiz class represents a quiz in the system.
 */
public class Quiz {
    private int id;
    private int courseId;
    private int grade;

    /**
     * Constructs a new Quiz object with the specified ID, course ID, and grade.
     * 
     * @param id The ID of the quiz.
     * @param courseId The ID of the course associated with the quiz.
     * @param grade The grade of the quiz.
     */
    public Quiz(int id, int courseId, int grade) {
        this.id = id;
        this.courseId = courseId;
        this.grade = grade;
    }
    
    /**
     * Gets the ID of the quiz.
     * 
     * @return The ID of the quiz.
     */
    public int getId() {
        return id;
    }
    
    /**
     * Gets the ID of the course associated with the quiz.
     * 
     * @return The ID of the course.
     */
    public int getCourseId() {
        return courseId;
    }

    /**
     * Gets the grade of the quiz.
     * 
     * @return The grade of the quiz.
     */
    public int getGrade() {
        return grade;
    }
}
