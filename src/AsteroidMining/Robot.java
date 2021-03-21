package AsteroidMining;

public class Robot extends Worker{
     private String id;
     public Robot() {}
     public void Travel(){
       Testing.methodStart("Robot.Travel()");
       Testing.methodEnd("Robot.Travel()");
     }
     public void Drill(){
       Testing.methodStart("Robot.Drill()");
       Testing.methodEnd("Robot.Drill()");
     }
     public void Tp(){
       Testing.methodStart("Robot.Tp()");
       Testing.methodEnd("Robot.Tp()");
     }
     public void Hide() {
    	  Testing.methodStart("Robot.Hide()");
       Testing.methodEnd("Robot.Hide()");
     }
     public void HitbyExplode() {
    	 Travel();
    	 System.out.println("Robot 1 was attacked by explode and landing a neighboring asteroid A2");
     }
     public void Die(Field f) {
    	 f.Remove(this);
    	 System.out.println("Robot 1 was attacked by sunstorm and died.");
     }
}
