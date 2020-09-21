package view;

import controller.CrossingController;

import java.util.concurrent.Semaphore;

public class Main {
  public static void main(String[] args) {
    Semaphore semaphore = new Semaphore(1);

    for(int i = 0; i < 4; i++) {
      CrossingController crossing = new CrossingController(semaphore, (i+1));
      crossing.start();
    }
  }
}
