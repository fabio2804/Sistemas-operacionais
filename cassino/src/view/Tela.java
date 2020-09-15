package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CassinoController;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Tela extends JFrame {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTextField textField1;
  private JTextField textField2;
  private JTextField textField3;

  /**
   * Launch the application.
   */
  public static void tela() {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Tela frame = new Tela();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public Tela() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JButton btnIniciar = new JButton("Iniciar");
    btnIniciar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
      }
    });
    btnIniciar.setBounds(184, 227, 89, 23);
    contentPane.add(btnIniciar);
    
    textField1 = new JTextField();
    textField1.setFont(new Font("Arial", Font.BOLD, 40));
    textField1.setEditable(false);
    textField1.setHorizontalAlignment(SwingConstants.CENTER);
    textField1.setBounds(10, 47, 134, 139);
    contentPane.add(textField1);
    textField1.setColumns(10);
    
    textField2 = new JTextField();
    textField2.setFont(new Font("Arial", Font.BOLD, 40));
    textField2.setEditable(false);
    textField2.setHorizontalAlignment(SwingConstants.CENTER);
    textField2.setColumns(10);
    textField2.setBounds(154, 47, 136, 139);
    contentPane.add(textField2);
    
    textField3 = new JTextField();
    textField3.setFont(new Font("Arial", Font.BOLD, 40));
    textField3.setEditable(false);
    textField3.setHorizontalAlignment(SwingConstants.CENTER);
    textField3.setColumns(10);
    textField3.setBounds(300, 47, 124, 139);
    contentPane.add(textField3);
    
    ActionListener botao = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        CassinoController cassino = new CassinoController();
        cassino.setField(textField1);
        cassino.start();
    
        CassinoController cassino2 = new CassinoController();
        cassino2.setField(textField2);
        cassino2.start();
      
        
        CassinoController cassino3 = new CassinoController();
        cassino3.setField(textField3);
        cassino3.start(); 
      }
    };
    btnIniciar.addActionListener(botao);
  }
}
