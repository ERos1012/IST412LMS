package View;

import javax.swing.*;
import Controller.AssignmentController;
import Model.Assignment;

/**
 * The AssignmentView class represents a graphical user interface for displaying assignment details.
 */
public class AssignmentView extends JFrame {
    private JLabel nameLabel;
    private JLabel descriptionLabel;
    private JLabel dueDateLabel;
    private AssignmentController assignmentController;

    /**
     * Constructs a new AssignmentView object.
     */
    public AssignmentView() {
        super("Assignment Details");

        // Initialize the AssignmentController
        assignmentController = new AssignmentController();

        // Initialize labels
        nameLabel = new JLabel("Name: ");
        descriptionLabel = new JLabel("Description: ");
        dueDateLabel = new JLabel("Due Date: ");

        // Create a panel to hold the labels
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(nameLabel);
        panel.add(descriptionLabel);
        panel.add(dueDateLabel);

        // Add the panel to the frame
        getContentPane().add(panel);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);

        // Retrieve assignment details from the controller and update labels
        updateAssignmentDetails();
    }

    /**
     * Updates the labels with assignment details.
     */
    private void updateAssignmentDetails() {
        Assignment assignment = assignmentController.viewAssignment();
        nameLabel.setText("Name: " + assignment.getName());
        descriptionLabel.setText("Description: " + assignment.getDescription());
        dueDateLabel.setText("Due Date: " + assignment.getDueDate());
    }

    /**
     * The main method to launch the AssignmentView.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AssignmentView::new);
    }
}
