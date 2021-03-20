package AsteroidMining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Game {
    String enter;
    public void Menu()throws IOException{
        BufferedReader br = new BufferedReader(new 
        InputStreamReader(System.in));
        System.out.println("Please enter the number :");
        System.out.println("1 is StartGame");
        System.out.println("2 is EndGame");

        
        enter = br.readLine();
  
        if(enter=="1")
        {
            StartGame();
        }
        else 
             EndGame();
 
    }
      
    
    public void StartGame()
    {

    }
    public void EndGame()
    {

    }
}
