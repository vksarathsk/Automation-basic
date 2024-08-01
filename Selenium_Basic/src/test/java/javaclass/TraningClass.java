package javaclass;


public class TraningClass {

   static String Fullname = "Sarathkumar";

    public static void main(String[] args) {
        String stringvalue = TraningClass.staticvalue();
        System.out.println(stringvalue);

        TraningClass traningClass = new TraningClass();
        int intvalue = traningClass.Nonstatic();
        System.out.println(intvalue);
    }
    public int Nonstatic(){
        int number = 123 ;
        return number;
       // System.out.println(Fullname);
    }
    public static String staticvalue(){
        String Name = "sarath";
        System.out.println(Fullname);
        return Name;
    }
}
