package AsteroidMining;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Testing{
    private static final Field WaterIce = null;
    private static String tab="";
    public static void methodStart(String m )
    {
        System.out.println(tab+m+" started");
        tab=tab+" ";
    }
    public static void methodEnd(String m)
    {
        System.out.println(tab+m+" ended");
        tab=tab.substring(0,tab.length()-2);
    }
    public void Test() throws IOException
    {
        String enter;
        System.out.println("Please chose the test case:");
        System.out.println("1:StartGame");
        System.out.println("2:MultiPlayer");
        System.out.println("3:SinglePlayer");
        System.out.println("4:SetPosition");
        System.out.println("5:ControllSettler");
        System.out.println("6:SettlerBuildGate");
        System.out.println("7:SettlerBuildRobot");
        System.out.println("8:SettlerBuildSpaceStation");
        System.out.println("9:SettlerDrill");


        BufferedReader br = new BufferedReader(new 
        InputStreamReader(System.in));
        enter = br.readLine();
    
        if(enter.equals("1"))
        {
            Game game = new Game();
            game.StartGame();
        }
        if(enter.equals("2")){
            Game game = new Game();
            game.MultiplePlayer();
        }
    }
    
    public static void main(String[] args)throws IOException{
        Testing test = new Testing();
        test.Test();
    }
}