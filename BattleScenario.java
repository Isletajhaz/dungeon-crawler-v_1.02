import java.util.Scanner;
public class BattleScenario {
	
	public static void start(Player player, Scanner sc, int floor){
			
			
			 Monster monster = MonsterList.monsterSummon(floor);
			 GameUI.floor(floor);
			 String scenario = GameUI.displayMonster(monster);
			 
			 System.out.println();
			 System.out.println();
			 System.out.println(scenario);
			 System.out.println();
			 System.out.println();
			 System.out.println("___________________________________");
			 System.out.print("Prepare yourself...\nPress Enter to continue...");
			 sc.nextLine();
			 
			 GameUI.clearScreen();
			 
			 battle(player,monster,floor,scenario,sc);
			 
	}
	public static void battle(Player player, Monster monster, int floor, String scenario, Scanner sc){
		int index = 0;
		
		while(player.getHp() > 0 && monster.getHp() > 0){
			
			int choice;
			String output = "Enter: ";
			// attack
			int monsterAttk = monster.getAttack();
			int playerAttk = player.getAttack();
			
			//health
			int playerHp = player.getHp();
			int monsterHp = monster.getHp();
			
			do{
			
				GameUI.floor(floor);
		
				System.out.println();
				System.out.println();
				if(index == 0){
					System.out.println(scenario);
					}
				else if(index > 0){
					GameUI.getBattleMes(monster);
					}
				System.out.println();
				System.out.println();
				System.out.println("-----------------------------------------");
				GameUI.playerStatus(player);
				GameUI.monsterStatus(monster);
				System.out.println("-----------------------------------------");
				System.out.println();
				System.out.println("⚔ What will you do?");
				System.out.println("[1] attack");
				System.out.println("[2] run");
				System.out.print(output);
				choice = sc.nextInt();
				sc.nextLine();
				
				if(choice != 1 && choice != 2){
					output = "Enter: ";
					}
				else{
					output = "Enter Again: ";
					}
					
				switch(choice){
					
					case 1:
					player.setHp(playerHp - monsterAttk);
					monster.setHp(monsterHp - playerAttk);
					GameUI.setBattleMes(monsterAttk,playerAttk);
					index++;
					break;
					
					case 2:
					player.setHp(playerHp - monsterAttk);
					break;
					}
				
			}while(choice != 1 && choice != 2);
			GameUI.clearScreen();
		}
	}
	
}

