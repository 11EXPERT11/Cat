package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Murka", 8, 50),
                new Cat("Barsik", 6,60),
                new Cat("Proshka", 9,40),
                new Cat("Pitoshka", 11,55)
        };

        Bowl bowl = new Bowl();
        bowl.PutFoodIntBowl(30);

        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.println(bowl.getFood());
        }

    }
}
