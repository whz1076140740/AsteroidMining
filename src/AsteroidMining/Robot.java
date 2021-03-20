package AsteroidMining;

public class Robot extends Worker{
     private String id;
     public Robot() {}
     public void Hide() {
    	  Testing.methodStart("The robot is hiding");
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
