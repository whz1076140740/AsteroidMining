package AsteroidMining;

public class RadioAsteroid extends Asteroid{
    //private String Resource="Uranium";
    public RadioAsteroid() {}
    public void Explode(Field f) {
    	Removeresource();
    	f.Remove(this);
    	System.out.println("The radioactive asteroid is in the perihelion and exploded");
    }
}
