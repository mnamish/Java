public class Bidder
{
	// You can use a bidder name for each bidder for authenticity
    // or a Bid Id number, then you will also need to store their bid and maxbid.
   protected int count=1, ID;	
   protected double bid, maxBid;	
   protected String firstname, lastname;
	// Use two Constructors		
	/**
	 * Constructor for Bidder1
	 * 
	 * This constructor sets the the bid and maxBid values and 
	 * initialized the bids serial number (ID)
	 * 
	 * @param		bid	The initial bid amount -- c
	 * @param		maxBid	The maximum bid this bid can be raised (double)
	 */
    
   public Bidder(double bid, double maxBid)
   {
   ID= count;
   this.bid=bid;
   this.maxBid=maxBid;
   count++;
   }

		/**
	 * Constructor for Bidder2
	 * 
	 * This constructor takes a bidders ID number along with bid information
	 * 
	 * @param bid	The initial bid amount (double)
	 * @param maxBid	The maximum bid amount that this bid can be raised (double)
	 */
public Bidder(int ID, double bid, double maxBid)
   {
   this.ID= ID;
   this.bid=bid;
   this.maxBid=maxBid;
   }
			
	//	Setters
	/**
	 * Method setFirstName
	 * 
	 * Permits the first name to be modified
	 * 
	 * @param	firstname	Bidders first name (String)
	 */
	public void	setFirstName(String name)
   {
   firstname= name;
   }
	
	/**
	 * Method setLastName
	 * 
	 * Permits the last name to be modified
	 * 
	 * @param lastName Bidders last name (String)
	 */
	public void setLastName(String name)
   {
   lastname= name;
   }
   
   	
	/**
	 * Method setBid
	 * 
	 * Permits current bid to be updated
	 * 
	 * @param bid Current Bid (double)
	 */
   public void setBid(double bid)
   {
   this.bid=bid;
   }
   

	/**
	 * Method setMaxBid
	 * 
	 * permits the max bid to be updated
	 * 
	 * @param maxBid Max bid (double)
	 */
	public void setMaxBid(double maxBid)
   {
   this.maxBid=maxBid;
   }
   
		
	//	Getters
	
	/**
	 * Method getFirstName
	 * 
	 * Provides access to Bidder's first name
	 *
	 *@return firstName Returns the Bidder's first name (String)
	 */
	public String getFirstName()
   {
   return firstname;
   }
   	
	/**
	 * Method getLastName
	 * 
	 * Provides access to Bidder's last name
	 * 
	 * @return lastName Returns the Bidder's last name (String)
	 */
	public String getLastName()
   {
   return lastname;
   }	
      
   
   	/**
	 * Method getBid
	 * 
	 * provides access to this bids current bid value
	 * 
	 * @return	bid	Returns this bid's current bid value (double)
	 */
   public double getBid()
   {
   return bid;
   }
	
	/**
	 * Method getMaxBid
	 * 
	 * Provides access to this bids max bid value
	 * 
	 * @return	maxBid Returns this bid's max bid value (double)
	 */
	public double getMaxBid()
   {
   return maxBid;
   }
   
   
	//	helper methods
	
	/**
	 * Method equals
	 * 
	 * Overrides default equals method by comparing bid  numbers
	 * 
	 * @return boolean	Returns true of the bid numbers match numerically
	 */
	 public boolean equals(Bidder bidder)
	 {
    return(bid==bidder.bid);     
    }	//	end method equals
	
   
   
	/**
	 * Method toString
	 * 
	 * Provides toString method for bidder class
	 * Writes out the Bid ID, Current Bid Amount, and Current Maximum Bid Amount
	 *
	 *@return String	Returns textual representation of the current bid (Bid ID, Current Bid, and Current Max Bid)
	 */
	public String toString()
	{
		return ("ID:"+ID+" Bid: "+ bid+ " Max Bid: "+ maxBid);
	}	//	end method toString
	
   
   
	/**
	 * Method compareTo
	 * 
	 * Implements compareTo by evaluating if maxBid is smaller, equal or larger
	 * 
	 * @param bidder Accepts another bid for comparison
	 * @return	int	returns -1 if bid is smaller, 0 if equal, 1 if larger
	 */
	public int compareTo(Bidder bidder)
	{
   int compare= 0;
	if (bidder.bid>maxBid)
      compare= 1;
   if (bidder.bid==maxBid)
      compare= 0;
   if (bidder.bid<maxBid)
      compare= -1;
   return compare;      
   }	//	end method compareTo
		
}	//	end class Bidder

