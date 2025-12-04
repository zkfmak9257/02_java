package com.kang.section03.references;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Application3 {

  public static void main(String[] args) {


    /* */
    /* 람다식 */

    Function<String, Member> function1
        = name -> new Member(name);
    
    Member member1 = function1.apply("user01");
    System.out.println("member1 = " + member1);

    /* 생성자 메서드 참조
    * - 메서드명이 아닌 new를 :: 뒤에 붙임
    * */
    Function<String, Member> function2
        = Member::new; // 생성자를 참조하겠따 String전달받은것을 new로 그대로 전달하고 멤버로 다시 전달 ? 스트림 참조랑 정적 참조

    Member member2 = function2.apply("user02");
    System.out.println("member2 = " + member2);


    /* 스트림 맛보기 + 메서드 참조 */
    List<String> idList = new ArrayList<>();
    idList.add("id1");
    idList.add("id2");
    idList.add("id3");

    List<Member> memberList
        = idList.stream().map(Member::new).collect(Collectors.toList());

    memberList.stream().forEach(System.out::println);

  }
}
