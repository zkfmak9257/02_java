package com.kang.section01.list.service;

import com.kang.section01.list.comparator.AscendingPrice;
import com.kang.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {


  private List<BookDTO> bookList;  //이건 뭐지? 객체 들어갈 변수
  // 무슨 인터페이스인가? 인터페이스 아니고 참조매개변수임. 이제 밑에서 객체 생성되면 ArrayList객체로 초기화 해줄거임
  // null? 참조매개변수가 가리키는 주소 없을때
  // 생성자를 통해 생성된 객체는 heap 영역에 저장

  public BookService() {
    bookList = new ArrayList<>();

    bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
    bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
    bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
    bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
    bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));


  }

  // geter가 외부에서 불러올 수 있게 하는거
  public List<BookDTO> getBookList() {
    return bookList;
  }

  /**
   * 책 목록에서 번호 (Number)가 일치하는 책을 찾아서 반환
   * @param bookNumber
   * @return BookDTO 또는 null
   */


  public BookDTO selectBookNumber(int bookNumber) {

    // 반복문을 이용해서 모든 책 인스턴스에 접근
    for(BookDTO book : bookList){
      if(book.getNumber() == bookNumber) return book; // 하나 꺼낸 숫자와 검색하려했던 숫자와 같으면 book을 반환하겠다. 이건 주소값 얕은복사




    }

    return null; // 번호가 일치하는 책이 없음

  }

  /**
   * 책 목록에 새로운 책 추가
   * 단, "제목"이 중복되는 책은 추가 X
   * 반환되는 number는 마지막 number + 1
   * @param newBook
   * @return number 또는 0
   */

  public int addBook(BookDTO newBook) {

    // 중복 체크
    for(BookDTO book : bookList){
     if(book.getTitle().equals(newBook.getTitle()))
       return 0;// 중복인 경우
    }

    // 다음 번호 생성 자연수(1~) 0~ -1
    int nextNumber = bookList.get(bookList.size()-1).getNumber() + 1;

    // 책 정보를 목록에 추가
    newBook.setNumber(nextNumber); // < -- sector 잖아 이게 외부에서 가져가게 해준다는거지?
    bookList.add(newBook);

    return newBook.getNumber(); // 생성된 책 번호 반환

  }


  /**
   * 도서 목록에서 번호가 일치하는 책 제거
   * @param bookNumber
   * @return 제거된 BookDTO 또는 null이 반환될 예정
   */
  public BookDTO deleteBook(int bookNumber) {

    // 반복문을 이용해서 모든 책 인스턴스에 접근
    // -> 똑같은 번호의 책을 목록에서 제거 후 반환

    for(int i = 0 ; i < bookList.size() ; i ++) {
      if(bookList.get(i).getNumber() == bookNumber){ // bookNumber가 4면, i=5일 때, remove()
        return bookList.remove(i);
      }

    }

    return null;
  }

  /**
   * 책 제목 중 일부라도 keyword와 일치하는 책을 모두 반환
   * @param keyword
   * @return searchBookList
   */

  public List<BookDTO> searchBook(String keyword) {
    List<BookDTO> searchBookList = new ArrayList<>();

    for(BookDTO book : bookList) {
      // 제목에 keyword가 포함되어 있으면 true
      if(book.getTitle().contains(keyword)) {
        searchBookList.add(book); // 검색된 책 목록에 keyword 포함 책 추가
      }
    }


    return searchBookList;
  }

  /**
   * List 복사본을 만들어서 정렬 후 반환
   * @param sortingNumber
   * @return sortedBookList
   *
   */
  public List<BookDTO> sortBookList(int sortingNumber) {

    // Collections.sort() -> 원본 정렬


    // 스트림을 이용한 List 깊은 복사
    List<BookDTO> sortedList
        = bookList.stream().map(BookDTO::new).collect(Collectors.toList());


    if(sortingNumber == 1 ) {
      Collections.sort(sortedList);
    } else { // 가격 오름 차순 ( 추가 정렬 기준 )
      Collections.sort(sortedList, new AscendingPrice());
    }

    return sortedList;

  }
}
