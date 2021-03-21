package AsteroidMining;

import java.io.BufferedReader;
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
Resources r = new Resources r();
    //Mine
    public void Mine(Asteroid a){
        Testing.methodStart(" Settler.Mine()");
        //Settler get resource from Asteroid a
        a.GetResource();
        //Asteroid a remove resource
        a.Removeresource();
       Testing.methodEnd(" Settler.Mine()");
    }

//Add resource to the Asteroid
    public void Addresource(Resources r, Asteroid a){
        Testing.methodStart(" Settler.Addresource(r,Asteroid)");
        //Asteroid take resource from settler 添加
        a.takeResource(r);
        //settler remove the resource
        this.Removeresources(r);
        Testing.methodEnd(" Settler.Addresource(r,Asteroid)");
    }

    public ArrayList<String> Getresource(){
        Testing.methodStart(" Settler.Getresource()");
        //Settler get resource from Asteroid a
        a.GetResource();
        //Asteroid a remove resource
        a.Removeresource();
        Testing.methodEnd("Settler.Getresource()");
        return resources;
    }


    public void Removeresources(Resources r){
        Testing.methodStart("Settler.Removeresources(Resources r)");
        Testing.methodEnd(" Settler.Removeresources(Resources r)");
    }

    public void Hide(){
        Testing.methodStart("Settler.Hide()");
        //添加 Add Settler into Asteroid
        a.SettlerHide();
        Testing.methodEnd("Settler.Hide()");
    }

    public void Constructrobot(Field f){
        Testing.methodStart("Settler.Constructrobot()");
        //settler create robot
        Testing.methodStart("Settler.CreateRobot");
        Robot r = new Robot();
        this.Removeresources(r);
        Testing.methodEnd("Settler.CreateRobot");
        f.Accept(r);
        Testing.methodEnd("Settler.Constructrobot()");
    }

    //constructgate
    public void Constructgate(Field f){
        Testing.methodStart("Settler.Constructgate()");
        //settler ConstructGate 添加
        Testing.methodStart("Settler.CreateTeleportaion-gate");
        Teleportaion_Gate tp = new Teleportaion_Gate();
        this.RemoveTeleportation(tp);
        Testing.methodEnd("Settler.CreateTeleportaion-gate");
        Testing.methodEnd("Settler.Constructgate()");
    }
    //新的函数 添加
    public void BuildGate(){
        //settler create robot
        Testing.methodStart("Settler.BuildGate()");
        this.RemoveTeleportation_gate(gate);
        //field and asteroid accept gate
        f.Accept(gate);
        a.AcceptTeleportation_Gate();
        Testing.methodEnd("Settler.BuildGate()");
    }
    //die 
    public void Die(Field f){
        Testing.methodStart(" Settler.Die()");
        //field remove settler 
        f.Remove(this);
        //remove resources
        this.Removeresources(r);
        //Asteroid remove settler
        a.RemoveWorker(this);
        Testing.methodEnd(" Settler.Die()");
    }

}