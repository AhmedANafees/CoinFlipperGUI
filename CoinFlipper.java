package CoinFlipperGUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author nafea8846
 */
public class CoinFlipper  implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;
  JLabel label;
  JButton flipper;
  JTextField result;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Coin Flipper");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(250,200);
    // shows the window
    frame.setVisible(true);
 
    mainPanel = new JPanel();
    mainPanel.setLayout(null);
    
    label = new JLabel("The coin is: ");
    label.setBounds(25, 25, 100, 50);
    
    result = new JTextField();
    result.setBounds(100, 40, 100, 25);
    
    flipper = new JButton("Flip Coin");
    flipper.setBounds(60, 75, 100, 50);
    flipper.addActionListener(this);
    flipper.setActionCommand("Flip");

    mainPanel.add(flipper);
    mainPanel.add(result);
    mainPanel.add(label);
    frame.add(mainPanel);    
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
    if (command.equals("Flip"))
    {
        int lowest = 1;
        int highest = 2;
        int randomNumber = (int)(Math.random( )*(highest-lowest+1) + lowest);
    
        if (randomNumber == 1)
        {
            result.setText("Heads");
        }
        else
        {
            result.setText("Tails");
        }
    }
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    CoinFlipper  gui = new CoinFlipper ();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}

