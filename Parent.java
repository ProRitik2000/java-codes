public class Parent {
    int a =8;
    void display(){
    System.out.println("It is a parent class method");
  }
}

 class child extends Parent {
         int a=9;
    public static void main(String[] args) {
        Parent object=new Parent();
        object.display();
        System.out.println();
        System.out.println(object.a);
    }
}


