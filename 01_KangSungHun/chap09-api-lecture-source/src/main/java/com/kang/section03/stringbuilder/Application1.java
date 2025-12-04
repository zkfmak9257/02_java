package com.kang.section03.stringbuilder;

public class Application1 {
  public static void main(String[] args) {

    // String 불변성 확인
    String str1 = "java";
    System.out.println(System.identityHashCode(str1)); // 주소로 만들어진 해시코드 출
    String str2 = str1 + "mariaDB"; //
    System.out.println(System.identityHashCode(str2)); // 주소로 만들어진 해시코드 출
    // -> 결과 다름 == 서로 다른 곳을 참조

    System.out.println("===== StringBuilder =====");
    StringBuilder sb = new StringBuilder();
    System.out.println(System.identityHashCode(sb));

    // StringBuild.append(값) : 값을 제일 뒤에 추가 (덧붙이기)
    sb.append("java");
    System.out.println("sb.toString() = " + sb.toString());
    System.out.println(System.identityHashCode(sb));

    sb.append("java");
    System.out.println("sb.toString() = " + sb.toString());
    System.out.println(System.identityHashCode(sb));

    sb.append("java");
    System.out.println("sb.toString() = " + sb.toString());
    System.out.println(System.identityHashCode(sb));






  }

  }
