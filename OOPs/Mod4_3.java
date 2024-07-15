import java.util.*;
abstract class Monster{
    String name;
    Monster(String name){
        this.name=name;
    }
    abstract String attack();
}
class FireMonster extends Monster{
    FireMonster(String name){
        super(name);
    }
    String attack() {
return name + " Attack with fire!";
}
}
class WaterMonster extends Monster{
    WaterMonster(String name){
        super(name);
    }
   String attack() {
return name + " Attack with water!";
}
}
class StoneMonster extends Monster{
     StoneMonster(String name){
        super(name);
    }
    String attack() {
return name + " Attack with stones!";
}
}
public class Mod4_3 {
    public static void main(String args[]){
    Monster m1 = new FireMonster("maahi");
    Monster m2 = new WaterMonster("ram");
    Monster m3 = new StoneMonster("shiva");
   System.out.println(m1.attack());
   System.out.println(m2.attack());
   System.out.println(m3.attack());
    }
}
