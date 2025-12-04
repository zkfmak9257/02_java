package com.kang.section02.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
  public static void main(String[] args) {

    /* FileOutputStream
      - 바이트 기반 파일 출력 스트림

     (java -> 파일)
     */
    /* 파일 출력 스트림의 대상이 존재하지 않는다면 자동으로 파일이 생성된다.
    단, 경로가 잘못되면 FileNotFoundException 발생

    - append option
     - true로 설정하면 이어쓰기
     - false로 설정하면 덮어쓰기 (기본값)

    */

    try(FileOutputStream fos = new FileOutputStream("testOutputStream.txt",false)){

      // 1) 1byte씩 출력하기
//    fos.write('A');
//    fos.write('B');
//    fos.write('C');
//    fos.write('D');
//    fos.write('E');
//    fos.write('가'); // 한글이 깨짐
//    fos.write('E');

      // 2) byte[] 출력하기
      // - 1바이트 단위로 출력하지만
      // 배열로 묶어서 출력하면 글자가 깨지지 않음
      byte[] bytes = {97, 98, 99, 100, 101};
      bytes = "강성훈".getBytes();
      fos.write(bytes);

      fos.write(new byte[]{65,66,67,68,69,70}, 1, 3);


      System.out.println("===== 파일 출력 완료 ======");


    }catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
