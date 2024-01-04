public class Droid{
    int batteryLevel;
    String name;
  
  
    public Droid(String droidName){
      name=droidName;
      batteryLevel=100;
    }
  
    //performing a task
    public void performTask(String task){
      System.out.println(name + " is performing task:" + task);
      batteryLevel-=10;
    }
  
    public String toString(){
      return "Hello , I’m the droid: "+ name;
    }
  
    public static void main(String[] args){
      Droid myNewDroid=new Droid("Codey");
      System.out.println(myNewDroid);
  
      // performTask newTaskPerformance=new performTask("dancing");
      //  System.out.println(newTaskPerformance);
      myNewDroid.performTask("dancing");
      myNewDroid.performTask("coding");
  
  
    }
  
  }