package View;

import javax.swing.*;
import Controller.QuizController;
import Model.Quiz;

/**
 * The QuizView class represents a graphical user interface for displaying quiz details.
 */
public class QuizView extends JFrame {
    private JLabel idLabel;
    private JLabel courseIdLabel;
    private JLabel gradeLabel;
    private QuizController quizController;

    /**
     * Constructs a new QuizView object.
     */
    public QuizView() {
        super("Quiz Details");

        // Initialize the QuizController
        quizController = new QuizController();

        // Initialize labels
        idLabel = new JLabel("ID: ");
        courseIdLabel = new JLabel("Course ID: ");
        gradeLabel = new JLabel("Grade: ");

        // Create a panel to hold the labels
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(idLabel);
        panel.add(courseIdLabel);
        panel.add(gradeLabel);

        // Add the panel to the frame
        getContentPane().add(panel);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);

        // Retrieve quiz details from the controller and update labels
        updateQuizDetails();
    }

    /**
     * Updates the labels with quiz details.
     */
    private void updateQuizDetails() {
        Quiz quiz = quizController.viewQuiz(); // Assuming this method retrieves quiz details from the controller
        idLabel.setText("ID: " + quiz.getId());
        courseIdLabel.setText("Course ID: " + quiz.getCourseId());
        gradeLabel.setText("Grade: " + quiz.getGrade());
    }

    /**
     * The main method to launch the QuizView.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(QuizView::new);
    }
}
