package controller;

import java.util.Random;

import javax.swing.JTextField; 

public class CassinoController extends Thread{
  JTextField field;
  public CassinoController () {}
  
  public void run() {
    geraValor();
  }
  
  public void geraValor() {
    Random random = new Random();
    int index = (random.nextInt(150) + 1);
    
    for (int i = 0; i < index; i++) {
      field.setText(Integer.toString(random.nextInt(7) + 1));
      descansar();      
    }
    System.out.println(index);

  }
  
  public void descansar() {
    try {
      Thread.sleep(25);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  
  public void setField(JTextField field) {
    this.field = field;
  }
}
