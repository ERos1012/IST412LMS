package Controller;

import Model.Grade;

import java.util.List;

/**
 * The GradeController class manages grades in the system.
 */
public class GradeController {

    /**
     * Adds a new grade to the system.
     */
    public void addGrade() {
    }

    /**
     * Removes an existing grade from the system.
     */
    public void removeGrade() {
    }

    /**
     * Updates an existing grade in the system.
     */
    public void updateGrade() {
    }

    /**
     * Views details of a specific grade.
     */
    public Grade viewGrade() {
        // demo
        return new Grade(1, 123, 456, 90);
    }

    /**
     * View a specific quiz grade
     * @param studentId
     * @param courseID
     * @param quizId
     * @return
     */
    public int viewQuizGrade(int studentId, int courseID, int quizId)
    {

    }

    /**
     * view all grades for a course
     * @param studentId
     * @param CourseID
     * @return
     */
    public List<Integer> viewCourseGrades(int studentId, int CourseID)
    {
    }

    public

}
