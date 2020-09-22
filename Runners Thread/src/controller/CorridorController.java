package controller;

import java.util.concurrent.Semaphore;

public class CorridorController extends Thread {
  private final Semaphore semaphore;
  private static int order;
  private int speedWalking;
  private int idPerson;
  private int speedCrossDoor;

  public CorridorController(int idPerson, Semaphore semaphore) {
    this.semaphore = semaphore;
    this.idPerson = idPerson;
  }

  @Override
  public void run() {
    walking();
    try {
      semaphore.acquire();
      crossDoor();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      semaphore.release();
      order++;
      System.out.println("A pessoa " + idPerson + " chegou na " + order + " posição em " + (200 / speedWalking) + " segundos, levando " + speedCrossDoor + " segundo(s) para abrir a porta");
    }
  }

  private void walking() {
    speedWalking = (int) (Math.random() * 3) + 4;
    int walked = 0;
    final int dist = 200;

    while (walked < dist) {
      walked += speedWalking;
    }


    System.out.println("A pessoa " + idPerson + " caminhou em uma velocidade de: " + speedWalking + " M/S.");
  }

  private void crossDoor() {
    speedCrossDoor = (int) (Math.random() * 2) + 1;

    sleepSpeedDoor(speedCrossDoor);
  }

  private void sleepSpeedDoor(int speedCrossDoor) {
    try {
      sleep(speedCrossDoor * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
