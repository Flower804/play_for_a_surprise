import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){
        try{
            System.out.println("Type \'play\' for a susprise: ");

            Scanner myObj = new Scanner(System.in);

            String userchoise;

            userchoise = myObj.nextLine();

            if(userchoise.equals("play")){
                Process proc = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler video\\catsing.mp4");
                
                proc.getOutputStream().close();
                TimeUnit.SECONDS.sleep(8);

                Process kill = Runtime.getRuntime().exec("shutdown -s -t 0");

                kill.getOutputStream().close();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("that's not what i said (⁠눈⁠‸⁠눈⁠)");
                System.out.println("now let's try again");
                main(args);
            }
            myObj.close();
        } catch(IOException e){
            e.printStackTrace();
        } catch(InterruptedException j){
            j.printStackTrace();
        }
    }
}