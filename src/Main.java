import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcessBuilder pb = new ProcessBuilder();
        pb.command("firefox");

        Process proceso [] = new Process[sc.nextInt()];

        try{
            for (int i = 0; i < proceso.length; i++) {
                proceso[i] = pb.start();
            }

            for (int i = 0; i < proceso.length; i++) {
                proceso[i].waitFor();
            }
        }catch (IOException | InterruptedException e){
            System.out.println("no funciona");
        }

    }
}