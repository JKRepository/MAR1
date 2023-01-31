import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.lang.ProcessHandle.Info;

import javax.sound.sampled.*;

public class colosseumGUI extends JFrame implements ActionListener

  {
 
    private JPanel contentPane;
    private ImageIcon murmillo, retarius, gladiator;
    private JLabel m1, r1, g1;
    private JTextArea Info, translation;








    public colosseumGUI(){
      String home = System.getProperty("user.home");

      this.setTitle(" A V E  I M P E R A T O R ,  M O R I T U R I   T E   S A L U T A N T ");
      this.setSize(800,500);
      contentPane = new JPanel(null);
      contentPane.setPreferredSize(new Dimension(800,500));
      contentPane.setBackground(new Color(245,245,245));


      murmillo = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\Murmillo.png");
      m1 = new JLabel(murmillo);
      m1.setBounds(0,240,260,260);
      m1.setVisible(true);
      contentPane.add(m1);
      retarius= new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\Ret.png");
      r1 = new JLabel(retarius);
      r1.setBounds(300,288,300,212);
      r1.setVisible(true);
      contentPane.add(r1);
      gladiator = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\Gladiator.png");
      g1 = new JLabel(gladiator);
      g1.setBounds(550,125,250,375);
      g1.setVisible(true);
      contentPane.add(g1);

      Info = new JTextArea();
      Info.setBounds(50,0,250,200);
      Info.setBackground(new Color(245,245,245));
      Info.setForeground(new Color(0,0,0));
      Info.setEnabled(true);
      Info.setFont(new Font("sansserif",0,14));
      Info.setText("The Gladiatoral games \nwere one of the most popular \nactivities for the populace \nin the latter years of the \nRoman Empire, and was often \nused as a tool to releive\ndistress from the populace in  \ntimes of hardship,\neffectively quelling numerous \npotential rebellions.");
      Info.setBorder(BorderFactory.createBevelBorder(1));
      Info.setVisible(true);
      Info.setEditable(false);
      contentPane.add(Info);

      translation = new JTextArea();
      translation.setBounds(450,0,250,200);
      translation.setBackground(new Color(245,245,245));
      translation.setForeground(new Color(0,0,0));
      translation.setEnabled(true);
      translation.setFont(new Font("sansserif",0,14));
      translation.setText("Gladiators often yelled \n 'Ave Imperator, Morituri \n Te Salutant, which \n can be translated as \n 'Hail Emperor, those who \n are about to die salute \n you!");
      translation.setBorder(BorderFactory.createBevelBorder(1));
      translation.setVisible(true);
      translation.setEditable(false);
      contentPane.add(translation);







      this.add(contentPane);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      this.setLocationRelativeTo(null);
      this.pack();
      this.setVisible(true);
      
      
      
    

    } // end of constructor

   

}


