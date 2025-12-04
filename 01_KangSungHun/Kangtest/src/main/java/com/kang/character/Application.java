package com.kang.character;

public class Application {
  public static void main(String[] args) {

    Character character1 = new Character("박찬진", 100,500);
    Character character2 = new Character("강성훈", 999,9999);

    character1.attack(character2, 600);

  }
}
