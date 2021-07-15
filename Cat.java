package lesson7;

public class Cat {
    public String name;
    public int appetite;
    public int satiety;


    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Bowl bowl){
        bowl.decreaseFoodFromBowl(appetite);
        System.out.printf("Cat %s ate for %d food\n", this.name, this.appetite); }


    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getSatiety() {
        return satiety;
    }
}
