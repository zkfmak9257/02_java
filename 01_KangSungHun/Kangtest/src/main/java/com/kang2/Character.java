package com.kang2;

public class Character {

  String name;
  int level;
  int hp;

  public Character(String name, int level, int hp) {

    this.name = name;
    this.level = level;
    this.hp = hp;

  }

  public void introduce() {
    System.out.println("이름:" + name + ", 레벨:" + level + ", HP: " + hp);
  }

  public void takeDamage(int damage) {
    System.out.println("현재 : " + hp );
    hp = hp - damage;
    if(hp < 0) {
      hp = 0;
    }
    System.out.println(damage + "의 피해를 입었습니다.");
    System.out.println("남은 HP: " + hp);
  }

  public void attack(Character target, int damage) {

    System.out.println(this.name + "이(가)" + target.name + "을(를) 공격했습니다!");

    target.takeDamage(damage);

  }
}
