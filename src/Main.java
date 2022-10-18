import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command("firefox");
        Process proceso [] = new Process[5];

        try{
            for (int i = 0; i < 5; i++) {
                proceso[i] = pb.start();
            }

            for (int i = 0; i < 5; i++) {
                proceso[i].waitFor();
            }
        }catch (IOException | InterruptedException e){
            System.out.println("no funciona");
        }

    }
}