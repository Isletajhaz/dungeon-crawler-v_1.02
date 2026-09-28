import java.util.Random;
public class Player {
	
	Random rand = new Random();
	private String name;
	private int maxHp;
	private int hp;
	
	private int lvl;
	
	// stats
	private int str;
	private int intel;
	private int dex;
	private int luck;
	
	PlayerClass pClass;
	Weapon weapon;
	
	Player(String name, PlayerClass pClass){
		
		this.name = name;
		this.maxHp = 100;
		this.lvl = 1;
		this.hp = this.maxHp;
		
		// stats
		this.str = pClass.str;
		this.intel = pClass.intel;
		this.dex = pClass.dex;
		this.luck = pClass.luck;
		this.weapon = pClass.weapon;
		
		}
		
		public int getAttack(){
			
			int maxDmg = this.str + this.weapon.attack + (this.dex / 2);
			int minDmg = maxDmg/2;
			int calculatedDmg = rand.nextInt(maxDmg - minDmg + 1)+ minDmg;
			
			return calculatedDmg;
			}
		// Getter method of Stats
		public int getLvl(){
			return this.lvl;
			}
			
		public int getHp(){
			return this.hp;
			}
		public int getMaxHp(){
			return this.maxHp;
			}
			
		public int getStr(){
			return this.str;
			}
		public int getIntel(){
			return this.intel;
			}
		public int getDex(){
			return this.dex;
			}
		public int getLuck(){
			return this.luck;
			}
		public String getName(){
			return this.name;
			}
		
		// Setter Methods
		
		public void setName(String name){
			this.name = name;
			}
		public void setHp(int hp){
			this.hp = Math.max(0,hp);
			}
		public void setMaxHp(int maxHp){
			this.maxHp = maxHp;
			}
	}

