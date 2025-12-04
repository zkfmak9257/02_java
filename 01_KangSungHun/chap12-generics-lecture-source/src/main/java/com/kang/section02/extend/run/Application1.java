package com.kang.section02.extend.run;

import com.kang.section02.extend.*;

public class Application1 {

  public static void main(String[] args) {

    /* extend 키워드를 이용한 제네릭 타입 범위 제한 */
    // RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();

    /* Rabbit 또는 후손 타입으로 인스턴스 생성 가능 */
    RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
    RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
    RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

    farm1.setRabbit(new Rabbit());
    farm2.setRabbit(new Bunny());
    farm3.setRabbit(new DrunkenBunny());

    farm1.getRabbit().cry();
    farm2.getRabbit().cry();
    farm3.getRabbit().cry();

  }
}
