package javaclass;

public class ConstructorClass {

  static int i = 100; // global variable //if you user static keyword chaned for the static data
        int b = 1000;
    public static void main(String[] args) {
        ConstructorClass.m3();

        ConstructorClass constructorClass = new ConstructorClass();

        String m1value = constructorClass.m2();
     //   System.out.println(m1value);

        int m2value = constructorClass.m1();
      //  System.out.println(m2value);
    }

    // this is Non-static method (ex: Without "Static" keyword this is Non-Static method)
    public int m1(){
        int mark = 372;
      //  System.out.println(i);
        int b = 2000;
        System.out.println(b);
        return mark;
    }
    public String m2(){
        String name = "sarath";
      //  System.out.println(i);
        return name;
    }

    //this is Static Method
    public static void m3 (){

    }

}
//Method
//Static Method - Accepts only static data =>
// if it is a static method than you need to enter "ClassName.MethodName" to call

//Non-Static Method - Accepts both static and Non-static data
// if it is a Non-static method By creating the object for the class