package assignments12;
//single inheritance
class Animal {
 void eat() {
     System.out.println("Animal is eating");
 }
}
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking");
 }
}
public class SingleInheritanceDemo {
 public static void main(String[] args) {

     Dog myDog = new Dog();
     myDog.eat();
     myDog.bark();
 }
}

