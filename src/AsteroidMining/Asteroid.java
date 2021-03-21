package AsteroidMining;

//import java.util.ArrayList;

public class Asteroid extends Thing{
    //  private int depth;
     // private String resource;
     // private long distancetosun;
    //  private int id;
    //  private ArrayList<String> Workersonit = new ArrayList<String>();
     // private int Movedirection;
    //  private long period;
      
      public Asteroid() {}; 
      public void Move() {
            Testing.methodStart("Asteroid.Move()");
            Step();
    	  //if(distancetosun<period){
        //          Movedirection=1;
        //          Step();
        //    }
        //if(distancetosun==period){
        //          Movedirection=-1;
        //          Step();
        //    }     
        //if(distancetosun==0){
        //          Movedirection=1;
        //          Step();
        //    }   
      }
      public void Removeresource() {
    	      Testing.methodStart("Asteroid.Removeresource()");
            Testing.methodEnd("Asteroid.Removeresource()");
            //resource = "";
      }
      public void Step() {
            Testing.methodStart("Asteroid.Step()");
            Testing.methodEnd("Asteroid.Step()");
    	  //distancetosun+=Movedirection;
       // System.out.println("The current distance to sun is:" +distancetosun);
      }
      public void Protect(Worker w) {
            Testing.methodStart("Asteroid.Protect()");
            Testing.methodEnd("Asteroid.Protect()");
      }
}
