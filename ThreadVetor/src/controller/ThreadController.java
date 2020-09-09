package controller;

public class ThreadController extends Thread {
  
  private int[] vet;
  private int x;
  
  public ThreadController(int[] vet, int x) {
    this.vet = vet;
    this.x = x;
  }
   
  public void run() {
    calc(vet, x);
  }

  private void calc(int[] vet, int x) {
    double tempoInicial = 0;
    double tempoFinal = 0;
    double tempoTotal = 0;
    
    switch(x) {
    case 1:
      tempoInicial = System.nanoTime();
      
      for(int item: vet);
      
      tempoFinal = System.nanoTime();
      tempoTotal = (tempoFinal - tempoInicial);
      
      System.out.println("o tempo total da thread# " + getId() + " foi de: " + tempoTotal/Math.pow(10, 9) + "S"); 
      
      break;
    
    case 2:
      tempoInicial = System.nanoTime();
      
      for (int i = 0; i < vet.length; i++) {
      }
      
      tempoFinal = System.nanoTime();
      tempoTotal = (tempoFinal - tempoInicial);
      
      System.out.println("o tempo total da thread# " + getId() + " foi de " + tempoTotal/Math.pow(10, 9) + "S");
      
      break;
    }
  }
}
