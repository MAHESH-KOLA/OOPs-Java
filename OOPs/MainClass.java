abstract class Monster {

protected String name;

public Monster(String name) {
this.name = name;
}
abstract public String attack();
}


 class FireMonster extends Monster {

public FireMonster(String name) {
super(name);
}
@Override
public String attack() {
return name + " Attack with fire!";
}
}


class WaterMonster extends Monster {

public WaterMonster(String name) {
super(name);
}
@Override
public String attack() {
return name + " Attack with water!";
}
}
 class StoneMonster extends Monster {

public StoneMonster(String name) {
super(name);
}

@Override
public String attack() {
return name + " Attack with stones!";
}
}


public class MainClass {
public static void main(String[] args) {

Monster m1 = new FireMonster("Fire Lion"); // upcast
Monster m2 = new WaterMonster("Strike"); // upcast
Monster m3 = new StoneMonster("Blizzard"); // upcast

System.out.println(m1.attack()); // FireMonster's attack()
System.out.println(m2.attack()); // WaterMonster's attack()
System.out.println(m3.attack()); // StoneMonster's attack()


m1 = new StoneMonster("Metamorphic"); // upcast
System.out.println(m1.attack()); // StoneMonster's attack()

// Monster m4 = new Monster("Green"); // Compilation Error!!


}
}