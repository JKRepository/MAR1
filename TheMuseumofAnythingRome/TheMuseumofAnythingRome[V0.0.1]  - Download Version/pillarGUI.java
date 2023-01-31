import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import javax.sound.sampled.*;

public class pillarGUI extends JFrame implements ActionListener

  {
 
    private JPanel contentPane;
    private ImageIcon pillarTypes;
    private JLabel pT1;
    private JTextArea Info, Info1;








    public pillarGUI(){
      String home = System.getProperty("user.home");
      
      this.setTitle(" C O R I N T H I A N  D Y N A M I T E ");
      this.setSize(800,500);
      contentPane = new JPanel(null);
      contentPane.setPreferredSize(new Dimension(800,500));
      contentPane.setBackground(new Color(245,245,245));
      
      
      
      
      
      
      pillarTypes = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\Pillars.png");
      pT1 = new JLabel(pillarTypes);
      pT1.setBounds(200,250,400,250);
      pT1.setVisible(true);
      contentPane.add(pT1);
      // im absolutely LOSING IT AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa time:4:11

      Info = new JTextArea();
       Info.setBounds(0,0,250,200);
       Info.setBackground(new Color(245,245,245));
       Info.setForeground(new Color(0,0,0));
       Info.setEnabled(true);
       Info.setFont(new Font("sansserif",0,14));
       Info.setText("Beleive it or not, Roman pillars were\n much more complicated than they may \n initially see, with three \n different types of pillars \n each pillar has its own \n unique design motif.");
       Info.setBorder(BorderFactory.createBevelBorder(1));
       Info.setVisible(true);
       Info.setEditable(false);
       contentPane.add(Info);

       Info1 = new JTextArea();
       Info1.setBounds(550,0,250,200);
       Info1.setBackground(new Color(245,245,245));
       Info1.setForeground(new Color(0,0,0));
       Info1.setEnabled(true);
       Info1.setFont(new Font("sansserif",0,14));
       Info1.setText("There were three main different types of orders: \n Doric, Ionic, and Corinthian. \n the Doric featured a more stout design, \n while the Ionic is recognized by its \n 'Scrolls' at the top, \n and finally the Corinthian by \n ornate design.");
       Info1.setBorder(BorderFactory.createBevelBorder(1));
       Info1.setVisible(true);
       Info1.setEditable(false);
       contentPane.add(Info1);
       //words man, we made em up
       // my spacial awareness has gone up tenfold by constantly putting things in different places ad nauseam
      
      
      
      
      
      
      
      this.add(contentPane);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      this.setLocationRelativeTo(null);
      this.pack();
      this.setVisible(true);
      
      
      
    

    } // end of constructor

   

}


