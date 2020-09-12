package view;

import controller.ThreadController;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    int[][] matrix = new int[3][5];
    Random generator = new Random();

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        matrix[i][j] = generator.nextInt(101);
        System.out.print(matrix[i][j] + "\t");
      }
      System.out.println();
    }

    for (int i = 0; i < 3; i++) {
      ThreadController thread = new ThreadController(matrix, i);
      thread.start();
    }
  }
}
