package com.kang2;

public class Application {
  public static void main(String[] args) {

    Character character1 = new Character("강성훈", 200, 5000);
    Character character2 = new Character("박찬진", 1, 100);


    character2.attack(character1, 500);

  }
}
