package AsteroidMining;

import java.io.IOException;

//A system controled Thing and can be died
public class Robot extends Worker{
     //private String id;
    private String id;
    Robot r = new Robot(){};
     //Test case Robot TP
     public void Tp(Asteroid a, Map m,Field f,Field nf){
        if(a.GetTPid!=null){
          for(int i; i < m.Getglist().size();i++){
            if(m.Getglist().get(i).id == a.GetTPid()){
              m.Getglist().get(i).GetNeighbor();
              Asteroid na = m.Getglist().get(i).Getlocation();
              f.remove(this);
              nf.Accept(this);
              na.Movehere(this);
            }
          }
        }
     }
     public void Drill(Asteroid asteroid) throws IOException 
    {
	// reduce the depth of asteroid and check that if ra and fulfills condition then explode
	    if(asteroid.depth!= 0){
			asteroid.depth -= 1;
			if(asteroid.depth ==0&&asteroid.resource.equals("uranium")&& asteroid.distancetosun< 20){
               this.HitbyExplode();
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
     //Test case Robot Hide
     public void Hide(Asteroid a) {
    	  if(a.resource.equals("")&&a.depth == 0){
          a.Protect(this);
        }
     }
     
     //Robot be explode by Asteroid and then move to another Asteroid
     public void HitbyExplode() throws IOException {
    	 r.Travel();
    	 System.out.println("Robot 1 was attacked by explode and landing a neighboring asteroid A2");
     }

     //Robot Die and only died by SunStorm
     public void Die(Field f) {
    	 f.Remove(this);
    	 System.out.println("Robot 1 was attacked by sunstorm and died.");
     }
     public String GetRobotId(){
       return id;
     }
}
