package AsteroidMining;

import java.util.ArrayList;

//import java.util.ArrayList;

//A class named Asteroid which can contain Resources or workers in the core
public class Asteroid extends Thing{
      private int depth;
      private String resource;
      private long distancetosun;
      private int id;
      private int TPid;
      //private ArrayList<String> Workersonit = new ArrayList<String>();
      private int Movedirection;
      //Some member not important
      
      public Asteroid() {}; 
      //Decide Sun move dircetion to the asteroid and Move Sun Distance by one
      public void Move() {
                        if(distancetosun<period){
                                  Movedirection=1;
                                  Step();
                             }
                        if(distancetosun==period){
                                  Movedirection=-1;
                                  Step();
                            }     
                        if(distancetosun==0){
                                  Movedirection=1;
                                  Step();
                            }   
      }
      //Asteroid RemoveResource form core
      public void Removeresource() {
    	      resource = "empty";
      }
      //Step Asteroid to move sun peroid
      public void Step() {
                  distancetosun+=Movedirection;
                  System.out.println("The current distance to sun is:" +distancetosun);
      }
      //Accept worker to the core to protect,change the status of worker
      public void Protect(Worker w) {
            w.status = "Protected";
      }
      /*public void Movehere(Worker w){
            w.Onwhichasteroiod = this.id;
            this.Workersonit.add(Integer.toString(w.id));*/
      }
      public int GetTPid(){
            return TPid;
      }
      public String getresource() {
            return resource;
      }
      public void setresource(String a) {
            resource = a;
      }
}
