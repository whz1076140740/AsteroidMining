package AsteroidMining;

//A class which used for creation and containing Field
public class Map {
    private ArrayList<settler> slist = new ArrayList<settler>();
    private ArrayList<robot> rlist = new ArrayList<robot>();
    private ArraList<Teleportation_Gate> glist= new ArrayList<Teleportaion_Gate>();
    private int Round;
    
    //Test case of CreateAsteroid
    public void CreateAsteroid()
    {
        Testing.methodStart("Map.CreateAsteroid()");
        
    }
    //Test case of CreateSettler
    public void CreateSettler()
    {
        Testing.methodStart("Map.CreateSettler()");
    }
    //Test case of CreateRobot
    public void CreateRobot()
    {
        Testing.methodStart("Map.CreateRobot()");
    }
    //Test case of CreateSunstorm
    public void CreateSunstorm()
    {
        Testing.methodStart("Map.CreateSunstorm()");
    }
    //Test case of CreateGate
    public void CreateGate()
    {
        Testing.methodStart("Map.CreateGate()");
    }
    //Test case of Step
    public void Step()
    {
        Testing.methodStart("Map.Step()");
    }
    public Teleportation_Gate Getglist(){
        return Arrlist<Teleportation_Gate> glist;
    }
}
