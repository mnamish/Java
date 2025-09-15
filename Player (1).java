package ReviewMethodsProject;
import java.util.*;

public class Player {
	private int playerID;
	private int idHint;
	
	public Player(int playerID,int idHint) {
		this.playerID = playerID;
	}
	
	public int getID() {
		return playerID;
	}
	
	public void setID(int playerID) {
		this.playerID = playerID;
	}
	
	public int getHint() {
		return idHint;
	}

	public void setHint(int idHint) {
		this.idHint = idHint;
	}
}
