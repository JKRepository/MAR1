import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import javax.sound.sampled.*;

public class turtleGUI extends JFrame implements ActionListener

  {
 
    private JPanel contentPane;
    private ImageIcon tortle, testudo;
    private JLabel t1,t2;
    private JTextArea Info;
    private JTextField equals;
    //thats right a variable finally had a legitimate reason to use the number 2 in it. We've come so far... too far
    // its 4 am... i started working on this at 12 PM... almost there.........................................







    public turtleGUI(){
      String home = System.getProperty("user.home");
      
      this.setTitle(" T E S T U D O ");
      this.setSize(800,500);
      contentPane = new JPanel(null);
      contentPane.setPreferredSize(new Dimension(800,500));
      contentPane.setBackground(new Color(245,245,245));
      
      
      tortle = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\tortle.png");
      t1 = new JLabel(tortle);
      t1.setBounds(500,330,300,170);
      t1.setVisible(true);
      contentPane.add(t1);

      testudo = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\testudo.png");
      t2 = new JLabel(testudo);
      t2.setBounds(0,295,300,205);
      t2.setVisible(true);
      contentPane.add(t2);
      
      equals = new JTextField();
       equals.setBounds(362,400,40,40);
       equals.setBackground(new Color(255, 255, 255,0));
       equals.setForeground(new Color(0,0,0,255));
       equals.setEnabled(true);
       equals.setFont(new Font("sansserif",0,80));
       equals.setText("=");
       equals.setVisible(true);
       equals.setEditable(false);
       contentPane.add(equals);
      
       Info = new JTextArea();
       Info.setBounds(275,0,250,200);
       Info.setBackground(new Color(245,245,245));
       Info.setForeground(new Color(0,0,0));
       Info.setEnabled(true);
       Info.setFont(new Font("sansserif",0,14));
       Info.setText("The Roman Testudo, also known as \n the shield formation is one of \n the most well known \n military formations due to \n its defensive versatility and \n its near exclusive use by the Romans. \n Often used to get pass the archers \n of an opposing force, the\n Testudo was a tried and tested \n strategic tool of its time.");
       Info.setBorder(BorderFactory.createBevelBorder(1));
       Info.setVisible(true);
       Info.setEditable(false);
       contentPane.add(Info);
      
      
      
      
      
      
      this.add(contentPane);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      this.setLocationRelativeTo(null);
      this.pack();
      this.setVisible(true);
      
      
     
      
    

    } // end of constructor

   

}


