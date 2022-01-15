package com;

import java.util.Scanner;

public class Volatile {
    public static void main(String[] args) {
Counter c = new Counter();
c.start();
//we can also use c.run() but it will run inside the main thread
        //c.start();will run outside the main thread
        Scanner stopcount = new Scanner(System.in);
        stopcount.nextLine();//if you hit enter in the console  counting will stop
      //
         c.stopcounting();
    }
}

class Counter extends Thread{
    private volatile boolean counting = true;
    //counting variable gets  cached into memory
    //volatile variable is visible everytime when we run the thread
    //since this gets called its own thread it might not look outside of the thread and keep
    //checking on counting
    //when we say stop counting and set it to false that's not
   // inside of the run method so it's not inside of the thread so there are chances that
    //when you are runnning your thrread and hit enter and you want it to stop countiing
    //but it's not it's just going to keep refering to the value that had been cached away
    //not that it's been updated
    //so we want the variable evertime to be checked when we run the thread
    //And we won't want to deal with it being cached away and not changing in aparticaular threaaad
    //the way we can do is like to set this to volatile makes the counting variable visible
    //everytime when we run this thread

    private int counter =1;
    @Override
    public void run(){
        while (counting){
System.out.println(counter);
counter++;
try{


Thread.sleep(50
);}
    catch(Exception ex){

    }

}}
public void stopcounting(){
        counting=false;
}
}
/*
KeyNotes:
//we can also use c.run() but it will run inside the main thread
//c.start();will run outside the main thread*/
//Volatile keypoints:
//variable got cached in main memory
//since we use thread.start--> means thread is running explicitly
//^^ not running inside the main thread
//thread.run<--to make the thread run inside the main thread
//so there is possibility it mightnot look ouside of the the thread -->to check the variable gets cached in memory(everytime)
//Using Volatile <-- makes that variable visible to all the threads so need to explicitly go outside of the thread
//to check the variable that gets cached in main memeory
//Also volatile makes the thread -threadsafe-synchronized
//thread cannot be blocked for waiting in case of volatile
