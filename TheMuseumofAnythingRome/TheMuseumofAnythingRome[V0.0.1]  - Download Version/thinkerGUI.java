import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import javax.sound.sampled.*;

public class thinkerGUI extends JFrame implements ActionListener

  {
 
    private JPanel contentPane;
    private JTextArea infoOne;
    private JTextArea quote;
    private ImageIcon Marcus;
    private JLabel M1;
    


    public thinkerGUI(){
      String home = System.getProperty("user.home");

      this.setTitle(" C O G I T O  E R G O  S U M ");
      this.setSize(800,500);
      contentPane = new JPanel(null);
      contentPane.setPreferredSize(new Dimension(800,500));
      contentPane.setBackground(new Color(245,245,245));
      
      
      infoOne = new JTextArea();
      infoOne.setBounds(0,0,280,230);
      infoOne.setBackground(new Color(245,245,245));
      infoOne.setForeground(new Color(0,0,0));
      infoOne.setEnabled(true);
      infoOne.setFont(new Font("sansserif",0,14));
      infoOne.setText("Roman philosophy was not only prominent \nin Roman culture, but also part of their \nlifestyle. \nFamous orators such as Cicero utilized \nrhetoric in order to make convincing \nargument and gain fame.\nOther forms of philosophy also existed, \nof course.\nSuch is Marcus Aurelius, the 16th \nemperor of Rome, who practiced \nStoicism.");
      infoOne.setBorder(BorderFactory.createBevelBorder(1));
      infoOne.setVisible(true);
      infoOne.setEditable(false);
      contentPane.add(infoOne);

      quote = new JTextArea();
      quote.setBounds(500,10,210,80);
      quote.setBackground(new Color(245,245,245));
      quote.setForeground(new Color(0,0,0));
      quote.setEnabled(true);
      quote.setFont(new Font("sansserif",0,14));
      quote.setText("Uhhh, be cool. \n        -Marcus Aurelius,Probably");
      quote.setBorder(BorderFactory.createBevelBorder(1));
      quote.setVisible(true);
      quote.setEditable(false);
      contentPane.add(quote);

      Marcus = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\MarcusAurelius.png");
      M1 = new JLabel(Marcus);
      M1.setBounds(500,100,300,393);
      M1.setVisible(true);
      contentPane.add(M1);
      
      
      
      
      
      
      this.add(contentPane);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      this.setLocationRelativeTo(null);
      this.pack();
      this.setVisible(true);
      
      
      
    

    } // end of constructor

   

}


