package View;

import javax.swing.*;

import Controller.GradeController;
import Model.Grade;

/**
 * The GradeView class represents a graphical user interface for displaying grade details.
 */
public class GradeView extends JFrame {
    private JLabel idLabel;
    private JLabel studentIdLabel;
    private JLabel courseIdLabel;
    private JLabel gradeLabel;
    private GradeController gradeController;

    /**
     * Constructs a new GradeView object.
     */
    public GradeView(Grade grade) {
        super("Grade Details");

        // Initialize the GradeController
        gradeController = new GradeController();

        // Initialize labels
        idLabel = new JLabel("ID: ");
        studentIdLabel = new JLabel("Student ID: ");
        courseIdLabel = new JLabel("Course ID: ");
        gradeLabel = new JLabel("Grade: ");

        // Create a panel to hold the labels
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(idLabel);
        panel.add(studentIdLabel);
        panel.add(courseIdLabel);
        panel.add(gradeLabel);

        // Add the panel to the frame
        getContentPane().add(panel);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);

        // Retrieve grade details from the controller and update labels
        updateGradeDetails(grade);
    }

    /**
     * Updates the labels with grade details.
     */
    private void updateGradeDetails(Grade grade) {
        Grade updateGrade = gradeController.viewGrade(grade); // Assuming this method retrieves grade details from the controller
        idLabel.setText("ID: " + grade.getId());
        studentIdLabel.setText("Student ID: " + grade.getStudentId());
        courseIdLabel.setText("Course ID: " + grade.getCourseId());
        gradeLabel.setText("Grade: " + grade.getGrade());
    }

    /**
     * The main method to launch the GradeView.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GradeView(null));
    }
}
