package AsteroidMining;

//import java.util.ArrayList;

//A class named Asteroid which can contain Resources or workers in the core
public class Asteroid extends Thing{
      //Some member not important
                  //  private int depth;
                  // private String resource;
                  // private long distancetosun;
                  //  private int id;
                  //  private ArrayList<String> Workersonit = new ArrayList<String>();
                  // private int Movedirection;
                  //  private long period;
      
      public Asteroid() {}; 
      //Decide Sun move dircetion to the asteroid and Move Sun Distance by one
      public void Move() {
            Testing.methodStart("Asteroid.Move()");
            //its logic stuff, please omit this
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
      //Asteroid RemoveResource form core
      public void Removeresource() {
    	      Testing.methodStart("Asteroid.Removeresource()");
            Testing.methodEnd("Asteroid.Removeresource()");
                   //resource = "";
      }
      //Step Asteroid to move sun peroid
      public void Step() {
            Testing.methodStart("Asteroid.Step()");
                  Move();
            Testing.methodEnd("Asteroid.Step()");
            //its logic stuff, please omit this
                  //distancetosun+=Movedirection;
                  // System.out.println("The current distance to sun is:" +distancetosun);
      }
      //Accept settler to the core to protect
      public void Protect(Worker w) {
            Testing.methodStart("Asteroid.Protect()");
            Testing.methodEnd("Asteroid.Protect()");
      }
}
