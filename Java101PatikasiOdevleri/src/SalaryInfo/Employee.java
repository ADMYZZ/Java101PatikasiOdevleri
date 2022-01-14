package SalaryInfo;

public class Employee {
    //Employee employee;
    String name;
    double salary;
    int hireYear;
    double workHours;
    int actualYear;

    Employee(String name, double salary, double workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.actualYear = 2021;
    }

    public double tax(){
        double tax;

        if(this.salary <= 1000){
            return 0;
        }else {
            tax = this.salary * 0.03;
            return tax;
        }
    }

    public double bonus(){
        double bonus;
        double bonusPrice = 30;

        if (this.workHours <= 40){
            return 0;
        }else{
            bonus = (this.workHours - 40) * bonusPrice;
            return bonus;
        }
    }

    public double raiseSalary(){
        double raiseSalary;

        if (this.actualYear - this.hireYear < 10){
            raiseSalary = (this.salary * 0.05);
        }else if(this.actualYear - this.hireYear < 20){
            raiseSalary = (this.salary * 0.1);
        }else {
            raiseSalary = (this.salary * 0.15);
        }
        return raiseSalary;
    }

    public void employeeInfo(){
        System.out.print("Adı : " + this.name +
                "\nMaaşı : " + this.salary +
                "\nBaşlangıç Yılı : " + this.hireYear +
                "\nÇalışma Saati : " + this.workHours +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş Artışı : " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş : " + (this.salary - tax() + bonus()) +
                "\nToplam Maaş : " + (this.salary - tax() + bonus() + raiseSalary()));
    }
}
