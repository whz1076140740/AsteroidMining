package AsteroidMining;

public class WaterIce  extends Asteroid {
	public String Resource="WaterIce";
    public WaterIce() {}
    public void sublime(Field f) {
    	f.Remove(this);
    	Removeresource();
    	System.out.println("The waterice asteroid is in the perihelion, thus resource and asteroid evaporated");
    }
}
