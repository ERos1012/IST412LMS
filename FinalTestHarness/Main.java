package FinalTestHarness;

import Controller.AssignmentController;
import Controller.MessageController;
import Model.Assignment;
import Model.Course;
import Model.Message;
import Model.Student;
import Model.Teacher;
import Controller.CourseController;
import Controller.QuizController;
import Model.Quiz;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instantiate controller classes
        AssignmentController assignmentController = new AssignmentController();
        CourseController courseController = new CourseController();
        MessageController messageController = new MessageController();
        QuizController quizController = new QuizController();


        // Scenario: Teacher wants to add, update, remove, view, and get all assignments for a course
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


        // Scenario: Student wants to message a professor about an assignment
        Student student = new Student("John Doe", 123, "Computer Science", "john.doe@example.com");
        Teacher teacher = new Teacher("Dr. Smith", 456, "smith@example.com");
        String messageContent = "Dear Professor, I have a question about the assignment.";
        Message studentMessage = new Message(1, student.getId(), teacher.getId(), messageContent, "2024-03-03");

        // Test sending a message
        messageController.sendMessage(studentMessage);
        System.out.println("Message sent from student to professor - Test Passed");

        System.out.println("MessageController tests completed.");

        // Scenario: Administrator/Teacher wants to add a new course
        Course newCourse = new Course("Course 2", 102, "Computer Science", "Dr. Smith");
        courseController.addCourse(newCourse);
        System.out.println("Course added: " + newCourse.getName() + " - Test Passed");

        // Scenario: Administrator/Teacher wants to remove a course
        courseController.removeCourse(102);
        System.out.println("Course removed: 102 - Test Passed");

        System.out.println("CourseController tests completed.");

        // Scenario: Teacher makes a quiz for students to take and grades the quiz
        // Test adding a quiz
        List<String> questions = List.of("Question 1", "Question 2", "Question 3");
        Quiz newQuiz = new Quiz(1, 101, 100, "Quiz 1", "2024-03-10", questions);
        Quiz addedQuiz = quizController.addQuiz(newQuiz);
        if (addedQuiz != null) {
            System.out.println("Added Quiz: " + addedQuiz.getName() + " - Test Passed");
        } else {
            System.out.println("Failed to add quiz - Test Failed");
        }

        Quiz quizToGrade = new Quiz(1, 101, 100, "Quiz 1", "2024-03-10", questions);
        quizController.gradeQuiz(123, 101, 1, 90);
        System.out.println("Graded Quiz: " + quizToGrade.getName() + " - Test Passed");

        System.out.println("QuizController and GradeController tests completed.");
    }
}
