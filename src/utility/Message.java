package utility;

import board.Color;
import player.Player;

public abstract class Message {
	
	private Message() { } 
	
	public static void concedeMsg(Player player) {
		Color current = player.getColor(); 	
		String winner = (current == Color.W) ? "Black" : "White"; 
		System.out.println(player.toString() + " player concedes."); 
		System.out.println(winner + " player wins!"); 
	}
	
}
