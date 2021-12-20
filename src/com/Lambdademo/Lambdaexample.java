package com.Lambdademo;

interface A{
    void show();
}
// to run the show method we need an object of that class but it's an interface
// so we need to create an another class to implement this interface

//the purpose of the above class is to just implement the interface
/*class B implements A{

    @Override
    public void show() {
        System.out.println("Hello A I am your class to implement your method");
    }
}
public class Lambdaexample {
    public static void main(String[] args) {
A a = new B();
a.show();
    }
}*/
/*public class Lambdaexample{
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("Hi");
            }
        };
    }
}*/
public class Lambdaexample{
    public static void main(String[] args) {
       /* new A() {
            @Override
            public void show()*/ //we no need to write new A() and public void show()because methodname,methodparam,methodreturntype
        //already we mentioned in interface sso simply use like ()as a method defination

        A obj ;
        obj=()->System.out.println("Hello I am implementing the interface using lambdaexpression");
        obj.show();
    }
}
//Keypoint://this block public void show() {System.out.println("Hi");} is a class
//            //and this class inside the lambdaexample so it's an inner class
//            //and doesn't have name so it's an anonymous inner class A obj = new A() is an anonymous inner class