package controller;

  public class ThreadController extends Thread {

    public ThreadController() {}

    @Override
    public void run() {
      System.out.println("Thread Id° " + getId());
    }
}
