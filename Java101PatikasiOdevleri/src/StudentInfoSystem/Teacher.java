package StudentInfoSystem;

public class Teacher {
    String name;
    String mpNo;
    String branch;

    Teacher(String name,String mpNo, String branch){
        this.name = name;
        this.mpNo = mpNo;
        this.branch = branch;
    }

    void printTeacherInfo(){
        System.out.println("Adı : " + this.name);
        System.out.println("Bölümü : " + this.branch);
        System.out.println("Telefon No : " + this.mpNo);
    }
}
