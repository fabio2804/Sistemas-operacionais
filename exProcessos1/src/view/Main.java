package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main {

  public static void main(String[] args) {
    RedesController redesController = new RedesController();
    int opc;
    String so = redesController.so();
    do {
      opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das opções\n 1- Mostrar IPv4\n 2- Teste de ping \n 9- Finalizar!"));
      
       switch(opc) {
       case 1:
         redesController.ip(so);
         break;
         
       case 2:
         
          break;
         
       case 9:
         JOptionPane.showMessageDialog(null, "O programa foi finalizado!");
         break;
         
       default: 
         JOptionPane.showMessageDialog(null, "Opção inválida!");
         break;
       
       }
    
    } while(opc != 9);
  }

}
