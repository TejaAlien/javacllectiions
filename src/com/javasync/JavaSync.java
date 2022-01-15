package com.javasync;

public class JavaSync {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
     // c.increment();//<--we call the increment method once so c.count reutrn 1
        // if we call more than one time c.count changes accordingly

      Thread t1 = new Thread(new Runnable() {
          @Override
          public void run() {
              for(int i =0; i<=1000;i++){
                  c.increment();

              }

          }
      });
     Thread t2 = new Thread(new Runnable() {
         @Override
         public void run() {
             for(int j=0;j<=1000;j++){
                 c.increment();
             }
         }
     });
      t1.start();
t2.start();
      t1.join();
      t2.join();
        System.out.println(c.count);
    }}
    class Counter{//<--I am creating this counter class with field and method
        int count;
        public synchronized void increment(){//<-- the moment we use synchonized only one thread can execute this method
            //once the thread completed the task then only second thread perforimgn the task
            count++;
        }
    }

