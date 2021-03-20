package AsteroidMining;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Testing{
    private static String tab="";
    static void methodStart(String m )
    {
        System.out.println(tab+m+" started");
        tab=tab+" ";
    }
    static void methodEnd(String m)
    {
        System.out.println(tab+m+" ended");
        tab=tab.substring(0,tab.length()-2);
    }
    static void StartGame(){

    }
    static void EndGame(){

    }
    public static void main(String[] args)throws IOException{
    String enter;
    System.out.println("Please chose the test case:");
    System.out.println("1:StartGame");
    System.out.println("2:MultiPlayer");
    System.out.println("3:SinglePlayer");
    System.out.println("4:SetPosition");
    BufferedReader br = new BufferedReader(new 
    InputStreamReader(System.in));
    enter = br.readLine();

    if(enter=="1")
    {
        StartGame();
    }
    else 
        EndGame();
    }
}