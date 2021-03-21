package AsteroidMining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Worker extends Thing{
	 Field cf = new Field();//current field, just use to test
	 Field nf = new Field();//neighboring field
	 Worker settler1 = new Worker(); // just used to test method
	 Worker robot1 = new Worker();
	 RadioAsteroid ra = new RadioAsteroid();
	 SunStorm st = new SunStorm();
	public void  SettlerTravel() throws IOException 
    {
	 cf.Remove(settler1);
	 cf.GetNeighbors();
	 nf.Accept(settler1);
   	 Testing.methodStart("Movehere()");
   	 Testing.methodEnd("Movehere()");
   	 String enter;
   	 System.out.println("Whether the explosion conditions are met at this time?(Yes or No)");
   	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   	 enter = br.readLine();
   	 if(enter.equals("Yes"))
   	 {
   		ra.Explode();
   	 }
   	 System.out.println("Whether the sun storm conditions are met at this time?(Yes or No)");
   	 BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
   	 enter = br1.readLine();
   	 if(enter.equals("Yes"))
   	 {
   		 st.Touch(settler1);
   	 }
    }
	
	public void  RobotTravel() throws IOException 
    {
	 cf.Remove(robot1);
	 cf.GetNeighbors();
	 nf.Accept(robot1);
   	 Testing.methodStart("Movehere()");
   	 Testing.methodEnd("Movehere()");
   	 String enter;
   	 System.out.println("Whether the explosion conditions are met at this time?(Yes or No)");
   	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   	 enter = br.readLine();
   	 if(enter.equals("Yes"))
   	 {
   		ra.Explode();
   	 }
   	 System.out.println("Whether the sun storm conditions are met at this time?(Yes or No)");
   	 BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
   	 enter = br1.readLine();
   	 if(enter.equals("Yes"))
   	 {
   		 st.Touch(robot1);
   	 }
    }
	
	public void SettlerDrill() throws IOException 
    {
   	 String enter;
   	 System.out.println("If depth of mantle larger than 0?(Yes or No)");
   	 BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
   	 enter = br2.readLine();
   	 if(enter.equals("Yes"))
   	 {
   		 System.out.println("Reduce asteroid's depth by 1");
       	 System.out.println("Whether the explosion conditions are met at this time?(Yes or No)");
       	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       	 enter = br.readLine();
       	 if(enter.equals("Yes"))
       	 {
       		ra.Explode();
       	 }
       	 System.out.println("Whether the sun storm conditions are met at this time?(Yes or No)");
       	 BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
       	 enter = br1.readLine();
       	 if(enter.equals("Yes"))
       	 {
       		st.Touch(settler1);
       	 }
   	 }
   	 
   	public void RobotDrill() throws IOException 
    {
   	 String enter;
   	 System.out.println("If depth of mantle larger than 0?(Yes or No)");
   	 BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
   	 enter = br2.readLine();
   	 if(enter.equals("Yes"))
   	 {
   		 System.out.println("Reduce asteroid's depth by 1");
       	 System.out.println("Whether the explosion conditions are met at this time?(Yes or No)");
       	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       	 enter = br.readLine();
       	 if(enter.equals("Yes"))
       	 {
       		ra.Explode();
       	 }
       	 System.out.println("Whether the sun storm conditions are met at this time?(Yes or No)");
       	 BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
       	 enter = br1.readLine();
       	 if(enter.equals("Yes"))
       	 {
       		st.Touch(robot1);
       	 }
   	 }
    }
   	
   	public void Settlerusegate() throws IOException 
    {
   	 String enter;
   	 System.out.println("Whether the gate is activated?(Yes or No)");
   	 BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
   	 enter = br2.readLine();
   	 if(enter.equals("Yes"))
   	 {
   		 Testing.methodStart("Movehere(currentgate)");
   		 Testing.methodStart("Movehere(neighborgate)");
   		 Testing.methodStart("Movehere(asteroid)");
   		 Testing.methodEnd("Movehere(currentgate)");
   		 Testing.methodEnd("Movehere(neighborgate)");
   		 Testing.methodEnd("Movehere(asteroid)");
   	 }
   	 if(enter.equals("No"))
   	 {
   		 System.out.println("There is no activated potal on this asteroid,and the teleportation cannot be completeed");
   	 }
   			 
}
   	
   	public void Robotusegate() throws IOException 
    {
   	 String enter;
   	 System.out.println("Whether the gate is activated?(Yes or No)");
   	 BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
   	 enter = br2.readLine();
   	 if(enter.equals("Yes"))
   	 {
   		 Testing.methodStart("Movehere(currentgate)");
   		 Testing.methodStart("Movehere(neighborgate)");
   		 Testing.methodStart("Movehere(asteroid)");
   		 Testing.methodEnd("Movehere(currentgate)");
   		 Testing.methodEnd("Movehere(neighborgate)");
   		 Testing.methodEnd("Movehere(asteroid)");
   	 }
   	 if(enter.equals("No"))
   	 {
   		 System.out.println("There is no activated potal on this asteroid,and the teleportation cannot be completeed");
   	 }
   
}
}