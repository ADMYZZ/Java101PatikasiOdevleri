package StudentInfoSystem;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("mahmut hoca","0212251","TRH");
        Teacher t2 = new Teacher("ayaz ya","11111","FZK");
        Teacher t3 = new Teacher("adm mmm","22222","MAT");

        Course course1 = new Course("TARİH","101","TRH");
        course1.addTeacher(t1);
        Course course2 = new Course("FİZİK","101","FZK");
        course2.addTeacher(t2);
        Course course3 = new Course("MATEMATİK","101","MAT");
        course3.addTeacher(t3);

        /*course1.printTeacher();
        course2.printTeacher();
        course3.printTeacher();*/

        Student s1 = new Student("seeet","658987","1");
        s1.addCourse(course1,course2,course3);
        s1.addBulkExamNote(70,50,55);
        s1.addBulkVerbalNote(100,90,80);
        s1.printNote();

    }
}
