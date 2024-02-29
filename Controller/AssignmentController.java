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
    public void addAssignment(Assignment assignment) {
    }

    /**
     * Removes an existing assignment from the system.
     */
    public void removeAssignment(Assignment assignment) {
    }

    /**
     * Updates an existing assignment in the system.
     */
    public void updateAssignment(Assignment assignment) {
    }

    /**
     * Views details of an assignment in the system.
     */
    public Assignment viewAssignment(Assignment assignment) {
        //demo
        return assignment;
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
        return List.of();
    }
}
