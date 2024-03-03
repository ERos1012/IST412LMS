package View;

import javax.swing.*;

import Controller.CourseController;
import Model.Course;

/**
 * The CourseView class represents a graphical user interface for displaying course details.
 */
public class CourseView extends JFrame {
    private JLabel nameLabel;
    private JLabel idLabel;
    private JLabel programLabel;
    private JLabel emailLabel;
    private CourseController courseController;

    /**
     * Constructs a new CourseView object.
     */
    public CourseView() {
        super("Course Details");

        // Initialize the CourseController
        courseController = new CourseController();

        // Initialize labels
        nameLabel = new JLabel("Name: ");
        idLabel = new JLabel("ID: ");
        programLabel = new JLabel("Program: ");
        emailLabel = new JLabel("Email: ");

        // Create a panel to hold the labels
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(nameLabel);
        panel.add(idLabel);
        panel.add(programLabel);
        panel.add(emailLabel);

        // Add the panel to the frame
        getContentPane().add(panel);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);

        // Retrieve course details from the controller and update labels
        updateCourseDetails();
    }

    /**
     * Updates the labels with course details.
     */
    private void updateCourseDetails() {
        Course course = null;
        course = courseController.viewCourse(course); // Assuming this method retrieves course details from the controller
        nameLabel.setText("Name: " + course.getName());
        idLabel.setText("ID: " + course.getId());
        programLabel.setText("Program: " + course.getProgram());
        emailLabel.setText("Email: " + course.getEmail());
    }

    /**
     * The main method to launch the CourseView.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CourseView::new);
    }
}
