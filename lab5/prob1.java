class Student {
    private int studentId;
    private String studentName;
    private double studentCGPA;
    private Course[] clist;
    private int numberofcourse;

    Student() {

        clist = new Course[5];
        numberofcourse = 0;

    }

    Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;

        numberofcourse = 0;
        clist = new Course[5];
    }

    /* setters */
    public void setStudentName(String name) {
        this.studentName = name;
    }

    public void setStudentCGPA(double cgpa) {
        this.studentCGPA = cgpa;
    }

    public void setStudentId(int id) {
        this.studentId = id;
    }

    /* getters */
    public String getStudentName() {
        return this.studentName;
    }

    public double getStudentCGPA() {
        return this.studentCGPA;
    }

    public int getStudentId() {
        return this.studentId;
    }

    /* methods */
    public void addCourse(Course c) {

        clist[numberofcourse] = c;
        numberofcourse++;
    }

    public void display() {

        System.out.println("Name : " + getStudentName());
        System.out.println("ID : " + getStudentId());
        System.out.println("CGPA : " + getStudentCGPA());

        System.out.print("Course List  - " + " ");
        for (var i = 0; i < clist.length; i++) {

            if (clist[i] != null) { // Check for null before accessing elements
                String courseID = clist[i].getCourseId();
                System.out.print(courseID + " ");
            }

        }
        System.out.println();
    }

}

class Course {
    private String courseId;
    private String courseTitle;
    private double credit;
    private Student[] studentlist;
    private int numberOfStudents;

    Course() {
        numberOfStudents = 0;
        studentlist = new Student[5];
    }

    Course(String id, String title, double credit) {
        this.courseId = id;
        this.courseTitle = title;
        this.credit = credit;

        numberOfStudents = 0;
        studentlist = new Student[5];
    }

    /* setters */
    public void setCourseTitle(String title) {
        this.courseTitle = title;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setCourseId(String id) {
        this.courseId = id;
    }

    /* getters */
    public String getCourseTitle() {
        return this.courseTitle;
    }

    public double getCredit() {
        return this.credit;
    }

    public String getCourseId() {
        return this.courseId;
    }

    public void addStudent(Student s) {
        studentlist[numberOfStudents] = s;
        numberOfStudents++;
    }

    public void display() {
        System.out.println("Title : " + getCourseTitle());
        System.out.println("ID : " + getCourseId());
        System.out.println("Credit : " + getCredit());

        System.out.print("Student List (IDs) - " + " ");
        for (var i = 0; i < studentlist.length; i++) {

            if (studentlist[i] != null) {
                int stdID = studentlist[i].getStudentId();
                System.out.print(stdID + " ");
            }

        }
        System.out.println();

    }
}

public class prob1 {
    public static void main(String[] args) {

        Student s1 = new Student(202326024, "prionto", 3.97);
        Student s2 = new Student(202326000, "abc", 3.5);

        Course c1 = new Course("CSE110", "Object Oriented Programming", 4.5);
        Course c2 = new Course("CSE200", "Computer-Aided Engineering Drawing", 1);
        Course c3 = new Course("CSE103", "Structured Programming", 4.5);
        /* student 1 */
        s1.addCourse(c1);
        s1.addCourse(c2);
        /* student 1 */
        s2.addCourse(c1);
        s2.addCourse(c3);
        /* course 1 */
        c1.addStudent(s1);
        c1.addStudent(s2);
        /* course 2 */
        c2.addStudent(s1);
        /* course 3 */
        c3.addStudent(s2);

        s1.display();
        System.out.println();
        s2.display();
        System.out.println();
        c1.display();
        System.out.println();
        c2.display();
        System.out.println();
        c3.display();

    }
}
