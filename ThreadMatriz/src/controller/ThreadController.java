package controller;

public class ThreadController extends Thread{
  private final int [][] matrix;
  public int i;

  public ThreadController(int[][] matrix, int i) {
    this.matrix = matrix;
    this.i = i;

  }

  public void run() {
    calc(matrix, i);
  }

  public void calc(int[][] matrix, int i) {
    int soma = 0;

      for (int j = 0; j < 5; j++) {
        soma += matrix[i][j];
      }

    System.out.println("A thread " + getId() + " somando a " + (i+1) + " linha da matriz teve resultado de: " +soma);
  }
}
