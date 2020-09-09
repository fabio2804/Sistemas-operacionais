package view;

import java.util.Random;

import controller.ThreadController;

public class Main {

  public static void main(String[] args) {
    int[] vet = new int[1000];
    
    Random gerador = new Random();
    
    for(int i = 0; i<vet.length; i++) {
      vet[i] = gerador.nextInt(101);
    }
    
    for(int i = 1; i <= 2; i++) {
      ThreadController thread = new ThreadController(vet, i);
      thread.start();
    }
  }

}
