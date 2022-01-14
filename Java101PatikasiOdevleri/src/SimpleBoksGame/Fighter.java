package SimpleBoksGame;

public class Fighter {
    String name;
    int weight;
    int damage;
    int health;
    double dodge;

    Fighter(String name, int weight,int damage, int health, double dodge){
        this.name = name;
        this.weight = weight;
        this.damage = damage;
        this.health = health;
        this.dodge =  dodge;
    }

    public int hit(Fighter foe){  //Burada foe karşı rakibi temsil etmekte.
        if (foe.dodge()){
            System.out.println(foe.name + " hasarı savurdu.");
            return foe.health;
        }else {
            System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
            if (foe.health - this.damage < 0) {
                return 0;
            }else {
                return foe.health - this.damage;
            }
        }
    }

    public boolean dodge() { // Burada dövüşcünün vuruşu ıskalaması sümüle ediliyor.
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }

    public void infoHealt(){
        System.out.println(this.name + " kalan can => " + this.health);
    }
}
