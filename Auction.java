import java.util.StringTokenizer;
import java.io.*;
import java.text.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Auction
{    		
	public static void main(String [] args)
   {
		Stack<Bidder> stack = new Stack<Bidder>();
      //Frame for the GUI
      final JFrame jFrame = new AuctionGUI();
		//Exits program when X is clicked
      jFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      jFrame.pack();
		//Sets size of the window to 600x500
      jFrame.setSize(600,500);
		//Allow visibility of the frame
      jFrame.setVisible(true); // Show frame      
   }
}


class AuctionGUI extends JFrame
{
// This class is only going to build the top half using labels and textfields

private  JLabel BiddersLabel; 
private JLabel CurrentLabel;
private JLabel MaxLabel; 
private JLabel NewLabel;
private JLabel NewMaxLabel;

private JTextField BiddersField, CurrentField, MaxField, NewField, NewMaxField;


public AuctionGUI()
{  
JPanel InfoPanel = new JPanel();
InfoPanel.setBackground(Color.cyan);
InfoPanel.setPreferredSize(new Dimension(100, 100));
InfoPanel.setBorder(BorderFactory.createLoweredBevelBorder());
InfoPanel.setLayout(new GridLayout(5,2,0,3));

JLabel BiddersLabel= new JLabel("Number of Bidders"); 
JLabel CurrentLabel= new JLabel("Current Bid"); 
JLabel MaxLabel= new JLabel("Current Max Bid"); 
JLabel NewLabel= new JLabel ("New Bid"); 
JLabel NewMaxLabel= new JLabel ("New Max Bid");
JLabel Title= new JLabel("WELCOME TO THE AUCTION");

BiddersField = new JTextField(16); 
CurrentField= new JTextField(16);
MaxField= new JTextField (16);
NewField= new JTextField(16);
NewMaxField= new JTextField(16);

BiddersField.setEditable(false);
CurrentField.setEditable(false);
MaxField.setEditable(false);

InfoPanel.add(BiddersLabel);
InfoPanel.add(BiddersField);
InfoPanel.add(CurrentLabel);
InfoPanel.add(CurrentField);
InfoPanel.add(MaxLabel);
InfoPanel.add(MaxField);
InfoPanel.add(NewLabel);
InfoPanel.add(NewField);
InfoPanel.add(NewMaxLabel);
InfoPanel.add(NewMaxField);

BidderPanel BP= new BidderPanel(); 
ControlsPanel controls = new ControlsPanel(BiddersField, CurrentField, MaxField, NewField, NewMaxField, BP, this);


Container c = getContentPane();
c.add(InfoPanel, BorderLayout.NORTH);
c.add(controls, BorderLayout.SOUTH);
c.add(BP, BorderLayout.CENTER);


setBidders("0");
setCurrentBid("0");
setMax("0");

}
public String getBidders()
{
return BiddersField.getText();
}

public String getMaxBid()
{
return MaxField.getText();
}

public String getCurrentBid()
{
return CurrentField.getText();
}

public String getNewBid()
{
return NewField.getText();
}

public String getNewMax()
{
return NewMaxField.getText();
}

public void setBidders(String amount)
{
BiddersField.setText(amount);  
}

public void setMax(String amount)
{
MaxField.setText(amount);  
}

public void setCurrentBid(String amount)
{
CurrentField.setText(amount);  
}

public void setNewBid(String amount)
{
NewField.setText(amount);  
}

public void setNewMax(String amount)
{
NewMaxField.setText(amount);  
}

}
