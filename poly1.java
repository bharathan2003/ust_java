
public class poly1 {

       public static void main(String args[]){

        Animal animal = new Animal();
        animal.Sound();

        Bird bird = new Bird();
        bird.Sound();
        
        Cat cat = new Cat();
        cat.Sound();

    }
}
class Animal{
    void Sound(){
        System.out.println("Animal base class");
    }
}
class Bird extends Animal{
    void Sound(){
        System.out.println("Bird subclass");
    }
}
class Cat extends Animal{
       void Sound(){
        System.out.println("Cat subclass");
       }
}

