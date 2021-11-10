import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler
{

    public static File fileCreation()
            throws IOException
    {
        try {
            File fileObject = new File("persons.txt");
            if (fileObject.createNewFile()) {
                System.out.println("File Created: " + fileObject.getName());
            } else {
                System.out.println("File already exists");
            }
            Scanner scan = new Scanner(fileObject);

            System.out.println(fileObject.canRead());
        } catch (IOException var1) {
            System.out.println("An error occured");
        }



        return new File("persons.txt");
    }

    public void test()
    {
        System.out.println("Hello world");
    }


}
