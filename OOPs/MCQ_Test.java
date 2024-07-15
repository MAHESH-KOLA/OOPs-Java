import java.util.*;

abstract class TestQuestion{
    public String text;
    public int point;
    TestQuestion(String text, int point){
        this.text=text;
        this.point=point;
    }
    abstract boolean isCorrect(int answer);
}

class MultChoice extends TestQuestion{
    String options[] = new String[4];
    int correct_choice_ind;
    MultChoice(String text, int point,int correct_choice_ind, String options[]){
       super(text,point);
        this.correct_choice_ind=correct_choice_ind;
        this.options=options;
    }
    void display(){
        System.out.println(text);
        for(int i=0;i<4;i++){
            System.out.print( options[i] + "  ");
        }
        System.out.println();
    }
      boolean isCorrect(int myChoice){
          if(correct_choice_ind==myChoice) return true;
          return false;
  }

}
public class MCQ_Test{
    public static void main(String args[]){
        System.out.println("enter no. of multiple choice questions: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        MultChoice m[]= new MultChoice[n];
        int total_points = 0;


        for(int i=0;i<n;i++){
        System.out.print("enter questions text: ");
        sc.nextLine();
        String text=sc.nextLine();
        System.out.println("enter point: ");
       int  point=sc.nextInt();
        System.out.println("enter correct_option index : ");
        int correct_choice_ind=sc.nextInt();
        System.out.println("enter options: ");
        String options[] = new String[4];
        for(int j=0;j<4;j++){
            options[j]=sc.next();
        }
        
        m[i] = new MultChoice(text, point, correct_choice_ind, options);
        
        System.out.println("Queston: "+ (i+1));
            m[i].display();

        System.out.println("Please enter index of your choice: ");
        int myChoice = sc.nextInt();
        if(m[i].isCorrect(myChoice)){
            System.out.println("Your answer is Correct..");
            total_points+=m[i].point;
        }
        else{
            System.out.print("OOPS! Your answer is Incorrect..\n The correct option is: ");
            System.out.println(options[correct_choice_ind]);
        }
        }
        System.out.println("............End of Text.............");
        System.out.println("Your total score: "+ total_points);
    }
}