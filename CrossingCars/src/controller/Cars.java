package controller;

import java.util.concurrent.Semaphore;

public class Cars extends Thread{
  private int carId;
  private Semaphore semaphore;
  final private String [] directions = {"Norte", "Sul", "Leste", "Oeste"};
  private static int direction = 0;

  public Cars(Semaphore semaphore, int carId) {
    this.semaphore = semaphore;
    this.carId = carId;
  }

  @Override
  public void run() {
    try {
      semaphore.acquire();
      crossRoad();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      semaphore.release();
    }
  }

  private void crossRoad() {
    System.out.println("O carro " + carId + " cruzou a avenida, na direção " + directions[direction]);
    direction++;
  }
}