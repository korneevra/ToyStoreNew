public class GetPrize {

    public static void getPrize(ToysCollection prizeToys) {
        if (prizeToys.length() == 0) {
            System.out.println("Not toys in basket!");
        } else {
            Toy toy = prizeToys.getToyByIndex(0);
            String name = toy.getName();
            System.out.println("Prize Your: " + name);
            PrizeToFile.save(name);
            prizeToys.removeIndex(0);
        }
    }
}
