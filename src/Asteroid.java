import java.lang.reflect.Field;

//A class named Asteroid which can contain Resources or workers in the core
public class Asteroid extends Thing{
      private String resource;
      public String getresource() {
    	  return resource;
      }
      public void setresource(String a) {
    	  resource = a;
      }
      private int depth;
      public int getdepth() {
    	  return depth;
      }
      public void setdepth(int a) {
    	  depth = a;
      }
      private int distancetosun;
      public int getdistance() {
    	  return distancetosun;
      }
      public void setdistance(int a) {
    	  distancetosun = a;
      }
      
      private String TPid;
      public String getTPid() {
    	  return TPid;
      }
      public void setTPid(String a) {
    	     TPid = a;
      }
      
      private String id;
      public String getid() {
    	  return id;
      }
      public void setid(String a) {
    	     id = a;
      }
      
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
      public void Protect(Worker w,Field f) {
            Testing.methodStart("Asteroid.Protect()");
            f.Hide=true;
            f.Accept(w);
            Testing.methodEnd("Asteroid.Protect()");
      }
}