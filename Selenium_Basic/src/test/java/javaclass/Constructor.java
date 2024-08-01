package javaclass;

public class Constructor {

     static int i;   // global
     static String name;

     public Constructor(int i , String name){        // i = local
        this.i = i;
        this.name = name;
    }
    public static void main(String[] args) {
        Constructor mm = new Constructor(1000,"sarath");
        System.out.println(i);
        System.out.println(name);
    }
    public void m1(){
      //  System.out.println(i);
    }
}
