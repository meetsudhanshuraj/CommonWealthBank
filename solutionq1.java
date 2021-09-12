import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
             {

        FileWriter writer = null;
        File file = new File("q3.test_data");
        Scanner scan = new Scanner(file);
        File file2 = new File("/CSV.csv");
        file.createNewFile();
        writer = new FileWriter(file2);

        while (scan.hasNext()) {
            String csv = scan.nextLine().replace("|", ",");
            System.out.println(csv);
            writer.append(csv);
            writer.append("\n");
            writer.flush();
        }
    }
}
