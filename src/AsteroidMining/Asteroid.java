package AsteroidMining;

import java.util.ArrayList;

public class Asteroid extends Thing{
      private int depth;
      private String resource;
      private long distancetosun;
      private int id;
      private ArrayList<String> Workersonit = new ArrayList<String>();
      private int Movedirection;
      private long period;
      
      public Asteroid() {}; 
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
      public void Removeresource() {
    	  resource = "";
      }
      public void Step() {
    	  distancetosun+=Movedirection;
        System.out.println("The current distance to sun is:" +distancetosun);
      }
}
