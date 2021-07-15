package lesson7;

public class Bowl {
    private int food;
    public void PutFoodIntBowl(int amount){
        this.food +=amount;
        System.out.printf("Food increased for %d now\n", amount, this.food);
    }
    public boolean decreaseFoodFromBowl (int amount){
        if (this.food < amount){
            System.out.printf("There not enough food %d, present, %d you want", this.food, amount);
            return false;
        }
        this.food -=amount;
        System.out.printf("Food decreased for %d now\n", amount, this.food);
        return true; }
    public int getFood() {return food;}

}

