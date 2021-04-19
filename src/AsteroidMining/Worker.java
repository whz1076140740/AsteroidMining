
package AsteroidMining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Worker which is a father class of Robot and Settler
//Can do move, drill, Usegate Test case
public class Worker extends Thing{
	private int Onwhichasteroiod;
	private String id;
	 Field cf = new Field();//current field, just use to test
	 Field nf = new Field();//neighboring field
     Thing t = new Thing();
	
	 Asteroid a = new Asteroid();
	 RadioAsteroid ra = new RadioAsteroid();
	 SunStorm st = new SunStorm();

	 //Worker travel to another field 
	 //and then be checked with the Explosion or Sunstorm touch condition
	public void  Travel() throws IOException
    {
	 cf.Remove(this);
	 cf.GetNeighours();
	 nf.Accept(this);
	 a.Movehere(this);

	for(int i = 0 ; i < st.alist.size();i++){
           if(st.alist.get(i).id == this.Onwhichasteroiod){
			   st.Touch(this);
		   }
		}
    }
	 
	 //Worker drill the asteroid and be checked the asteroid condition and do drill
	 //and then be checked with the Explosion or Sunstorm touch condition
	public void Drill(Asteroid asteroid) throws IOException 
    {
	// reduce the depth of asteroid and check that if ra and fulfills condition then explode
	    if(asteroid.depth!= 0){
			asteroid.depth -= 1;
			if(asteroid.depth ==0&&asteroid.resource.equals("uranium")&& asteroid.distancetosun< 20){
               this.die();
			   Remove(asteroid); //fulfills the explode condition , worker dies
			}                    //and this asteroid is removed from the field
		}
		else{
			System.out.println("The asteroid is already drilled through!");
		}
		asteroid.Move();  //asteroid and sun storm moves after worker does the action
		st.Move();
		//after sun storm moves, if sun storm touches worker then worker dies.
		for(int i = 0; i < st.alist.size; i++){
			if(st.alist.get(i).id == asteroid.id){
				st.Touch(this);
			}
		}
 }
   	 
   
   	 
    
   	
	 //Settler/Robot TP Test case
	 //Worker be checked the gate situition before TP  and then TP by using the gate
   	public void TP() throws IOException 
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
   	

    public void die(){

	}

    public int GetOnwhichasteroid(){
		return Onwhichasteroiod;
	}
	public String GetId(){
		return id;
	}