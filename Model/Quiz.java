package Model;

import java.util.List;

/**
 * The Quiz class represents a quiz in the system.
 */
public class Quiz {
    private int id;
    private int courseId;
    private int grade;
    private String name;
    private String dueDate;
    private List<String> questions;

    /**
     * Constructs a new Quiz object with the specified ID, course ID, and grade.
     * 
     * @param id The ID of the quiz.
     * @param courseId The ID of the course associated with the quiz.
     * @param grade The grade of the quiz.
     */
    public Quiz(int id, int courseId, int grade, String name, String dueDate, List<String> questions) {
        this.id = id;
        this.courseId = courseId;
        this.grade = grade;
        this.name = name;
        this.dueDate = dueDate;
        this.questions = questions;
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

    /**
     * Gets the name of the quiz.
     * 
     * @return The name of the quiz.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the due date of the quiz.
     * 
     * @return The due date of the quiz.
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Gets the questions of the quiz.
     * 
     * @return The questions of the quiz.
     */
    public List<String> getQuestions() {
        return questions;
    }

}
