package OOPS;

public class class4 {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.name = "Saurabh Yadav";
        S1.rollno = 456;
        S1.password = "abcdefg";
        S1.marks[0] = 100;
        S1.marks[1] = 85;
        S1.marks[2] = 90;
        Student S2 = new Student(S1);
        S2.password = "xyz";
        System.out.println(S2.name);
        System.out.println(S2.rollno);
        System.out.println(S2.password);
        S1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(S2.marks[i]);
        }

    }

}

class Student {
    String name;
    int rollno;
    String password;
    int marks[];

    Student() {
        marks = new int[3];

    }

    Student(Student S1) {
        this.name = S1.name;
        this.rollno = S1.rollno;
        this.password = password;
        marks = new int[3];
        this.marks = S1.marks;

    }

}
