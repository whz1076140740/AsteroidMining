package AsteroidMining;

import java.io.BufferedReader;

public class Settler extends Worker implements CanDie{

    Field f = new Field();
    Asteroid a = new Asteroid();

    //Mine
    public void Mine(Asteroid a){
        //remove resource
        a.Removeresource();
        String enter;
        System.out.println("Whether the explosion conditions are met at this time?(Yes or No)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        enter = br.readLine();
        if(enter.equals("Yes"))
        {
            Testing.methodStart("Explode(settler1)");
        }
        System.out.println("Whether the sun storm conditions are met at this time?(Yes or No)");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        enter = br1.readLine();
        if(enter.equals("Yes"))
        {
            Testing.methodStart("Touch(settler1)");
        }
        Testing.methodStart(" Settler.Mine()");
    }

    public void Addresource(Resources r, Aseteroid a){
        Testing.methodStart(" Settler.Addresource()");
    }

    public ArrayList<String> Getresource(){
        Testing.methodStart(" Settler.Getresource()");
    }

    public void Removeresources(Resources r){
        Testing.methodStart(" Settler.Hide()");
    }

    public void Hide(){
        Testing.methodStart(" Settler.Removeresources()");
    }

    public void Constructrobot(Field f){
        Testing.methodStart(" Settler.Constructrobot()");
    }

    public void Constructgate(Field f){
        Testing.methodStart(" Settler.Constructgate()");
    }

    public void Die(Field f){
        Testing.methodStart(" Settler.Die()");
    }

}