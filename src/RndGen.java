import java.util.Random;

public class RndGen {

    static Random random = new Random();

    public static int number() {
        return  random.nextInt(100);
    }

    public static int number(int num) {
        return  random.nextInt(num);
    }
}
