package view;

import controller.CorridorController;

import java.util.concurrent.Semaphore;

public class Main {
  public static void main(String[] args) {
    Semaphore semaphore = new Semaphore(1);

    for(int i = 0; i < 4; i++) {
      CorridorController corridor = new CorridorController((i+1), semaphore);
      corridor.start();
    }
  }
}
