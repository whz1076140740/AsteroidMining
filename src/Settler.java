
import java.awt.Robot;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


//to the teacher for some reasons, the functions code is too long 
//because we was not able to put all SunStorm Touch and Radio explosion condition into one single function
//Sorry for making read


//A user control Thing which can be died
public class Settler extends Worker {

    //settler current field
    Field f = new Field();
    //settler current asteroid
    Asteroid a = new Asteroid();
    //resources in the settler bag
    ArrayList<Resource> resourcesList = new ArrayList<Resource>();
    
    //teleport gate ID
    int teleportaion_Gate;
    //teleport gate
    ArrayList<Teleportaion_Gate> gates= new ArrayList<Teleportaion_Gate>();
    //resources be carried by settler
    Resource r = new Resource();

    //Mine
    //Settler get resource from Asteroid
    // and at same time Asteroid remove it by core
    public void Mine(Asteroid a) throws IOException{
        Settler s= new Settler();
        Testing.methodStart(" Settler.Mine()");
        
       String enter;
       System.out.println("Whether the explosion conditions are met at this time?(Yes or No)");
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        //Settler get resource from Asteroid a
        s.GetResource();
        //Asteroid a remove resource
        a.Removeresource();
       Testing.methodEnd(" Settler.Mine()");

       //Check explosion condition
       enter = br.readLine();
       if(enter.equals("Yes"))
       {
          ra.Explode(cf);
          return;
       }
       //Check sunstorm condition
       System.out.println("Whether the sun storm conditions are met at this time?(Yes or No)");
       BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
       enter = br1.readLine();
       if(enter.equals("Yes"))
       {
           //for test
          st.Touch(s);
          return;
       }
    }

    //Add resource to the Asteroid
    //Settler add resource into Asteroid
    //And check wheather the resource is waterice which will be sublime in the perihelion
    public void AddResource(Resource r, Asteroid a) throws IOException{
        Testing.methodStart(" Settler.Addresource(r,Asteroid)");
        //Asteroid take resource from settler
       System.out.println("Asteroid put specific resource.");
       System.out.println("Check if Asteroid is in the perihelion");
       System.out.println("If Asteroid is in the perihelion input 1");
       System.out.println("If Asteroid is not in the perihelion input 2");
       BufferedReader br = new BufferedReader(new 
       InputStreamReader(System.in));
       String enter = br.readLine();
       int num = Integer.parseInt(enter);
       if(num == 1){
        System.out.println("Check if resources is WaterIce or Uranium");
        this.Removeresources(r);

        System.out.println("If resources is WaterIce input 1");
        System.out.println("If resources is Uranium input 2");
        System.out.println("If resources is not-both of them input 3");
        if(num==1){
            WaterIce w = new WaterIce();
            w.sublime(f);
        }
        if(num==2){
            RadioAsteroid rd = new RadioAsteroid();
            rd.Explode(f);
            this.Die(f);
        }
        if(num==3){ 
            //if not WaterIce or Uranuim
            if(num == 2){
                //End by do nothing else
             Testing.methodEnd(" Settler.Addresource(r,Asteroid)");
             return;
            }
        }
    }else{
        //if not in perhelion not do anything
       if(num == 2){
        //End by do nothing else
        Testing.methodEnd(" Settler.Addresource(r,Asteroid)");
        return;
       }
    }
    //End by do nothing else
        Testing.methodEnd(" Settler.Addresource(r,Asteroid)");
}

    // return the resources in the Settler
    //Not in the Test case
    public ArrayList<Resource> GetResource(){
        Testing.methodStart(" Settler.Getresource()");
        Testing.methodEnd("Settler.Getresource()");
        return resourcesList;
    }


    //Settler Remove its own resources
    //not in the testcase
    public void Removeresources(Resource r){
        for(int i=0;i<resourcesList.size();i++)
        {
            if(resourcesList.get(i)==r)
            {
                this.resourcesList.remove(r);
                System.out.println("Success remove resource.");
            }
            else
            System.out.println("You dont have such resource.");
        }
      
    }

    //Settler Hide Test case
    //Settler hide into an asteroid
    public void Hide(Field a){
        if(a.hide==false)
        {
            //Add Settler into Asteroid
            a.Protect(this);
            System.out.println("Success hide.");
            a.hide = true;
        }
        else
        System.out.println("Some one already in the Asteroid.");
       
    }

    //Settler construct Robot Test case
    //Settler create a robot and spend resources and then put into the field
    public void Constructrobot(Field f){
        //settler create robot
        int iron;
        int carbon;
        int uranium;
        for(int i=0;i<resourcesList.size();i++)
        {
           if(resourcesList.get(i)==Resource.)
            iron++;
            if(resourcesList.get(i)=="Carbon")
            carbon++;
            if(resourcesList.get(i)=="Uranium")
            uranium++;
        }
        if(iron>=1&&carbon>=1&&uranium>=1)
        {
            Robot r = new Robot();
             f.Accept(r);
             for(int i=0;i<resourcesList.size();i++)
                {
                    if(resourcesList.get(i)=="Carbon")
                    Removeresources(resourcesList.get(i));
                    break;
                }
                for(int i=0;i<resources.size();i++)
                {
                    if(resourcesList.get(i)=="Carbon")
                    Removeresources(resourcesList.get(i));
                    break;
                }
                for(int i=0;i<resources.size();i++)
                {
                    if(resourcesList.get(i)=="Carbon")
                    Removeresources(resourcesList.get(i));
                    break;
                }
            System.out.println("Success construct.");
        }
        else
        System.out.println("Not enough resources.");
       
       
       
    }

    //Settler constructgate Test case
    //Settler create gate by spending resources
    public void Constructgate(Field f,Settler s){
        int iron;
        int waterice;
        int uranium;
        for(int i=0;i<resources.size();i++)
        {
           if(resourcesList.get(i)=="Iron")
            iron++;
            if(resourcesList.get(i)=="WaterIce")
            waterice++;
            if(resourcesList.get(i)=="Uranium")
            uranium++;
        }
        if(iron>=2&&waterice>=1&&uranium>=1)
        {
            Teleportaion_Gate g1 = new Teleportaion_Gate();
            Teleportaion_Gate g2 = new Teleportaion_Gate();
            gates.add(g1);
            gates.add(g2);
            int count=0;
             f.Accept(r);
             for(int i=0;i<resourcesList.size();i++)
                {
                    if(resourcesList.get(i)=="Carbon")
                    resourcesList.remove(i);
                    break;
                }
                for(int i=0;i<resourcesList.size();i++)
                {
        
                    if(resources(i)=="WaterIce")
                    resourcesList.remove(i);
                    count++;
                    if(count==2)
                    break;
                }
                for(int i=0;i<resourcesList.size();i++)
                {
                    if(resources(i)=="Uranium")
                    resourcesList.remove(i);
                    break;
                }
            System.out.println("Success construct.");
        }
        else
        System.out.println("Not enough resources.");
       
    }

    //Settler BuildGate Test case
    //Settler build gate in the field and field will accept it
    //Check the sunstorm and perihelion explosion condition same time
    public void BuildGate() {
        if(f.gate==false&&this.gates!=null)
        {
            for(int i=0;i<= gates.size();i++) {
               if(gates.get(i)!=null)
               {
                 f.Accept(gates.get(i));
                 gates.remove(gates.get(i));
                 f.gate =true;
                 System.out.println("Success build gate.");
               }
             }
        }
        else
        System.out.println("No gate in package.");
    }
    //SettlerBuildSpaceStation Test case
    //Settler Check the resources and the asteroid. 
    //then Build Space Station
    public void SettlerBuildSpaceStation() throws IOException{
        
    }

}