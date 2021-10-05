class runtime_polymorphism{  
  void run(){System.out.println("running");}  
}  
class Splendor extends runtime_polymorphism{  
  void run(){System.out.println("running safely with 60km");}  
  
  public static void main(String args[]){  
    runtime_polymorphism b = new Splendor();//upcasting  
    b.run();  
  }  
} 
