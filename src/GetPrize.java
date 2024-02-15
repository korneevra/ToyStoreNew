public class GetPrize {

    public static void getPrize(ToysCollection prizeToys) {
        if (prizeToys.length() == 0) {
            System.out.println("Not toys in basket!");
        } else {
            Toy toy = prizeToys.getToyByIndex(0);
            PrizeToFile.save(toy.getName());
            prizeToys.removeIndex(0);
        }
    }
}
