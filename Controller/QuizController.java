package Controller;

import Model.Quiz;

import java.util.List;

/**
 * The QuizController class manages quizzes in the system.
 */
public class QuizController {

    /**
     * Adds a new quiz to the system.
     */
    public void addQuiz() {
    }

    /**
     * Removes an existing quiz from the system.
     */
    public void removeQuiz() {
    }

    /**
     * Updates an existing quiz in the system.
     */
    public void updateQuiz() {
    }

    /**
     * Views details of a specific quiz.
     */
    public Quiz viewQuiz() {
        // demo
        return new Quiz(1, 123, 90);
    }

    /**
     * Gets a list of all quizzes for a course
     * @param courseId
     * @return
     */
    public List<String> getAllQuizzes(int courseId){

    }


}
