package com.kang.section01.list.comparator;

import com.kang.section01.list.dto.BookDTO;

import java.awt.print.Book;
import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {

  // 전달 받은 두 객체의 비교 방법을 정의해서 정렬 기준을 만듦
  // 결과 양수 O -> 뒤로
  // 결과 양수 X -> 앞으로

  /* compareTo(parameter 1) => method => Comparable */
  /* compare(parameter 2) => method => Comparator */
              
//  @Override
//  public int compareTo(BookDTO o1, BookDTO o2) {
//    return this.
//    return o1.getPrice() - o2.getPrice();
//  }

  @Override
  public int compare(BookDTO o1, BookDTO o2) {
    return 0;
  }
}
