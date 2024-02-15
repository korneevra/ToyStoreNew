import java.io.FileWriter;
import java.io.IOException;

public class PrizeToFile {

    public static void save(String name) {

        try (FileWriter fileWriter = new FileWriter("prizes.txt", true)) {

            fileWriter.write(name + '\n');
            fileWriter.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
