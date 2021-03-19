public class Game{
    int enter;
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new 
       InputStreamReader(System.in));
       System.out.println("Please enter the number :");
       System.out.println("1 is StartGame");
       System.out.println("2 is EndGame");
       enter = br.readLine();
       if(enter=1)
       {
           StartGame();
       }
       else 
            EndGame();

    }
    public StartGame()
    {
        
    }
}
