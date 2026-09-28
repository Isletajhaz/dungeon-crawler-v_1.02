import java.util.Random;
public class MonsterList{	
	
	private static Random rand = new Random();
	
	public static Monster monsterSummon(int floor){
		Monster monster = null;
		
		if(floor <= 5){
			monster = MonsterList.createSlime();
			}
		else if(floor > 5 && floor <= 10){
			monster = MonsterList.createRat();
			}
		else if(floor > 10 && floor <= 20){
			monster = MonsterList.createGoblin();
			}
		return monster;
		}
	
	public static Monster createSlime(){
		
		return new Monster("Slime", 1, 10, 5);
		}
		
	public static Monster createRat(){
		
		return new Monster("Rat", 1, 10, 8);
		}
		
	public static Monster createGoblin(){
		
		Weapon weapon;
		
		Monster goblin= new Monster("Goblin", 2, 20, 15);
		
		if(rand.nextBoolean()){
			weapon = WeaponList.club();
			} else {
				weapon = null;
				}
		
		return goblin;
		}
}

