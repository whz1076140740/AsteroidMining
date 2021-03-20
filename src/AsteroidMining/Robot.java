package AsteroidMining;

public class Robot extends Worker{
     public Robot() {}
     public void Hide(Asteroid a) {
    	 if(a.Getdepth()==0 && a.GetResource()=="hollow") {
    		 
    	 }
     }
     public void HitbyExplode() {
    	 Travel();
    	 System.out.println("Explosion happens to the robot but fortunately no damage to it");
     }
     public void Die(Field f) {
    	 f.Remove();
    	 System.out.println("The robot is destroyed");
     }
}
