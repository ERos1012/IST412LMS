package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import Controller.CourseController;
import Model.Course;

/**
 * The CourseView class represents a graphical user interface for displaying course details.
 */
public class CourseView extends JFrame {
    private JTextArea courseTextArea;
    private JButton addButton;
    private JButton removeButton;
    private JButton updateButton;
    private JButton viewButton;
    private final CourseController courseController;

    /**
     * Constructs a new CourseView object.
     */
    public CourseView(CourseController courseController) {
        super("Course Details");

        this.courseController = courseController;

        initializeUI();
        updateCourseDetails();
    }

    /**
     * Initializes the UI components.
     */
    private void initializeUI() {
        // Text fields for entering course details
        JTextField nameField = new JTextField(20);
        JTextField idField = new JTextField(10);
        JTextField programField = new JTextField(20);
        JTextField instructorField = new JTextField(20);
    
        // Add button to trigger course addition
        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve course details from text fields
                String name = nameField.getText().trim();
                String idText = idField.getText().trim();
                String program = programField.getText().trim();
                String instructor = instructorField.getText().trim();
    
                // Check if any field is empty
                if (name.isEmpty() || idText.isEmpty() || program.isEmpty() || instructor.isEmpty()) {
                    JOptionPane.showMessageDialog(CourseView.this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Exit without adding the course
                }
    
                // Parse ID to integer
                int id;
                try {
                    id = Integer.parseInt(idText);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(CourseView.this, "Invalid ID!", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Exit without adding the course
                }
    
                // Create new course object
                Course newCourse = new Course(name, id, program, instructor);
    
                // Add course to the system
                courseController.addCourse(newCourse);
                System.out.println("Course added: Name - " + name + ", ID - " + id + ", Program - " + program + ", Instructor - " + instructor);
            }
        });
    
        // View button to display course details
        viewButton = new JButton("View");
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call the Course Controller to view course details
                courseController.viewCourse(new Course("IST", 120, "Engineering", "Dr. Lee"));
            }
        });
    
        // Update button to update course details
        updateButton = new JButton("Update");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseController.updateCourse(new Course("Math", 101, "Engineering", "Dr. Smith"));
            }
        });
    
        // Remove button to remove a course
        removeButton = new JButton("Remove");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseController.removeCourse(101);
            }
        });
    
        // Panel to hold text fields and buttons for adding, viewing, updating, and removing courses
    JPanel inputPanel = new JPanel();
    inputPanel.setLayout(new GridLayout(6, 2));
    inputPanel.add(new JLabel("Course Name:"));
    inputPanel.add(nameField);
    inputPanel.add(new JLabel("Course ID:"));
    inputPanel.add(idField);
    inputPanel.add(new JLabel("Program:"));
    inputPanel.add(programField);
    inputPanel.add(new JLabel("Instructor:"));
    inputPanel.add(instructorField);
    inputPanel.add(addButton);
    inputPanel.add(viewButton);
    inputPanel.add(updateButton);
    inputPanel.add(removeButton);

    // Panel to display dummy courses
    JPanel dummyCoursesPanel = new JPanel();
    dummyCoursesPanel.setLayout(new BoxLayout(dummyCoursesPanel, BoxLayout.Y_AXIS));
    List<Course> dummyCourses = Course.getDummyCourses();
    for (Course course : dummyCourses) {
        JLabel dummyLabel = new JLabel("Dummy Course: " + course.getName() + ", ID: " + course.getId());
        JLabel dummyLabel2 = new JLabel("Program: " + course.getProgram() + ", Instructor: " + course.getInstructor() + "\n");
        JLabel spacer = new JLabel(" ");
        dummyCoursesPanel.add(dummyLabel);
        dummyCoursesPanel.add(dummyLabel2);
        dummyCoursesPanel.add(spacer);
    }

    // Scroll pane for dummy courses panel
    JScrollPane dummyScrollPane = new JScrollPane(dummyCoursesPanel);
    dummyScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

    // Panel to hold both input and dummy courses panels
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    mainPanel.add(inputPanel, BorderLayout.WEST);
    mainPanel.add(dummyScrollPane, BorderLayout.EAST);
    
        getContentPane().add(mainPanel);
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }    
    
    /**
     * Updates the text area with course details.
     */
    private void updateCourseDetails() {
        List<Course> courses = courseController.getAllCourses();
        StringBuilder sb = new StringBuilder();
        for (Course course : courses) {
            sb.append("Name: ").append(course.getName()).append("\n");
            sb.append("ID: ").append(course.getId()).append("\n");
            sb.append("Program: ").append(course.getProgram()).append("\n");
            sb.append("Professor: ").append(course.getInstructor()).append("\n\n");
        }
        courseTextArea.setText(sb.toString());
    }

    /**
     * The main method to launch the CourseView.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
        SwingUtilities.invokeLater(() -> new CourseView(courseController));
    }
}
