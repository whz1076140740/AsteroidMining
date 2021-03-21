package AsteroidMining;

import java.io.IOException;

public class Robot extends Worker{
     //private String id;
    
     public void Tp(){
       Testing.methodStart("Robot.Tp()");
       Testing.methodEnd("Robot.Tp()");
     }
     public void Hide() {
    	  Testing.methodStart("Robot.Hide()");
       Testing.methodEnd("Robot.Hide()");
     }
     public void HitbyExplode() throws IOException {
      Robot r = new Robot();
    	 r.Travel();
    	 System.out.println("Robot 1 was attacked by explode and landing a neighboring asteroid A2");
     }
     public void Die(Field f) {
    	 f.Remove(this);
    	 System.out.println("Robot 1 was attacked by sunstorm and died.");
     }
}
