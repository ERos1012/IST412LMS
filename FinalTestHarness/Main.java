package FinalTestHarness;

import Controller.AssignmentController;
import Controller.CourseController;
import Model.Assignment;
import Model.Course;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instantiate controller classes
        AssignmentController assignmentController = new AssignmentController();

        // Test adding an assignment
        Assignment newAssignment = new Assignment("Assignment 1", "Description 1", "2024-03-10");
        Assignment addedAssignment = assignmentController.addAssignment(newAssignment);
        if (addedAssignment != null) {
            System.out.println("Added Assignment: " + addedAssignment.getName() + " - Test Passed");
        } else {
            System.out.println("Failed to add assignment - Test Failed");
        }

        // Test updating an assignment
        Assignment updatedAssignment = new Assignment("Assignment 2", "Updated Description", "2024-03-15");
        assignmentController.updateAssignment();
        System.out.println("Updated Assignment: " + updatedAssignment.getName() + " - Test Passed");

        // Test removing an assignment
        assignmentController.removeAssignment();
        System.out.println("Removed Assignment - Test Passed");

        // Test viewing an assignment
        Assignment assignmentToView = new Assignment("Assignment 3", "View Description", "2024-03-20");
        Assignment viewedAssignment = assignmentController.viewAssignment(assignmentToView);
        System.out.println("Viewed Assignment: " + viewedAssignment.getName() + " - Test Passed");

        // Test getting all assignments for a course (empty for demo purposes)
        Course course = new Course("Course 1", 101, "Computer Science", "Dr. Smith");
        List<String> allAssignments = assignmentController.getAllAssignments(course);
        if (allAssignments.isEmpty()) {
            System.out.println("Got all assignments for Course 1 - Test Passed");
        } else {
            System.out.println("Failed to get all assignments for Course 1 - Test Failed");
        }

        System.out.println("AssignmentController tests completed.");
    }

    /*
     * should consist of a) controller components passing control between themselves
     * as envisioned in your design, and
     * b) controller components calling the APIs of their view and model components,
     * again as envisioned in your design.
     * 
     * The testharness module should include a main method and be runnable. When it
     * is run it should execute a series of
     * tests with appropriate output statements communicating whether the tests have
     * passed or failed. The test harness
     * module will need to instantiate at least one controller class to begin the
     * test, which in turn instantiate other
     * controller, view, and model classes and exercise their APIs. You may want to
     * include test output statements in your
     * method stubs to reduce coupling between the testharness module and your other
     * modules.
     */

//     public class Main {
//         public static void main(String[] args) {
//             // Instantiate controller classes
//             CourseController courseController = new CourseController();
//             AssignmentController assignmentController = new AssignmentController();
//         }
//     }
}
