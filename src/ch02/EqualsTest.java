package ch02;
// 02. Object 클래스의 메서드 활용
public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student i1 = new Student(100, "Lee");
        //Student Lee2 = i1;
        Student i2 = new Student(100, "Lee");

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        System.out.println("Lee.hashCode : " + i1.hashCode());
        System.out.println("Shun.hashCode : " + i2.hashCode());


//        Integer i1 = new Integer(100);
//        Integer i2 = new Integer(100);

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println("i1의 identityHashCode : " + System.identityHashCode(i1));
        System.out.println("i2의 identityHashCode : " + System.identityHashCode(i2));

        i1.setStudentName("Kim");
        Student copyStudent = (Student) i1.clone();
        System.out.println(copyStudent);
    }
}