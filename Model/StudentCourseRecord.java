package Model;

/**
 * StudentCourseRecord
 */
public class StudentCourseRecord {
    private int studentId;
    private String courseCode;
    private String grade;
    private String semester;
    private int year;

    public StudentCourseRecord(int studentId, String courseCode, String grade, String semester, int year) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.grade = grade;
        this.semester = semester;
        this.year = year;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getGrade() {
        return grade;
    }

    public String getSemester() {
        return semester;
    }

    public int getYear() {
        return year;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Student ID: " + studentId + ", Course Code: " + courseCode + ", Grade: " + grade + ", Semester: " + semester + ", Year: " + year;
    }
}
