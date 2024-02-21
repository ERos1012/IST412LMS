package Controller;
import Model.Assignment;

import java.util.List;

/**
 * The AssignmentController class manages assignments in the system.
 */
public class AssignmentController {

    /**
     * Adds a new assignment to the system.
     */
    public void addAssignment() {
    }

    /**
     * Removes an existing assignment from the system.
     */
    public void removeAssignment() {
    }

    /**
     * Updates an existing assignment in the system.
     */
    public void updateAssignment() {
    }

    /**
     * Views details of an assignment in the system.
     */
    public Assignment viewAssignment() {
        //demo
        return new Assignment("Assignment 1", "Description", "2024-02-20");
    }

    /**
     * Submits an assignment.
     */
    public void submitAssignment() {
    }

    /**
     * Gets a list of all assignments for a course
     * @param courseId
     * @return
     */
    public List<String> getAllAssignments(int courseId){

    }
}
