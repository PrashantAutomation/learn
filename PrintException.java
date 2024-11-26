import java.io.BufferedReader;
import java.io.FileReader;

public class PrintException {
    public static void main(String[] args)
            // Print all the lines which has exception keyword in it
    {
        String path = "a.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while((line = reader.readLine()) != null )
            {
                if(line.toLowerCase().contains("exception")) {
                    System.out.println(line);
                }
            }
        }
        catch (Exception e)
        {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
