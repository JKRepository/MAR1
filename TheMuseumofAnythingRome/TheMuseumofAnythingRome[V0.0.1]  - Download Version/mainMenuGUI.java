import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.io.*;
import javax.sound.sampled.*;

 /*I've phased out everything from the basic RockPaperScissorsGUI, but have also kept some things in order to make some commands
that I may not have memorized easier to access. This includes stuff like event action listeners and all that
Ultimately, the point is that this stuff is good reference.
 */
public class mainMenuGUI extends JFrame implements ActionListener

  {
 
  //Fields
  private JPanel contentPane;
  private JLabel centerPic;
 // private JButton musicButton; PHASED O U T see line 95
  private JLabel topLeft;
  private JLabel middleLeft;
  private JLabel  bottomLeft;
  private JLabel topRight;
  private JLabel middleRight;
  private JLabel bottomRight;
  // private boolean mbuttonPressed = false; P H A S E D O U T see line 95
  private JTextField Introduction;
  private JTextField Introduction1;
  private JTextField chooseRoad; 
  private ImageIcon  CenterPicture;
  private ImageIcon road, road1, road2, road3, road4, road5;
  private AudioInputStream stream;
  private AudioFormat format;
  private DataLine.Info info;
  private Clip clip;
  
  /*
  private JLabel leftPic;  
  private JLabel rightPic;
  private JPanel midContainer;
  private ImageIcon rock,paper,scissor,letsPlay,banner;
  private JComboBox colorChoiceBox;
  private JTextField centerText;
  private JTextArea rightText;
  private int playerScore = 0;
  private int computerScore = 0;
  private int tieScore = 0;
*/
  

  

  //Constructor
  public mainMenuGUI(){
       String home = System.getProperty("user.home"); // TERRIBLE FILEPATHING ACHEIVED

       this.setTitle(" M U S E U M   E N T R A N C E ");
       this.setSize(800,500);
    
       contentPane = new JPanel(null);
       contentPane.setPreferredSize(new Dimension(800,500));
       contentPane.setBackground(new Color(245,245,245));
       
       CenterPicture = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\CenterPicture.png");  
       
       centerPic = new JLabel(CenterPicture);
       centerPic.setBounds(200,100,400,323);
       centerPic.setVisible(true);
       contentPane.add(centerPic);
       road = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\road.png");
       road1 = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\road.png");
       road2 = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\road.png");
       road3 = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\road1.png");
       road4 = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\road1.png");
       road5 = new ImageIcon(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\images\\road1.png");
       
       topLeft = new JLabel(road);
       topLeft.setBounds(0,40,100,56);
       topLeft.setVisible(true);
       contentPane.add(topLeft);
       topLeft.addMouseListener(new MouseInputListener(){
       
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
         roadPressed(e);
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

       middleLeft = new JLabel(road1);
       middleLeft.setBounds(0,240,100,56);
       middleLeft.setVisible(true);
       contentPane.add(middleLeft);
       middleLeft.addMouseListener(new MouseInputListener(){
       
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
          roadPressed(e);
           
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
       bottomLeft = new JLabel(road2);
       bottomLeft.setBounds(0,440,100,56);
       bottomLeft.setVisible(true);
       contentPane.add(bottomLeft);
       bottomLeft.addMouseListener(new MouseInputListener(){
      
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
          roadPressed(e);
          
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

       topRight = new JLabel(road3);
       topRight.setBounds(700,40,100,56);
       topRight.setVisible(true);
       contentPane.add(topRight);
       topRight.addMouseListener(new MouseInputListener(){
       
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
          roadPressed(e);
           
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
       middleRight = new JLabel(road4);
       middleRight.setBounds(700,240,100,56);
       middleRight.setVisible(true);
       contentPane.add(middleRight);
       middleRight.addMouseListener(new MouseInputListener(){
       
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
          roadPressed(e);
           
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

       bottomRight = new JLabel(road5);
       bottomRight.setBounds(700,440,100,56);
       bottomRight.setVisible(true);
       contentPane.add(bottomRight);
       bottomRight.addMouseListener(new MouseInputListener(){
       
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
          roadPressed(e);
           
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
       
     
       Introduction = new JTextField();
       Introduction.setBounds(195,50,410,75);
       Introduction.setBackground(new Color(52, 43, 237,255));
       Introduction.setForeground(new Color(0,0,0,255));
       Introduction.setEnabled(true);
       Introduction.setFont(new Font("sansserif",0,16));
       Introduction.setText("Prepare to enter the Museum of:");
       Introduction.setVisible(true);
       Introduction.setEditable(false);
       contentPane.add(Introduction);
       
       Introduction1 = new JTextField();
       Introduction1.setBounds(427,68,175,40);
       Introduction1.setBackground(new Color(255, 0, 200,0));
       Introduction1.setForeground(new Color(0,0,0,0));
       Introduction1.setEditable(false);
       Introduction1.setEnabled(true);
       Introduction1.setFont(new Font("sansserif",Font.ITALIC,20));
       Introduction1.setText("ANYTHING ROME");
       Introduction1.setVisible(true);
       contentPane.add(Introduction1);
       
       chooseRoad = new JTextField();
       chooseRoad.setBounds(195,400,410,25);
       chooseRoad.setBackground(new Color(247, 255, 14));
       chooseRoad.setForeground(new Color(0,0,0,255));
       chooseRoad.setEditable(false);
       chooseRoad.setEnabled(true);
       chooseRoad.setFont(new Font("sansserif",0,16));
       chooseRoad.setText("Go ahead, choose a road, see where each takes you...");
       chooseRoad.setVisible(true);
       contentPane.add(chooseRoad);
       //THIS SECTION OF CODE MUST BE AT THE VERY BOTTOM OF YOUR CONSTRUCTOR!
 //setting of window position and close operation
       this.add(contentPane);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLocationRelativeTo(null);
       this.pack();
       this.setVisible(true);
       try {
        Thread.sleep(1000);
      }
      catch(Exception e) {
      }
      //this is borrowed code from @tschwab on stackoverflow, a much more knowledgeable man than I
      //link: https://stackoverflow.com/questions/2416935/how-to-play-wav-files-with-java
      try {
        File yourFile = new File(home+"\\downloads\\" + "TheMuseumofAnythingRome[V0.0.1]\\PanelMusic\\MACINTOSH PLUS - リサフランク420 _ 現代のコンピュー.wav");
        
        
        stream = AudioSystem.getAudioInputStream(yourFile);
        format = stream.getFormat();
        info = new DataLine.Info(Clip.class, format);
        clip = (Clip) AudioSystem.getLine(info);
        clip.open(stream);
        clip.start();
        
    }
    catch (Exception e) {
        
    }
    } // end of constructor

    public void fadeIn(){
        while(Introduction1.getBackground().getAlpha() < 255){
            try {
               Thread.sleep(100);
              }
              catch(Exception e) {
              }
                Introduction1.setBackground(new Color(255,0,200,Introduction1.getBackground().getAlpha()+1));
                Introduction1.setForeground(new Color(0,0,0,Introduction1.getForeground().getAlpha()+1));
           }
           
    }
    public void setInvisible(){
      this.setVisible(false);
    }
 public void roadPressed(MouseEvent e){
      mainhubGUI y = new mainhubGUI();
      y.setVisible(true);
      clip.stop();
      this.setVisible(false);
 
 
      
    }
 
   
  
  
    
 /* phased out because it was buggy. The button would start teleporting whenever the Textfield faded in, pretty wierd stuff.
       musicButton = new JButton();
       musicButton.setBounds(10,10,100,30);
       musicButton.setBackground(new Color(255,0,127));
       musicButton.setEnabled(true);
       musicButton.setFont(new Font("Brush Script MT",Font.ITALIC,12));
       musicButton.setText("Play Music?");
       musicButton.setVisible(true);
       musicButton.addActionListener(this);
       contentPane.add(musicButton);
*/
   

}


  /* Phased out due to reasons mentioned in lines above
   public void actionPerformed(ActionEvent evt) {
       if (evt.getSource() == musicButton && mbuttonPressed == false)
       playMusic();
       mbuttonPressed = true;
   }
  
  public static void playMusic(){

    
   }
   */
  /*
       rightText = new JTextArea();
       rightText.setBounds(746,17,170,100);
       rightText.setBackground(new Color(255,255,255));
       rightText.setForeground(new Color(0,0,0));
       rightText.setEnabled(true);
       rightText.setFont(new Font("sansserif",0,12));
       rightText.setText("Please select your choice \nof move from the bottom\n buttons.\nPlayer : 0\nComputer: 0\nTie: 0");
       rightText.setBorder(BorderFactory.createBevelBorder(1));
       rightText.setVisible(true);
	   contentPane.add(rightText);
*/


       /*
	   midContainer = new JPanel(null);
       midContainer.setBounds(78,122,840,276);
       midContainer.setBackground(new Color(214,217,223));
       midContainer.setVisible(true);
       contentPane.add(midContainer);
       */
       /*
      
/*
       
*/