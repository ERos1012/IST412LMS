package View;

import javax.swing.*;
import java.awt.*;

/**
 * The MainView class represents the home page of the application with a navigation bar
 * to direct users to different functionalities like Assignment, Course, Grade, Message, and Quiz views,
 * displaying them under the navigation bar and inside the same window.
 */
public class MainView extends JFrame {

    private CardLayout cardLayout = new CardLayout();
    private JPanel cardsPanel = new JPanel(cardLayout); // Panel that contains different views
    
    public MainView() {
        super("Home Page");
        initializeUI();
    }

    private void initializeUI() {
        // Navigation panel setup
        JPanel navigationPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    
        // Buttons for each view
        JButton assignmentButton = new JButton("Assignment");
        JButton courseButton = new JButton("Course");
        JButton gradeButton = new JButton("Grade");
        JButton messageButton = new JButton("Message");
        JButton quizButton = new JButton("Quiz");
    
        // Add buttons to the navigation panel
        navigationPanel.add(assignmentButton);
        navigationPanel.add(courseButton);
        navigationPanel.add(gradeButton);
        navigationPanel.add(messageButton);
        navigationPanel.add(quizButton);
    
        // Instantiate and add the actual views to the cardsPanel
        JPanel assignmentView = new AssignmentView(); 
        cardsPanel.add(assignmentView, "Assignment");
       
        JPanel courseView = new CourseView(new Controller.CourseController());
        cardsPanel.add(courseView, "Course");
        
        JPanel gradeView = new GradeView(new Model.Grade()); 
        cardsPanel.add(gradeView, "Grade");

        JPanel messageView = new MessageView();
        cardsPanel.add(messageView, "Message");

        JPanel quizView = new QuizView();
        cardsPanel.add(quizView, "Quiz");

        // Action listeners for buttons to switch views
        assignmentButton.addActionListener(e -> cardLayout.show(cardsPanel, "Assignment"));
        courseButton.addActionListener(e -> cardLayout.show(cardsPanel, "Course"));
        gradeButton.addActionListener(e -> cardLayout.show(cardsPanel, "Grade"));
        messageButton.addActionListener(e -> cardLayout.show(cardsPanel, "Message"));
        quizButton.addActionListener(e -> cardLayout.show(cardsPanel, "Quiz"));
    
        // Layout setup for the main frame
        setLayout(new BorderLayout());
        add(navigationPanel, BorderLayout.NORTH);
        add(cardsPanel, BorderLayout.CENTER);
    
        // Frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Center the frame on the screen
    }
    

    /**
     * The main method to launch the MainView as the application's home page.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainView().setVisible(true));
    }
}