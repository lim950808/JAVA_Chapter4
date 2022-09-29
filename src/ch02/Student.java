package ch02;
// 02. Object 클래스의 메서드 활용
public class Student implements Cloneable {

    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public String toString() {
        return studentId + ", " + studentName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student std = (Student)obj;
            if(this.studentId == std.studentId)
                return true;
            else return false;
        }
        return false;

    }

    @Override
    public int hashCode() {
        return studentId;
    }
}