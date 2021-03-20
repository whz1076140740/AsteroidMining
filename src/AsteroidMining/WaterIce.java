package AsteroidMining;

public class WaterIce  extends Asteroid {
	private String Resource="WaterIce";
    public WaterIce() {}
    public void sublime(Field f) {
    	Removeresource();
		f.Remove(this);
    	System.out.println("The waterice asteroid is in the perihelion, thus resource and asteroid evaporated");
    }
}
