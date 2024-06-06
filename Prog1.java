public class Prog1 {
   public int u = 10;
   public void add(){
      System.out.println(u);
   }
    public static void main(String[] args) {
      Prog1 sum=new Prog1();
      sum.add();
       for(int i=2;i<=20;i++){
        if(i%2==0){
           System.out.println(i);
        }
       }
    }
}
