package com.kang.abstractpractice;

public class Animal {

  String name ;
  int age;
  String valk;


  public Animal(String name, int age) {

    this.name = name;
    this.age = age;
  }


  public String bark() {
    System.out.println("개가 짖었다.");
    return "컹컹";
  }





}

// 메서드를 호출 했을 때 컹컹이라는 문자열을 반환함. 그리고 콘솔에 개가 짖었다.라는 문자열을 출력함




