package AsteroidMining;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Game {
   
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
        if(enter=="1")
        {
            SinglePlayer();
        }
        if(enter=="2"){
            MultiplePlayer();
        }
    }
    public void EndGame()
    {
        Testing.methodStart("Game.EndGame()");
    }
    public void SinglePlayer(){
        Map map = new Map();
        map.CreateAsteroid();
        map.CreateSettler();
        map.CreateRobot();
        map.CreateSunstorm();
        Testing.methodStart("Game.SinglePlayer()");
        System.out.println("SetPosition");
    }
    public void MultiplePlayer(){
        Testing.methodStart("Game.MultiplePlayer()");
        Map map = new Map();
        map.CreateAsteroid();
        map.CreateSettler();
        map.CreateRobot();
        map.CreateSunstorm();
        System.out.println("2.MultiplePlayer");
        System.out.println("SetPosition 1");
        System.out.println("SetPosition 2");
    }
    public 
}
