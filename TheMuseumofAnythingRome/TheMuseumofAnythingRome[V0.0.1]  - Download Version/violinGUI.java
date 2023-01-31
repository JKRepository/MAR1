import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import javax.sound.sampled.*;

public class violinGUI extends JFrame implements ActionListener

  {
 
    private JPanel contentPane;
    //FINAAAAAAL STREEEEEEEEEEEEEEEEEEEEEEEEEEETCH
    private ImageIcon Nero, Violin;
    private JLabel n1, v1;
    private JTextArea Info;








    public violinGUI(){
      String home = System.getProperty("user.home");
      
      this.setTitle(" F I D D L E  A S  I T  B U R N S ");
      this.setSize(800,500);
      contentPane = new JPanel(null);
      contentPane.setPreferredSize(new Dimension(800,500));
      contentPane.setBackground(new Color(245,245,245));


      Nero = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\Nero.png");
      n1 = new JLabel(Nero);
      n1.setBounds(0,0,300,497);
      n1.setVisible(true);
      contentPane.add(n1);
      
      Violin = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\Violin.png");
      v1 = new JLabel(Violin);
      v1.setBounds(300,368,112,132);
      v1.setVisible(true);
      contentPane.add(v1);
      // oh god I hear birds chirping outside
      // I havent slept in 21 hours

      Info = new JTextArea();
       Info.setBounds(500,0,250,200);
       Info.setBackground(new Color(245,245,245));
       Info.setForeground(new Color(0,0,0));
       Info.setEnabled(true);
       Info.setFont(new Font("sansserif",0,14));
       Info.setText("The expression of 'fiddling while \n Rome burned' is known far and wide, \n attributed to one of the \n most infamous emperors of Rome \n Nero Claudius Ceasar,\n the fiddler himself. Known for many infamous acts such as \n killing his own mother, \n tyranny, extravagance, and even \n was rumored to start the great \n fire of Rome himself!");
       Info.setBorder(BorderFactory.createBevelBorder(1));
       Info.setVisible(true);
       Info.setEditable(false);
       contentPane.add(Info);
       //i think i see the light
       //of the sun that is

      this.add(contentPane);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      this.setLocationRelativeTo(null);
      this.pack();
      this.setVisible(true);
      
      
     
      
    

    } // end of constructor

   

}


