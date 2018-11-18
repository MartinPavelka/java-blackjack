package cards;

import java.io.*;
import java.util.*;

import players.Player;

public class Game {
	private boolean validNum;
	List<Deck> decks = new ArrayList<>();
	private boolean playAgain;
	private boolean endOfGame = false;

	public Game() throws IOException {
		initDecks();
		initPlayers();
		
		while(!endOfGame) {
			System.out.println("Hovno");
			System.out.println("Hovno");
			System.out.println("Hovno");
			System.out.println("Hovno");
			System.out.println("Hovno");
			System.out.println("Hovno");
			System.out.println("Hovno");
			System.out.println("Hovno");
			
			
			endOfGame();
		}
	}

	private void initPlayers() {
		Player player = new Player();
		Player dealer = new Player("Dealer");
	}

//	Initialize Decks to grab cards from
	private void initDecks() throws IOException {
		System.out.println("Hello player, do you want to play with one or six decks?");
		do {
			System.out.println("Please, input a number (1 or 6)");
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String inputString = input.readLine();
			try {
				int deckNum = Integer.parseInt(inputString);
				if (deckNum == 1) {
					decks.add(new Deck());
					validNum = true;
				} else if (deckNum == 6) {
					for (int x = 0; x < deckNum; x++) {
						decks.add(new Deck());
					}
					validNum = true;
				} else
					validNum = false;
			} catch (NumberFormatException e) {
				// do nothing.
			}
		} while (!validNum);
	}

	private void removeDeck() {
		if (decks.get(0).isEmpty()) {
			decks.remove(0);
		}
	}
	
	private boolean isEmpty() {
		if (decks.size() == 0) {
			return true;
		}
		else return false;
	}
	
	private void endOfGame() {
		playAgain();
		if (!playAgain || isEmpty()) {
			endOfGame = true;
		}
		else endOfGame = false;
	}
	
	private void playAgain() {
		System.out.println("Do you want to play again? y/n");
		String answer = new Scanner(System.in).nextLine();
		while (!answer.equals("y") && !answer.equals("n")) {
			System.out.println("Please type \"y\" or \"n\"");
			answer = new Scanner(System.in).nextLine();
		}
		if (answer.equals("y")) {
			playAgain = true;
		}
		else playAgain = false;
	}
}
