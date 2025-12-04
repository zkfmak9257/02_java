package com.kang.character;

public class Character {

  String name;
  int level;
  int hp;

  public Character(String name, int level, int hp){
    this.name = name;
    this.level = level;
    this.hp = hp;
  }

  public void introduce() {
    System.out.println("이름: " + name + ", 레벨: " + level + ", HP: " + hp);
  }

  public void takeDamage(int damage) {
    // 공격을 받기 전 HP 출력
    System.out.println("현재 HP : " + hp );

    hp = hp - damage;
    System.out.println(damage + "의 피해를 입었습니다!");
    if(hp < 0) {
      hp = 0;
    }
    System.out.println("남은 HP:" + hp);

  }
  public void attack(Character target, int damage) {
    System.out.println(this.name + "이(가), " + target.name + "를 공격했습니다.");
    target.takeDamage(damage);
  }
}

