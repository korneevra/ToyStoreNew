public class GetPrize {

    public static void getPrize(ToysCollection prizeToys) {
        System.out.println("Prize Your: " + prizeToys.getToyIndex(0));
        prizeToys.removeIndex(0);
    }
}
