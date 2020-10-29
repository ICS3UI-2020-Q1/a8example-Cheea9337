import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JLabel firstLabel;
  JLabel secondLabel;
  JLabel thirdLabel;

  JTextField firstInput;
  JTextField secondInput;
  JTextField thirdInput;

  JButton validateButton;
  JButton resetButton;

  JTextArea outputArea;
  JTextArea instructionArea;

  Font biggerText;
  

  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("My First Program");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
 
  // initialize the main JPanel
  mainPanel = new JPanel();
  // disable any lyout helpers
  mainPanel.setLayout(null);

  // create the side labels
  firstLabel = new JLabel("Enter the first side");
  secondLabel = new JLabel("Enter the second side");
  thirdLabel = new JLabel("Enter the third side");

  // layout the labels by setting coordinate and Size
  firstLabel.setBounds(10,10,200,20);
  secondLabel.setBounds(10,40,200,20);
  thirdLabel.setBounds(10,70,200,20);

  // initialize the input text fields
  firstInput = new JTextField();
  secondInput = new JTextField();
  thirdInput = new JTextField();

  // set the location and Size
  firstInput.setBounds(220, 10, 100, 20);
  secondInput.setBounds(220, 40, 100, 20);
  thirdInput.setBounds(220, 70, 100, 20);

  // initialize the buttons
  validateButton = new JButton("Validate");
  resetButton = new JButton("Reset");

  // set the size and location of the buttons
  validateButton.setBounds(330, 10, 100, 35);
  resetButton.setBounds(330, 55, 100, 35);

  // initialize the text area
  outputArea = new JTextArea();
  instructionArea = new JTextArea();

  // create a string that holds the instructions
  String instructions = "This is a simple tringle detector. \nEnter an integer in each of the text fields above. \nPress the \" Validate button \" to find out. \nWhether you have made a valid triangle or not. \nPress the reset button to clear the previous text.";

  // set text in the instruction area
  instructionArea.setText(instructions);

  // set the size and location of the text areas
  outputArea.setBounds(10, 100, 780, 240);
  instructionArea.setBounds(10, 350, 780, 240);

  // disable the text areas so that the user cannot type in them
  outputArea.setEnabled(false);
  instructionArea.setEnabled(false);

  // create a bigger font ot user
  biggerText = new Font("arial", Font.PLAIN, 20);

  // set the font on the area I want to use it
  instructionArea.setFont(biggerText);

  // add to main panel
  mainPanel.add(outputArea);
  mainPanel.add(instructionArea);

  // add the buttons to the panel
  mainPanel.add(validateButton);
  mainPanel.add(resetButton);

  // add the text fields to the panel
  mainPanel.add(firstInput);
  mainPanel.add(secondInput);
  mainPanel.add(thirdInput);

  // add the labels to the main panel
  mainPanel.add(firstLabel);
  mainPanel.add(secondLabel);
  mainPanel.add(thirdLabel);

  // add the panel to the frame
  frame.add(mainPanel);

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
