import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.io.*;
import javax.sound.sampled.*;

public class mainhubGUI extends JFrame implements ActionListener

  {
 
    private JPanel contentPane;
    private AudioInputStream stream1;
    private AudioFormat format1;
    private DataLine.Info info1;
    private Clip clip1;
    private ImageIcon thinker1C, thinker2C, pillar1C, pillar2C, COLOSSEUMC, HorseC, ViolinC, TurtleC, ooze; //background; scrapped
    private JLabel D1C,D2C,P1C,P2C,C1C,H1C,T1C, V1C, O1; //bg1; scrapped 
    private JTextField Welcome;
    private JTextField clickOn;
    
    // variables that are labeled with C are the ones that are clickable to enter a new panel with stuff!
    // upon further inspection almost all of them are labeled with a C. Ain't that a wonder?

    




    public mainhubGUI(){
      String home = System.getProperty("user.home");
      
      this.setTitle(" A B   U R B E  C O N D I T A ");
      this.setSize(1200,750);
      contentPane = new JPanel(null);
      contentPane.setPreferredSize(new Dimension(1200,750));
      contentPane.setBackground(new Color(245,245,245));
      this.add(contentPane);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);
      this.pack();
      this.setVisible(true);
     
      Welcome = new JTextField();
       Welcome.setBounds(195,30,815,20);
       Welcome.setBackground(new Color(255, 255, 255,0));
       Welcome.setForeground(new Color(0,0,0,255));
       Welcome.setEnabled(true);
       Welcome.setFont(new Font("sansserif",0,14));
       Welcome.setText("What's this? You were supposed to arrive at Rome! You know, 'all roads lead to Rome' and all that! This isn't Rome, this is the ");
       Welcome.setVisible(true);
       Welcome.setEditable(false);
       contentPane.add(Welcome);


       clickOn = new JTextField();
       clickOn.setBounds(195,110,815,20);
       clickOn.setBackground(new Color(255, 255, 255,0));
       clickOn.setForeground(new Color(0,0,0,255));
       clickOn.setEnabled(true);
       clickOn.setFont(new Font("sansserif",0,14));
       clickOn.setText("Well some things from Rome seemed to have made their way over here! Click on them and I'll tell you what I know about them!");
       clickOn.setVisible(true);
       clickOn.setEditable(false);
       contentPane.add(clickOn);

      /*  scrapped because setting an image's transparency is a royal pain
       background = new ImageIcon("D:\\Code Projects\\TheMuseumofAnythingRome[V0.0.1]\\images\\SPCBG.jpg");
       bg1 = new JLabel(background);
       bg1.setBounds(0,0,1200,750);
       bg1.setVisible(true);
       bg1.setBackground(new Color(255,255,255,0));
       contentPane.add(bg1);
      */
      
       ooze = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\PrimordialOoze.gif");
       O1 = new JLabel(ooze);
       O1.setBounds(500,70,220,20);
       O1.setVisible(true);
       contentPane.add(O1);

      thinker1C = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\thinker1.png");
      D1C = new JLabel(thinker1C);
      D1C.setBounds(190,407,256,343);
      D1C.setVisible(true);
      contentPane.add(D1C);
      D1C.addMouseListener(new MouseInputListener(){
      
        @Override
        public void mouseMoved(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseDragged(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseReleased(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mousePressed(MouseEvent e) {
          thinkerPanel();
          
        }
      
        @Override
        public void mouseExited(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseEntered(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseClicked(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      });
      
       
      thinker2C = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\thinker2.png");
      D2C = new JLabel(thinker2C);
      D2C.setBounds(754,407,256,343);
      D2C.setVisible(true);
      contentPane.add(D2C);
      D2C.addMouseListener(new MouseInputListener(){
      
        @Override
        public void mouseMoved(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseDragged(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseReleased(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mousePressed(MouseEvent e) {
          thinkerPanel();
          
        }
      
        @Override
        public void mouseExited(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseEntered(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseClicked(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      });

      pillar1C = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\Pillar1.png");
      P1C = new JLabel(pillar1C);
      P1C.setBounds(0,0,149,750);
      P1C.setVisible(true);
      contentPane.add(P1C);
      P1C.addMouseListener(new MouseInputListener(){
      
        @Override
        public void mouseMoved(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseDragged(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseReleased(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mousePressed(MouseEvent e) {
          pillarPanel();
          
        }
      
        @Override
        public void mouseExited(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseEntered(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseClicked(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      });

      pillar2C = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\Pillar2.png");
      P2C = new JLabel(pillar2C);
      P2C.setBounds(1051,0,149,750);
      P2C.setVisible(true);
      contentPane.add(P2C);
      P2C.addMouseListener(new MouseInputListener(){
      
        @Override
        public void mouseMoved(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseDragged(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseReleased(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mousePressed(MouseEvent e) {
          pillarPanel();
          
        }
      
        @Override
        public void mouseExited(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseEntered(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseClicked(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      });

      COLOSSEUMC = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\Colosseum.png");
      C1C = new JLabel(COLOSSEUMC);
      C1C.setBounds(470,590,260,160);
      C1C.setVisible(true);
      contentPane.add(C1C);
      C1C.addMouseListener(new MouseInputListener(){
      
        @Override
        public void mouseMoved(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseDragged(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseReleased(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mousePressed(MouseEvent e) {
          colosseumPanel();
          
        }
      
        @Override
        public void mouseExited(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseEntered(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseClicked(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      });

      HorseC = new  ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\hort.png");
      H1C = new JLabel(HorseC);
      H1C.setBounds(147,152,247,252);
      H1C.setVisible(true);
      contentPane.add(H1C);
      H1C.addMouseListener(new MouseInputListener(){
      
        @Override
        public void mouseMoved(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseDragged(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseReleased(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mousePressed(MouseEvent e) {
          horsePanel();
          
        }
      
        @Override
        public void mouseExited(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseEntered(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseClicked(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      });

      TurtleC = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\Tort.png");
      T1C = new JLabel(TurtleC);
      T1C.setBounds(820,152,250,249);
      T1C.setVisible(true);
      contentPane.add(T1C);
      T1C.addMouseListener(new MouseInputListener(){
      
        @Override
        public void mouseMoved(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseDragged(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseReleased(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mousePressed(MouseEvent e) {
          turtlePanel();
          
        }
      
        @Override
        public void mouseExited(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseEntered(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseClicked(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      });

      ViolinC = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\Violin.png");
      V1C = new JLabel(ViolinC);
      V1C.setBounds(600,500,112,132);
      V1C.setVisible(true);
      contentPane.add(V1C);
      V1C.addMouseListener(new MouseInputListener(){
      
        @Override
        public void mouseMoved(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseDragged(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseReleased(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mousePressed(MouseEvent e) {
          violinPanel();
          
        }
      
        @Override
        public void mouseExited(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseEntered(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      
        @Override
        public void mouseClicked(MouseEvent e) {
          // TODO Auto-generated method stub
          
        }
      });


      //this is borrowed code from @tschwab on stackoverflow, a much more knowledgeable man than I
      //link: https://stackoverflow.com/questions/2416935/how-to-play-wav-files-with-java
      try {
        
        File yourFile1 = new File(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\PanelMusic\\Saint.wav");
        
        
        stream1 = AudioSystem.getAudioInputStream(yourFile1);
        format1 = stream1.getFormat();
        info1 = new DataLine.Info(Clip.class, format1);
        clip1 = (Clip) AudioSystem.getLine(info1);
        clip1.open(stream1);
        clip1.start();
        
    }
    catch (Exception e) {
        
    }
    

    } // end of constructor

   public void pillarPanel(){
    pillarGUI z = new pillarGUI();
   }
   public void thinkerPanel(){
    thinkerGUI a = new thinkerGUI(); 
  }
  public void turtlePanel(){
     turtleGUI b = new turtleGUI();
  }
  public void colosseumPanel(){
     colosseumGUI c = new colosseumGUI();
  }
  public void horsePanel(){
     horseGUI d = new horseGUI();
  }
  public void violinPanel(){
     violinGUI e = new violinGUI();
     // running out of letters here
  }

} // end of all things


