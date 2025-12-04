package com.kang.abstractpractice;

public class Application {

  public static void main(String[] args) {

    Animal animal = new Animal("뽀삐",20);
    Animal animal2 = new Animal("진호",26);

    System.out.println("animal2.name = " + animal2.name);
    

    System.out.println("animal.bark() = " + animal.bark());

  }
}
