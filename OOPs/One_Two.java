
class One_Two{
    public static void two() throws Exception{
        throw new Exception("exception thrown in method two");
    }
    public static void one() throws Exception{
        try{
            two();
        }
        catch(Exception e){
            System.out.println(e+"error in two");
            throw new Exception(e);
        }
    }
    public static void main(String[] args) {
        try{
           one();
        }
        catch(Exception e){
            System.out.println("Execption occured at main");
        }
        System.out.println("end..");
    }
}