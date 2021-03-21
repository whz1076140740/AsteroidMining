package AsteroidMining;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Game {
   private Settler s;

   //Test case of StartGame
    public void StartGame()throws IOException
    {
        String enter;
        Testing.methodStart("Game.StartGame()");
        System.out.println("Please choose play mode:");
        System.out.println("1:SinglePlayer");
        System.out.println("2.MultiplePlayer");
        BufferedReader br = new BufferedReader(new 
        InputStreamReader(System.in));
        enter = br.readLine();
        int num = Integer.parseInt(enter);
        if(num==1)
        {
            SinglePlayer();
        }
        else if(num==2){
            MultiplePlayer();
        }
        else 
        System.out.println("Wrong input");
    }
    //Test case of EndGame
    public void EndGame()
    {
        Testing.methodStart("Game.EndGame()");
    }
    //Test case of SinglePlayer
    public void SinglePlayer(){
        Testing.methodStart("Game.SinglePlayer()");
        Map map = new Map();
        map.CreateAsteroid();
        map.CreateRobot();
        map.CreateSunstorm();
        SetPosition(s);
        Testing.methodEnd("Game.SinglePlayer()");
        
    }
    //Test case of MultiplePlayer
    public void MultiplePlayer(){
        Testing.methodStart("Game.MultiplePlayer()");
        Map map = new Map();
        map.CreateAsteroid();
        map.CreateRobot();
        map.CreateSunstorm();
        SetPosition(s);
        SetPosition(s);
        Testing.methodEnd("Game.MultiplePlayer()");
    }
    //Test case of Set Position
    public void SetPosition(Settler s)
    {
        Map map = new Map();
        Field field=new Field();
        Testing.methodStart("Game.SetPosition()");
        this.s = s;
        map.CreateSettler();
        field.Accept(s);
        Testing.methodEnd("Game.SetPosition()");
    }
    //Test case of ControllSettler
    public void ControllSettler(){
        Testing.methodStart("Game.ControllSettler()");
    }

}
