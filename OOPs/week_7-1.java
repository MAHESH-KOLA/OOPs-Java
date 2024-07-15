abstract class shape{
    abstract void getArea();
    abstract void getVolume();
}
class square extends shape{
    Scanner sc = new Scanner(System.in);
    int side;
    shape(){
        this.side=sc.nextInt();
    }
    void getArea(){
        System.out.println(side*side);
    }
    void getVolume(){
        System.out.println("oops..");
    }
}
class week_7_1{
    public static void main(String[] args) {
        square sq = new square();
        sq.getArea();
        sq.getVolume();
    }
  }