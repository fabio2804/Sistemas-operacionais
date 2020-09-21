package controller;

import java.util.concurrent.Semaphore;

public class CrossingController extends Thread{
  private Semaphore semaphore;
  private int idCarro;
  private String [] directions = {"norte", "sul", "leste", "oeste"};
  private static int i;

  public CrossingController(Semaphore semaphore, int idCarro) {
    this.idCarro = idCarro;
    this.semaphore = semaphore;
  }

  @Override
  public void run() {
    try {
      semaphore.acquire();
      crossing();
    } catch(InterruptedException e) {
      e.printStackTrace();
    } finally {
      semaphore.release();
    }
  }

  private void crossing() {
    System.out.println("O carro " + idCarro + " cruzou a avenida pela direção " +directions[i]);
    i++;

  }

}
