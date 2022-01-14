package SimpleBoksGame;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public boolean checkWeight() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    void run(){
        if (checkWeight()){
            while(this.f1.health > 0 && this.f2.health >0){
                double change = Math.random() * 100;
                if (change < 49.9) {
                    System.out.println("======== YENİ ROUND ===========");
                    this.f2.health = this.f1.hit(this.f2);
                    this.f1.health = this.f2.hit(this.f1);
                    this.f1.infoHealt();
                    this.f2.infoHealt();
                    isWin();
                }else {
                    System.out.println("======== YENİ ROUND ===========");
                    this.f1.health = this.f2.hit(this.f1);
                    this.f2.health = this.f1.hit(this.f2);
                    this.f1.infoHealt();
                    this.f2.infoHealt();
                    isWin();
                }
            }
        }else {
            System.out.println("Ağırlıklar uyuşmuyor.");
        }
    }

    public boolean isWin() {
        if (this.f1.health == 0 && this.f2.health ==0){
            System.out.println("Maç berabere bitti.");
        }else if (this.f1.health == 0) {
            System.out.println("Maçı Kazanan : " + this.f2.name);
            return true;
        }else if (this.f2.health == 0){
            System.out.println("Maçı Kazanan : " + this.f1.name);
            return true;
        }
        return false;
    }
}
