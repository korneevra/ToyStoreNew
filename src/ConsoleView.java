import java.util.Scanner;

public class ConsoleView {

    Scanner scanner;

    public ConsoleView() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.next();
    }

    public void printString(String s) {
        System.out.print(s);
    }
}
