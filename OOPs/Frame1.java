import java.awt.*;
class Frame1 extends Frame{
 Frame1(){
  Button b = new Button("click me");
  b.setBounds(30,100,80,30);
add(b);
setSize(300, 300);
setLayout(null);
setVisible(true);
}
public static void main(String args[]){
 Frame1 f=new Frame1();
}
}