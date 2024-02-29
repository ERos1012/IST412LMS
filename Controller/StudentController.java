package Controller;

import Model.Course;
import Model.Student;
import java.util.List;

/**
 * The StudentController class manages students in the system.
 */
public class StudentController
{
    /**
     * Adds a new quiz to the system.
     */
    public void addStudent(Student student) {
    }

    /**
     * Removes an existing quiz from the system.
     */
    public void removeStudent(Student student) {
    }

    /**
     * Updates an existing quiz in the system.
     */
    public void updateStudent(Student student) {
    }

    /**
     * Views details of a specific quiz.
     */
    public Student viewStudent(Student student) {
        // demo
        return student;
    }

    /**
     * Gets a list of all students for a course
     * @param course
     * @return
     */
    public List<Student> getAllStudents(Course course){
        return List.of();
    }

}
