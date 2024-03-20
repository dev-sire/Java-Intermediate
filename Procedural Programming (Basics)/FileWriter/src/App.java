import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        // FileReader: Reads the contents of a file as a stream of characters.
        //             On by On read() returns an int value that returns a byte value
        //             when read() returns -1, there is no more data to be read

        try{
            FileWriter writer = new FileWriter("poem.txt");
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            writer.write("Roses are Red \nViolets are Blue\nUnknown Exception\nOn line 32");
            writer.append("\n (A poem by Aman)");
            writer.close();
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
