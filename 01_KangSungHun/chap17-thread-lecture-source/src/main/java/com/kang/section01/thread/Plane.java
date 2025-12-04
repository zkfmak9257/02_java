package com.kang.section01.thread;

public class Plane implements Runnable {
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println("Plane flight...");


      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
