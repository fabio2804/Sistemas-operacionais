package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import org.omg.CORBA.portable.InputStream;

public class RedesController {
  
  public RedesController() {
    super();
  }
  
  public String so() {
    String so = System.getProperty("os.name");
    so = so.split(" ")[0];
    System.out.println(so);
    
    return so;
  }
  
  public void ip(String so) {
    String process = " ";
    String ipv4 = "ipv4";
    String adaptador = "adaptador";
    String nomeAdaptador = " ";
    
    if (so.equals("Windows")) {
      System.out.println("É Windows");
      process = "ipconfig";
    } else {
      System.out.println("É Linux");
      process = "ip addr show";
      adaptador = "<";
      ipv4 = "inet ";
    }
      
    try {
      Process p = Runtime.getRuntime().exec(process);
      InputStream fluxo = (InputStream) p.getInputStream();
      InputStreamReader leitor = new InputStreamReader(fluxo);
      BufferedReader buffer = new BufferedReader(leitor);
      String linha = buffer.readLine();
      StringBuffer bufferPrint = new StringBuffer();
      
      while (linha != null) {
        
        if (so.toLowerCase().equals("windows")) {
          if (linha.toLowerCase().contains(adaptador) ) {
            bufferPrint.append("Adaptador: " + linha + "\n\n");
          }
          if (linha.toLowerCase().contains(ipv4)) {
            bufferPrint.append(linha + "\n\n");
          }
        }else {
          if (linha.toLowerCase().contains(adaptador)) {
            linha = linha.split(" ")[1];
            
            nomeAdaptador = linha;
            
            linha = buffer.readLine();
          }
          
          if (linha.toLowerCase().contains(ipv4)) {
            bufferPrint.append("Adaptador: " + nomeAdaptador + "\n");
            
            bufferPrint.append(linha + "\n\n");
            
          }
          
        }
        
        linha = buffer.readLine();

      }
      
      JOptionPane.showMessageDialog(null, bufferPrint);
      
      buffer.close();
      leitor.close();
      fluxo.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
}

