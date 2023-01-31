import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import javax.sound.sampled.*;

public class horseGUI extends JFrame implements ActionListener

  {
 
    private JPanel contentPane;
    private JTextArea About;
    private ImageIcon hort, boot, buht;
    private JLabel h1, b1, bh1;








    public horseGUI(){
      String home = System.getProperty("user.home");
      
      this.setTitle(" I N C I T A T U S");
      this.setSize(800,500);
      contentPane = new JPanel(null);
      contentPane.setPreferredSize(new Dimension(800,500));
      contentPane.setBackground(new Color(245,245,245));

      About = new JTextArea();
      About.setBounds(400,0,300,200);
      About.setBackground(new Color(245,245,245));
      About.setForeground(new Color(0,0,0));
      About.setEnabled(true);
      About.setFont(new Font("sansserif",0,14));
      About.setText("So who's this silly dude \n h o r s i n g a r o u n d ? \n This here is emperor Caligula, or as \n we like to call him around here 'little boot'! \n did you know that boot here was \n so devoted to his horse Incitatus \n that he gave it the position of senator?\n Imagine that!");
      About.setBorder(BorderFactory.createBevelBorder(1));
      About.setVisible(true);
      About.setEditable(false);
      contentPane.add(About);
      
      
      boot = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\Boot.png");
      b1 = new JLabel(boot);
      b1.setBounds(0,240,260,260);
      b1.setVisible(true);
      contentPane.add(b1);

      buht = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\buht.png");
      bh1 = new JLabel(buht);
      bh1.setBounds(400,250,150,263);
      bh1.setVisible(true);
      contentPane.add(bh1);

      hort = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\hort.png");
      h1 = new JLabel(hort);
      h1.setBounds(0,80,247,252);
      h1.setVisible(true);
      contentPane.add(h1);
      
      this.add(contentPane);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      this.setLocationRelativeTo(null);
      this.pack();
      this.setVisible(true);
    

    } // end of constructor

   

}


