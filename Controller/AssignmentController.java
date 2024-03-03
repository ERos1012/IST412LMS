package Controller;
import Model.Assignment;
import Model.Course;

import java.util.List;

/**
 * The AssignmentController class manages assignments in the system.
 */
public class AssignmentController {

    /**
     * Adds a new assignment to the system.
     */
    public Assignment addAssignment(Assignment assignment) {
        //demo
        System.out.println("ASSIGNMENT ADDED -- Assignment Name: " + assignment.getName() + " -- Description: " + 
        assignment.getDescription() + " -- Due Date: " + assignment.getDueDate());
        return assignment;
    }

    /**
     * Removes an existing assignment from the system.
     */
    public void removeAssignment() {
        System.out.println("Assignment removed");
    }

    /**
     * Updates an existing assignment in the system.
     */
    public void updateAssignment() {
        System.out.println("Assignment updated");
    }

    /**
     * Views details of an assignment in the system.
     */
    public Assignment viewAssignment(Assignment assignment) {
        //demo
        System.out.println("VIEWING ASSIGNMENT -- Assignment Name: " + assignment.getName() + " -- Description: " + 
        assignment.getDescription() + " -- Due Date: " + assignment.getDueDate());
        return assignment;
    }

    /**
     * Submits an assignment.
     */
    public void submitAssignment() {
        System.out.println("Assignment submitted");
    }

    /**
     * Gets a list of all assignments for a course
     * @param course
     * @return
     */
    public List<String> getAllAssignments(Course course){
        return List.of();
    }
}
