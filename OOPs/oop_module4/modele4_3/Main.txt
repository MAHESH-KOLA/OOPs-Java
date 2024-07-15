public class Monster {
// protected instance variable
protected String name;
// Constructor
public Monster(String name) {
this.name = name;
}
// Define common behaviour for all its subclasses
public String attack() {
return "Err.. I don't know how to attack!";
// We have a problem here!
// We need to return a String; else, compilation error!
}
}
public class FireMonster extends Monster {
// Constructor
public FireMonster(String name) {
super(name);
}
// Subclass provides actual implementation
@Override
public String attack() {
return name + " Attack with fire!";
}
}
3
Subclass WaterMonster.java
Subclass StoneMonster.java
MainClass.java
public class WaterMonster extends Monster {
// Constructor
public WaterMonster(String name) {
super(name);
}
// Subclass provides actual implementation
@Override
public String attack() {
return name + " Attack with water!";
}
}
public class StoneMonster extends Monster {
// Constructor
public StoneMonster(String name) {
super(name);
}
// Subclass provides actual implementation
@Override
public String attack() {
return name + " Attack with stones!";
}
}
public class MainClass {
public static void main(String[] args) {
// Declare references of the superclass
// and assign instances of subclasses.
Monster m1 = new FireMonster("Fire Lion"); // upcast
Monster m2 = new WaterMonster("Strike"); // upcast
Monster m3 = new StoneMonster("Blizzard"); // upcast
// Invoke the actual implementation
System.out.println(m1.attack()); // FireMonster's attack()
System.out.println(m2.attack()); // WaterMonster's attack()
System.out.println(m3.attack()); // StoneMonster's attack()
// m1 dies, generate a new instance and re-assign to m1.
m1 = new StoneMonster("Metamorphic"); // upcast
System.out.println(m1.attack()); // StoneMonster's attack()
// We have a problem here!!!
Monster m4 = new Monster("Green");
System.out.println(m4.attack()); // garbage!!!
}
}