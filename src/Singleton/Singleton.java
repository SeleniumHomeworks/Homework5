package Singleton;

public class Singleton {


static Singleton object = new Singleton();

private Singleton(){}

public static Singleton getInstance(){
    System.out.println("instance of object");
    return object;

}

}
