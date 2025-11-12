package interfaceintro;

public class Cat implements Animal{

    @Override
    public void speak(){
        System.out.println("Meow...Meow");
    }

    @Override
    public void move(){
        System.out.println("Cat is moving");
    }

}
