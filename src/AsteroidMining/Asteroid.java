package AsteroidMining;


public class Asteroid extends Thing{
      private int depth;
      private String resource;
      private long distancetosun;
      private int id;
      private int TPid;
      public int temp;
      public String tmp;
      public long tmp1;
      public int tmp2;
      
      public Asteroid() {};
      
      public int Getdepth() {
		temp = depth;
		System.out.println("The depth of this asteroid is"+ temp);
		return temp;
       }

      public String GetResource() {
    	  tmp = resource;
    	  System.out.println("The resource type of this asteroid is"+ tmp);
    	  return tmp;
      }
      public long Getdistance() {
    	  tmp1 = distancetosun;
    	  System.out.println("The current distance to sun is"+ tmp1);
    	  return tmp1;
      }
      public int getid() {
    	  tmp2 = id;
    	  System.out.println("The id of the asteroid is "+ tmp2);
    	  return tmp2;
      }
      public void Move() {
    	  
      }
      public void Removeresource() {
    	  resource = "";
      }
      public void Step() {
    	  
      }
}
