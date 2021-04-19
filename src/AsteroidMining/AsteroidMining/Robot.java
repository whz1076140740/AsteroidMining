
import java.io.IOException;

//A system controled Thing and can be died
public class Robot extends Worker{
     //private String id;
    
     //Test case Robot TP
     public void Tp(){
       Testing.methodStart("Robot.Tp()");
       Testing.methodEnd("Robot.Tp()");
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
		st.move();
		//after sun storm moves, if sun storm touches worker then worker dies.
		for(int i = 0; i < st.alist.size; i++){
			if(st.alist.get(i).id == asteroid.id){
				st.Touch(this);
			}
		}
  }
     //Test case Robot Hide
     
     //Test case Robot Hide
     public void Hide() {
    	  Testing.methodStart("Robot.Hide()");
       Testing.methodEnd("Robot.Hide()");
     }
     
     //Robot be explode by Asteroid and then move to another Asteroid
     public void HitbyExplode() throws IOException {
      Robot r = new Robot();
    	 r.Travel();
    	 System.out.println("Robot 1 was attacked by explode and landing a neighboring asteroid A2");
     }

     //Robot Die and only died by SunStorm
     public void Die(Field f) {
    	 f.Remove(this);
    	 System.out.println("Robot 1 was attacked by sunstorm and died.");
     }
}
