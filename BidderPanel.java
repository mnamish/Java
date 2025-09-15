 //Rename your images to p0, p1  p2 etc to make them easier to load.
 // if you don't, you have to load each one separately
 
 //The AddtoStack method in ControlPanel calls addBid() to add another image to the display
 // the call to repaint() calls paintComponent which will draw the images
 
 // You need to keep a counter that will increment each time addBid() is called so you can start from beginning
 // when the number of bids exceeds the number of images.

  
   import java.text.*;
   import java.util.*;
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;

   import javax.swing.Timer;
   import javax.swing.event.*;
   import javax.swing.text.*;
   import javax.swing.border.*;
   import java.util.Stack.*;

// This class is responsible for loading and displaying the images
// It will need a copy of the stack sent to its constructor from AuctionGUI
   
   public class BidderPanel extends JPanel
   {	
   protected int count=0;
   // declare a  Stack that holds Bidders -    
   
   
   // you also need a  stack for the images  and a temp stack copyStack to restore the stack
   // when images are popped.  You can use a Stack for these .
   // e.g.
     private ImageIcon[]  images, images_2;// image array for storing items from the image stack
   
     private final int NUMOFIMAGES = 6;
		
      private Stack<ImageIcon> imgstack, imgstack_2;
      protected int next_pos = 0;
      protected int Bidders=0;
		
   //constructor
       public BidderPanel()
       {
        
        //set background color
        setBackground(Color.green);
     
     
     

      //create  Stack declared above to store images
         imgstack = new Stack<ImageIcon>();// stack for image
       
       // create an array if imageIcons declared above  - images
         images= new ImageIcon[6];
         imgstack_2 = new Stack<ImageIcon>();
         images_2= new ImageIcon[6];
         // call method below to load the images from a file
        loadImages();
      }
         
   	//The paintComponent method will draw the images and background for the panel
     //It  called as soon as the class is instantiated.  To call it again you must call repaint() as in the method
     // addBid() below
      public void paintComponent(Graphics g) 
      { 
         super.paintComponent(g); 
         int count=0; 
         ImageIcon img;
         next_pos=0;
      // declare variables 
      // when you pop an image from the image stack you loaded from a file, be sure to cast it to an ImageIcon
      // before using
     
        //loop through image stack and draw images
      
      //Use this line of code to paint the image
      //img.paintIcon(this, g, next_pos*160, 100);
		
      //next_pos++;
       // goes to next position which is the width of the image
      
         
       // look up the imageIcon class and look for width method to see its parameters
       
      // you will need to use imgstack2 stack to store  the images you pop
      // to restore the stack when loop ends so it can be used for the next repaint
     
     //end 1st loop
     
    
    // use another loop to restore the original stack
      // store popped items in copy Stack 
       // back to the original stack

    }  
   ///method to load images into image queue from files
   // because a lot of time is lost loading the images , I am giving you most of the method
   // if there are problems try this code below
   // imgs.add(new ImageIcon(getClass().getResource("p" + x + ".jpg")));  // extension either jpg or gig

  private void loadImages()
	{
   int x=0;
	ImageIcon img;	
      try
		{
			//loop though filenames and add to image queue
			for (x=0; x < NUMOFIMAGES; x++)
			{
			  imgstack.push(new ImageIcon(("images\\p_" + x + ".jpg")));
          	}		
				
		}catch(Exception e){
			//notify that there was a problem loading images
			  System.out.println("Error loading files with x " + x);
				}
	 
   }
  
   
   //************************************************************************
   // This method Adds a bid to the stack.  It is called from ControlsPanel
   // each time a new bid is accepted
   //*************************************************************************
      public void addBid()
      {
      // THis method increments count and calls repaint()
      // it is called from ControlsPanel each time a bid is accepted and a new image needs to be drawn
      // this how the ControlsPanel communicated with this class.
      
      // make sure that it only calls repaint if the stack is not empty.  You can use count
      //increment count to use when you call repaint which will print out count images
         
      // make sure that it will not exceed count, if it does go back to 0.      
      }
   
   // method to get current image	
   
   
   }//close BidderPanel class



