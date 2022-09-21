abstract class Car{
   abstract void run();
 }

 class Bmw extends Car{
 void run(){System.out.println("running safely..");}

 public static void main(String args[]){
  Car obj = new Bmw();
  obj.run();
 }
 }
