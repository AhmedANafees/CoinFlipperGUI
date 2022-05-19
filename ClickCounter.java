
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Set;


/**
 *
 * @author nafea8846
 */
public class ClickCounter  implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;
  JLabel Label;
  JButton clicker;
  JTextField counter;
  int i = 0;

  

  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Click Counter");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(300,200);
    // shows the window
    frame.setVisible(true);
    
    mainPanel = new JPanel();
    mainPanel.setLayout(null);
 
    Label = new JLabel("Number of Button Clicks:");
    Label.setBounds(20, 100, 150, 50);
    
    counter = new JTextField();
    counter.setBounds(175, 100, 50, 50);
    
    clicker = new JButton("Click here");
    clicker.setBounds(90, 25, 100, 50);
    clicker.addActionListener(this);
    clicker.setActionCommand("clicks");
    
    mainPanel.add(clicker);
    mainPanel.add(counter);
    mainPanel.add(Label);
    frame.add(mainPanel);
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    
    String command = e.getActionCommand();
    
    if(command.equals("clicks"))
    {
      i++;
      counter.setText(" " + i);
    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    ClickCounter  gui = new ClickCounter ();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}

