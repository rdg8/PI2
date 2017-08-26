/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingapp02;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author rodrigo.rsantos17
 */

public class SwingApp02 {
    
    /* lambda
        Runnable thread= () -> {
            criarGUI();
        };
        SwingUtilities.invokeLater(thread);
    }*/
    
    public static void main(String[] args) {
        Runnable thread= new Runnable(){
            public void run(){
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(thread);
    }
    
    
    
    
   
    public static void criarGUI(){
        JFrame  frame = new JFrame();
        
        //Dimension dimension = new Dimension(400,600); 
        //frame.setMinimumSize(dimension);
        
        frame.setMinimumSize(new Dimension(600,400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setTitle("Primeira aplicacao");
        
        //JPanel paineis
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        
        //JLabel texto
        JLabel label = new JLabel("TEXTO");
        panel.add(label);
        
        //JTextField caixa de texto (entrada)
        final JTextField field = new JTextField(10);
      
        panel.add(field);
        
        //JButton botao
        JButton button = new JButton("Botão");
        //ActionListenerr
       /* TestActionListener listener = new TestActionListener();
        button.addActionListener(listener);
        panel.add(button);*/
       
        /*
        ActionListener listener = new ActionListener(){
            public void actionPerformed(ActionEvent e){
               System.out.println("Clicou no botão com AL implementado diretamente");
            }
        };
        button.addActionListener(listener);
        panel.add(button);*/
        
        //aparece box na dela com o texto digitado no campo
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame,"valor digitado: "+ field.getText());
            }
        });
        panel.add(button);
        
        //add check box
        JCheckBox checkBox0l = new JCheckBox("Bacon");
        panel.add(checkBox0l);
        
        JCheckBox checkBox02 = new JCheckBox("Cheddar");
        panel.add(checkBox02);
        
        
        
        ItemListener itemListener = new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                    System.out.println("Selecionado");
                }
            }
        };
       
        checkBox0l.addItemListener(itemListener);
        
        //button 2
        JButton button2 = new JButton("Botão 02");
        panel.add(button2);
        
        
         
        //JRadioButton 
        JRadioButton radio01 = new JRadioButton("M"); 
        panel.add(radio01);
        JRadioButton radio02 = new JRadioButton("G"); 
        panel.add(radio02);
        //agrupando os radios
        ButtonGroup group = new ButtonGroup();
        group.add(radio01);
        group.add(radio02); 
        
         //array
        String[] Batatas = {"batata", "Batata doce", "Batata Frita", "pure de Batata", ""};
        //JComboBox    coloque um array dentro do comobo box
        JComboBox combosBatatas = new JComboBox(Batatas);
        panel.add(combosBatatas);
          
        
        //box dos checksbox select e radios e JComboBox
         button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame,"Item 01 Selecionado: "+ checkBox0l.isSelected() + "\nItem Cheddar: "
                + checkBox02.isSelected() +"\nTamanho M "+ radio01.isSelected() + "\nTamanho G: " +radio02.isSelected()
                + "\nCombos de batatas: "+ combosBatatas.getSelectedItem());
            }
        });
        
        
        frame.pack();
        frame.setVisible(true);
    }
}
