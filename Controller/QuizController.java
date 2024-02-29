package Controller;

import Model.Course;
import Model.Quiz;

import java.util.List;

/**
 * The QuizController class manages quizzes in the system.
 */
public class QuizController {

    /**
     * Adds a new quiz to the system.
     */
    public void addQuiz(Quiz quiz) {
    }

    /**
     * Removes an existing quiz from the system.
     */
    public void removeQuiz(Quiz quiz) {
    }

    /**
     * Updates an existing quiz in the system.
     */
    public void updateQuiz(Quiz quiz) {
    }

    /**
     * Views details of a specific quiz.
     */
    public Quiz viewQuiz(Quiz quiz) {
        // demo
        return quiz;
    }

    /**
     * Gets a list of all quizzes for a course
     * @param course
     * @return
     */
    public List<Quiz> getAllQuizzes(Course course){
        return List.of();
    }

    /**
     * Assigns a grade to a quiz for a student.
     * @param studentId
     * @param courseId
     * @param quizId
     * @param grade
     */
    public void gradeQuiz(int studentId, int courseId, int quizId, int grade)
    {

    }
}
