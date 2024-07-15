package Monster;

public class TestMonster {
	
	static FireMonster fMonster;
	static WaterMonster wMonster;
	static StoneMonster sMonster;

	public static void main(String[] args) {
		
		Monster m1 = new FireMonster("r2u2");
		Monster m2 = new WaterMonster("u2r2");
		Monster m3 = new StoneMonster("r2r2");

		m1.setName("Fire Monster has arrived!"); 
		System.out.println(m1.attack() + "\n");
		
		m2.setName("Water Monster has arrived!");
		System.out.println(m2.attack() + "\n");
		
		m3.setName("Stone Monster has arrived!");
		System.out.println(m3.attack() + "\n");

		m1 = new StoneMonster("a2b2");
		System.out.println(m1.attack() + "\n");
		
		System.out.println("A new Monster has arrived!");
		Monster m4 = new Monster("u2u2");
		
		System.out.println(m4.attack());
		
	}

}
