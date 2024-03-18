import java.io.File;

public class FileHandelling {
    public static void main(String[] args){

        // File: An abstract representation of file and directory pathnames

        File file = new File("secret_message.txt");

        if(file.exists()){
            System.out.println("The File Exists :0");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
        }
        else{
            System.out.println("The File does'nt Exists :(");
        }

    }
}
