package OOPS;

public class Inheritence1 {
    public static void main(String[] args) {
        Dog tomy = new Dog();
        tomy.eat();
        tomy.bark();
        tomy.breath();
        
        tomy.legs = 4;

        System.out.println(tomy.legs);
        tomy.color = "pink";
        System.out.println(tomy.color);
        Animal toy = new Animal();
        toy.color = "red";
        System.out.println(toy.color);
        puppy To = new puppy();
        To.color = "Black";
        System.out.println(To.color);
        To.cry();
        To.legs = 4;
        To.breed = "DOBERMAN";
        System.out.println(To.breed);

    }

}

class Animal {
    String color;

    void eat() {
        System.out.println("eat");
    }

    void breath() {
        System.out.println("it can breadth");
    }

    void sleep() {
        System.out.println("it can sleep");
    }
}

class Dog extends Animal {
    int legs;

    void bark() {
        System.out.println("IT CAN BARK");
    }
}

class puppy extends Dog {
    String breed;

    void cry() {
        System.out.println("he will cry");
    }

}