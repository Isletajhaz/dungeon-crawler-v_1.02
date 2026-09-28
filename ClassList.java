public class ClassList {
	
		public static PlayerClass summonWarrior(){
			
			PlayerClass warrior = new PlayerClass("Warrior",4, 2, 3, 1, WeaponList.sword());
			
			
			return warrior;
			}
		public static PlayerClass summonArcher(){
			
			PlayerClass archer = new PlayerClass("Archer", 1,2,4,3,WeaponList.bow());
			
			return archer;
			}
	}

