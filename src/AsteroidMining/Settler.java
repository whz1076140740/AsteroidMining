package AsteroidMining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Settler extends Worker implements CanDie{

    //settler current field
    Field f = new Field();
    //settler current asteroid
    Asteroid a = new Asteroid();
    //resources in the settler bag
    ArrayList<String> resources = new ArrayList<String>();
    //teleport gate ID
    int teleportaion_Gate;
  

    //teleport gate ID
    Teleportaion_Gate gate = new Teleportaion_Gate();


    //resources to be loaded
    Resource r = new Resource();    
    //Mine
    public void Mine(Asteroid a){
        Settler s= new Settler();
        Testing.methodStart(" Settler.Mine()");
        //Settler get resource from Asteroid a
        s.GetResource();
        //Asteroid a remove resource
        a.Removeresource();
       Testing.methodEnd(" Settler.Mine()");
    }

//Add resource to the Asteroid
    public void AddResource(Resource r, Asteroid a){
        Testing.methodStart(" Settler.Addresource(r,Asteroid)");
        //Asteroid take resource from settler 添加
       System.out.println("Asteroid put specific resource.");
        //settler remove the resource
        this.Removeresources(r);
        Testing.methodEnd(" Settler.Addresource(r,Asteroid)");
    }

    public ArrayList<String> GetResource(){
        Testing.methodStart(" Settler.Getresource()");
        
        Testing.methodEnd("Settler.Getresource()");
        return resources;
    }


    public void Removeresources(Resource r){
        Testing.methodStart("Settler.Removeresources(Resources r)");
        Testing.methodEnd(" Settler.Removeresources(Resources r)");
    }

    public void Hide(){
        Testing.methodStart("Settler.Hide()");
        Worker w = new Worker();
        //添加 Add Settler into Asteroid
        a.Protect(w);
        Testing.methodEnd("Settler.Hide()");
    }

    public void Constructrobot(Field f){
        Testing.methodStart("Settler.Constructrobot()");
        //settler create robot
        Testing.methodStart("Settler.CreateRobot");
        Robot r = new Robot();
        System.out.println("Use resources to build resources");
        Testing.methodEnd("Settler.CreateRobot");
        f.Accept(r);
        Testing.methodEnd("Settler.Constructrobot()");
    }

    //constructgate
    public void Constructgate(Field f){
        Testing.methodStart("Settler.Constructgate()");
        //settler ConstructGate 添加
        Testing.methodStart("Settler.CreateTeleportaion-gate");
        //Teleportaion_Gate tp = new Teleportaion_Gate();
        System.out.println("Gate-1.");
        Testing.methodEnd("Settler.CreateTeleportaion-gate");
        Testing.methodEnd("Settler.Constructgate()");
    }
    //新的函数 添加
    public void BuildGate(){
        //settler create robot
        Testing.methodStart("Settler.BuildGate()");
        System.out.println("Gate-1.");
        //field and asteroid accept gate
        Teleportaion_Gate gate= new Teleportaion_Gate();
        f.Accept(gate);
        Testing.methodEnd("Settler.BuildGate()");
    }
    //die 
    public void Die(Field f){
        Testing.methodStart(" Settler.Die()");
        //field remove settler 
        f.Remove(this);
        //remove resources
        System.out.println("Lost all resources.");
        //Asteroid remove settler
        f.Remove(this);
        Testing.methodEnd(" Settler.Die()");
    }
    //Settler Check the resources and the asteroid. then Build Space Station
    public void SettlerBuildSpaceStation() throws IOException{
        Testing.methodStart("Settler.SettlerBuildSpaceStation()");
        //check resources
        System.out.println("Check if resources is enough");
        System.out.println("If resources is enough input 1");
        System.out.println("If resources is not-enough input 2");
        BufferedReader br = new BufferedReader(new 
        InputStreamReader(System.in));
        String enter = br.readLine();
        int num = Integer.parseInt(enter);
        if(num == 1){
            //check settler in the Asteroid
            System.out.println("Check if Settler is in an exist Asteroid");
            System.out.println("Check if Settler is in an exist Asteroid input 1");
            System.out.println("Check if Settler is in an exist Asteroid input 2");
            enter = br.readLine();
            num = Integer.parseInt(enter);
            if(num==1) {
            //Settler build station and EndGame
            System.out.println("You build a station successfully");
            Testing.methodStart("EndGame()");

            }else{
                if(num==2)
                System.out.println("Settler is not in an exist Asteroid");
                System.out.println("EndGame");
            }
        }
        else{
            if(num==2)
            System.out.println("Resource is not enough");
        }
        Testing.methodEnd("Settler.SettlerBuildSpaceStation()");
    }

}