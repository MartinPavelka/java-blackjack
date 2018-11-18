package players;

import java.util.*;

public class Player {
	private boolean isTurn = false;
	private String name;
	
	public Player() {
		setName();
	}
	
	public Player(String name) {
		this.name = name;
	}
	
	public void setName () {
		System.out.println("Hey player, what's your name?");
		this.name = name();
	}
	
	private String name() {
		String pName = new Scanner(System.in).nextLine();
		return pName;
	}
}
