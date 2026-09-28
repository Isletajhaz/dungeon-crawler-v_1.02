import java.util.Scanner;
public class Dungeon_Crawler {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Player Name
		String playerName;
		
		System.out.println("===== WELCOME =====\n");
		System.out.print("Enter your name: ");
		playerName = sc.nextLine();
		System.out.println("Welcome, " + playerName +  " to the Dungeon Crawler");
		
		// Class choice
		int playerPick;
		
		// Player
		PlayerClass playerClass = null;
		Player playerStats = null;
		int floor = 1;
		
		do{
			System.out.println("\nChoose Class:");
			System.out.println("1. Warrior");
			System.out.println("2. Archer");
			System.out.print("Enter: ");
			playerPick = sc.nextInt();
			sc.nextLine();
		
			if(playerPick == 1){
				playerClass = ClassList.summonWarrior();
				playerStats = new Player(playerName, playerClass);
				System.out.println("You are now an Warrior\n");
			}
			else if (playerPick == 2){
				playerClass = ClassList.summonArcher();
				playerStats = new Player(playerName, playerClass);
				System.out.println("You are now a Archer\n");
			} else {
				System.out.println("You entered a wrong class, please try again!");
				}
			
		} while(playerPick != 1 && playerPick != 2);
		
		System.out.print("Press Enter to continue...");
		sc.nextLine();
		
		GameUI.transition();
		for(int i = 1; i <= 40; i++){
		BattleScenario.start(playerStats, sc, floor);
		floor++;
		}
	}
}

