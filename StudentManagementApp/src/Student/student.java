package Student;

public class student {
    private int studentId;
    private String studentName;
    private String studentPhone;
    private String studentCity;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public student(int studentId, String studentName, String studentPhone, String studentCity) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public student(String studentName, String studentPhone, String studentCity) {
        super();
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;

    }

    public student() {
        super();
         // TODO Auto-generate constructor stub
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("student{");
        sb.append("studentId=").append(studentId);
        sb.append(", studentName='").append(studentName).append('\'');
        sb.append(", studentPhone='").append(studentPhone).append('\'');
        sb.append(", studentCity='").append(studentCity).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
