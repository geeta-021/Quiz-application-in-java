
package quize.application;

import java.awt.*;


import javax.swing.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener
{
         public Score (String name, int score)
        {
             setBounds(400, 150, 700, 550);
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);
    
      ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
    Image i2 = i1.getImage().getScaledInstance(300,250, Image.SCALE_DEFAULT);
   
    ImageIcon i3 = new ImageIcon(i2);  
    JLabel image = new JLabel(i3);
    image.setBounds(20, 250, 300,200);
    add(image);
    
     JLabel heading = new JLabel("Thank you "+ name + " for playing simple minds");
    heading.setBounds(70,30,700,30);
    heading.setFont(new Font("Tahoma", Font.PLAIN,26));
     add(heading);
     
      JLabel lblscore = new JLabel("Your score is "+ score );
    lblscore.setBounds(350,150,300,30);
    lblscore.setFont(new Font("Tahoma", Font.PLAIN,26));
     add(lblscore);
     
     JButton submit= new JButton("Play Again");
       submit.setBounds(350,210,200,40);
       submit.setFont(new Font("Tahoma", Font.PLAIN,22));
       submit.setBackground(new Color(30, 144, 255));
       submit.setForeground(Color.WHITE);
       submit.addActionListener(this);
        add(submit);
   setVisible(true);  
}
         public void actionPerformed(ActionEvent ae)
         {
            setVisible(false);
            new Loginn();
         }
    public static void main(String[] args)
    {
        new Score("user", 0);
    }
    
}
