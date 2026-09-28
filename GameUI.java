import java.util.Random;
public class GameUI {
	
	private static int nowPlayerAtk;
	private static int nowMonsterAtk;
	
	private static Random rand = new Random();
	
	public static void clearScreen(){
		for(int i = 1; i <= 60; i++){
			System.out.println();
			}
		}
	public static void loading(int thread){
		try{
			Thread.sleep(thread);
			}catch(InterruptedException e){
				e.printStackTrace();
				}
		}
		
		// Loading Text
	private static void loadingText(String text, int thread){
		System.out.print(text);
		for(int i = 1; i <= 5; i++){
				try{
				Thread.sleep(thread);
				} catch(InterruptedException e){
					e.printStackTrace();
					}
				System.out.print(".");
			}
			System.out.println();
	}
		
	public static void transition(){
		clearScreen();
		loadingText("Descending",500);
		clearScreen();
		}
	public static void floor(int floor){
		System.out.println("|=================================|");
		System.out.println("|            FLOOR  "+ floor + "             |");
		System.out.println("|=================================|");
		}
	public static String displayMonster(Monster monster){
		
		if(monster.getName().equals("Slime")){
			
			String[] slimeMes = {"A Slime bounce toward you!",
				"A puddle of Slime begin to move...",
				"A Slime blocks your path!"};
			
			return slimeMes[rand.nextInt(slimeMes.length)];
			
		} else if(monster.getName().equals("Rat")){
			
			String[] ratMes = {"The smell of decay fills the air.\nA Rat appears!",
			"You hear a scratching nearby...\nA Rat rashes at you!",
			"A Rat bares its sharp teeth!"};
				
			return ratMes[rand.nextInt(ratMes.length)];
			
		}else if(monster.getName().equals("Goblin")){
			String[] goblinMes = {"A Goblin leaps from a broken wall!",
				"You hear laughter echoing...\nA Goblin challenges you!",
				"A Goblin grins as it points its weapon at you."};
			
			return goblinMes[rand.nextInt(goblinMes.length)];
				}
			return "Lucky floor";
		}
	public static void playerStatus(Player player){
		System.out.println("👤 " + player.getName() + "     " + "HP: " + player.getHp() + "/" + player.getMaxHp());
		}
	public static void monsterStatus(Monster monster){
		
		String emoji;
		
		if(monster.getName().equals("Slime")){
			emoji = "🔵";
			}else if(monster.getName().equals("Rat")){
				emoji = "🐀";
				}else if(monster.getName().equals("Goblin")){
					emoji = "👹";
					}else {
						emoji = "⚔";
						}
		System.out.println(emoji + " " + monster.getName() + "     " + "HP: " + monster.getHp() + "/" + monster.getMaxHp());
		}
	public static void setBattleMes(int monsterAtk,int playerAtk){
		nowMonsterAtk = monsterAtk;
		nowPlayerAtk = playerAtk;
		}
	public static void getBattleMes(Monster monster){
		System.out.println("You dealt " + nowPlayerAtk + " damage!");
		System.out.println(monster.getName() + " dealt " + nowMonsterAtk + " damage!");
		}
	}

