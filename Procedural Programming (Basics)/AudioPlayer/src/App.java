import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class App {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        String response = "";

        File file = new File("Vibe Tracks - You Like It (Calm).wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        while(!response.equals("Q")){
            System.out.println("***** P = Play, S = Stop, R = Reset, Q - Quit *****");
            System.out.print("Enter Your Choice: ");
            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case "P":
                    clip.start();
                    break;
                case "S":
                    clip.stop();
                    break;
                case "R":
                    clip.setMicrosecondPosition(0);
                    break;
                case "Q":
                    clip.close();
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Not a valid response");
                    break;
            }
        }
        scanner.close();
    }
}