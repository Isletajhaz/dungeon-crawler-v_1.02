import java.util.Random;
public class Monster {
	
	Random rand = new Random();
	String name;
	
	private int hp;
	private int maxHp;
	
	int lvl;
	int baseAtk;
	
	Weapon weapon;
	
	Monster(String name, int lvl, int maxHp, int baseAtk){
		
		this.name = name;
		this.lvl = lvl;
		this.maxHp = maxHp;
		this.hp = maxHp;
		this.baseAtk = baseAtk;
		this.weapon = null;
		}
	private int getTotalAttk(){
		int finalDmg = rand.nextInt(baseAtk) + 1;
		if(weapon == null) return finalDmg;		
		return weapon.attack + finalDmg;
		}
	public void message(){
		System.out.println(this.name + " has appeared!\n");
		System.out.println(this.name + " lvl " + this.lvl + "\nHP: " + this.hp);
		}
	
	// Getter Method
	public int getHp(){
		return this.hp;
		}
	public int getAttack(){
		return getTotalAttk();
		}
	public String getName(){
		return this.name;
		}
	public int getMaxHp(){
		return this.maxHp;
		}
	// Setter Method
	public void setHp(int hp){
		this.hp = Math.max(0,hp);
		}
	public void setMaxHp(int maxHp){
		this.maxHp = maxHp;
		}
	
}
