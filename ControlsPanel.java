import java.io.*;
import java.text.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import javax.swing.text.*;
import javax.swing.border.*;
import java.util.Random;
import java.net.*;
import javax.swing.JComponent.*;

//****************************************************************************
// Class that controls the user input. Buttons allow users access to help, 
//to enter a bid and display current status, restart the auction.  The exit button 
//writes  the stack of bidders to a file
//****************************************************************************
public class ControlsPanel extends JPanel
{
// declare objects (DO NOT INSTANTIATE HERE) e.g Bidder, buttonlistener,and BidderPanel -  
  //class where the bidders  are drawn
 

private JButton startButton; 
private JButton exitButton;
private JButton helpButton;
private JButton bidButton;
private JButton statusButton;  
private ActionHandler action;  

private int count, ID;
	
	// Also keep a count of the number of bidders
    // When you create a bidder,  give it a unique id number as the bidders name.  The equals method
	// in the Bidder class should compare two bidders based on their id	number. The compareto should compare based on
	//maxbid
 

Bidder bd;
BidderPanel BP;
JTextField BiddersField, CurrentField, MaxField, NewField, NewMaxField;	
AuctionGUI ag;
int Bidders=0;


public ControlsPanel(JTextField BiddersField, JTextField CurrentField, JTextField MaxField, JTextField NewField, JTextField NewMaxField, BidderPanel BP, AuctionGUI ag) 
{

	  //assign all the parameters to above declared instance variable e.g
      
      
     bidButton= new JButton ("BID");
     helpButton= new JButton ("HELP");
     statusButton = new JButton("STATUS");
               
     bidButton.setToolTipText("Allows you to enter a bid");
     bidButton.setMargin(new Insets(5,5,10,5));
     bidButton.addActionListener(new ActionHandler()); 
      
     helpButton.setMargin(new Insets(5,5,10,5));
     helpButton.addActionListener(new ActionHandler()); 
     
     
     statusButton.setMargin(new Insets(5,5,10,5));
     statusButton.addActionListener(new ActionHandler());
	 // buttons should include EnterBid, Help, Exit, Restart (restart auction), Status
     // For Status button you can use a JOptionPane or a textarea that you would put on the top panel to 
     // report current status
   
   setBorder(BorderFactory.createLoweredBevelBorder());
   add(bidButton);
   add(statusButton);
   add(helpButton);
	
   
   //(optional) if  the user wants to restart, call a method to clear the textfields
   // and reset the stack

   //(optional) -	call method ReadBid to read  in the first bid and put it in the JTextfields
  // add the buttons to this panel	
  
  // Remember to add actionslisteners to all the Buttons	
}

// inner class that acts as listener for the buttons
	class ActionHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		  //if a  bid is entered(AddBid button pressed) call a method in this class that
	 	  //processes the bid and adds it to the stack if qualified
		  //use  method  declared here in this class  -  addToStack() - to do the work
			
			if (e.getActionCommand().equals("BID"))
            {
            }
			// deal with other buttons
						
		   if (e.getActionCommand().equals("STATUS"))
			{
         	
			}
			
		   if (e.getActionCommand().equals("HELP"))
		    {
         
		    }
         
         								
		}//close actionPerformed

	}//close ButtonHandler
	
	// This method - called when a bid is to be processed (EnterBid is pressed)  gets the new bids, converts them from a String to a Double, use:
	// Double.parseDouble(amount) method from the Double class. It also creates a bidder each of 
	// whom should have a unique number and bid amount. max bidamount etc. This method processes the new bid
	// Values are retrieved via the AuctionGUI class and its setters
	public void addToStack()
   	{		
		
      double newBid, newMaxBid;
      String bidders;
      int intBidders;
      //Create the logic to retrieve the values for newBid and newMaxBid
      //Need to ensure that the newBid is greater than the previous Max
       
      //Once values are retrieved create a bidder - you can store a list of all bidders in the bidder stack 
	  	
      // process the bid  - if the bid is taken this includes calling a method 
	 //in the BidderPanel class called AddBid() that will draw the image..
	// You will use the BidderPanel object sent to the constructor to do this.
	// store the accepted bid in the stack.		
		BP.addBid();
      
      // set the appropriate textfields using the AuctionGUI and its setters
      
	
  }


// This method will write the bidders to a file
public  void writeCurrentStateToFile()
	{	 	
			
	}		
		
	
}