package AsteroidMining;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Testing{
    private static String tab="";
    public static void methodStart(String m )
    {
        System.out.println(tab+m+" started");
        tab=tab+" ";
    }
    public static void methodEnd(String m)
    {
        System.out.println(tab+m+" ended");
        tab=tab.substring(0,tab.length()-1);
    }
    public void Test() throws IOException
    {
        Game game = new Game();
        Settler s= new Settler();
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
        System.out.println("10:SettlerHide");
        System.out.println("11:SettlerMine");
        System.out.println("12:SettlerPutResourceDown");
        System.out.println("13:SettlerSetGate");
        System.out.println("14:SettlerTravel");
        System.out.println("15:SettlerUseGate");
        System.out.println("17:ViewMap");
        System.out.println("18:ControllerAsteroid");
        System.out.println("19:ControlSunStorm");
        System.out.println("20:ControlRobot");
        System.out.println("21:RobotTravel");
        System.out.println("22:RobotDrill");
        System.out.println("23:RobotHide");
        System.out.println("24:RobotUseGate");
        System.out.println("21:EndGame");

        BufferedReader br = new BufferedReader(new 
        InputStreamReader(System.in));
        enter = br.readLine();
        int num = Integer.parseInt(enter);
        switch(num)
        {
            
            case 1:
            game.StartGame();
            case 2:
            game.MultiplePlayer();
            case 3:
            game.SinglePlayer();
            case 4:
            game.SetPosition(s);
            case 5:
            game.ControllSettler();
            case 6:
            s.SettlerBuildGate();
            case 7:
            s.SettlerBuildRobot();
            case 8:
            s.SettlerBuildSpaceStation();
            case 9:
            s.SettlerDrill();



        }
        
           
       
    }
    
    public static void main(String[] args)throws IOException{
        Testing test = new Testing();
        test.Test();
    }
}