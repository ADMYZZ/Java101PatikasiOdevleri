package StudentInfoSystem;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String studentNo;
    String classes;
    boolean isPass;
    Student(String name, String studentNo, String classes){
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.isPass = false;
    }

    void addCourse(Course c1,Course c2, Course c3){
        this.course1 = c1;
        this.course2 = c2;
        this.course3 = c3;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <=100){this.course1.note = note1;}
        if (note2 >= 0 && note2 <=100){this.course2.note = note2;}
        if (note3 >= 0 && note3 <=100){this.course3.note = note3;}
    }

    void addBulkVerbalNote(int verbalNote1, int verbalNote2, int verbalNote3){
        if (verbalNote1 >= 0 && verbalNote1 <=100){this.course1.verbalNote = verbalNote1;}
        if (verbalNote2 >= 0 && verbalNote2 <=100){this.course2.verbalNote = verbalNote2;}
        if (verbalNote3 >= 0 && verbalNote3 <=100){this.course3.verbalNote = verbalNote3;}
    }

    void noteInfo(Course course){
        double avaregeCourseInfo;
        avaregeCourseInfo = (course.note * 0.8) + (course.verbalNote * 0.2);
        System.out.println(course.name + " notu : " + course.note + " Sözlü notu : " + course.verbalNote
        + "\tOrtalamanız : " + avaregeCourseInfo);
    }

    double avarageNote(){
        double avarage;
        avarage = ((this.course1.note + this.course2.note + this.course3.note) * 0.8) +
                ((this.course1.verbalNote + this.course2.verbalNote + this.course3.verbalNote) * 0.2);
        avarage /= 3.0;
        return avarage;
    }

    void printNote(){
        noteInfo(this.course1);
        noteInfo(this.course2);
        noteInfo(this.course3);
        if (avarageNote() >= 55){
            System.out.println("Hababam uyanıyor.");
            System.out.println(this.name + " ortalamanız : " + avarageNote());
            this.isPass = true;
        }else {
            System.out.println("Hababam sınıfta kaldı.");
            System.out.println(this.name + " ortalamanız : " + avarageNote());
        }
    }
}
