public class Program {

    public static void main(String[] args) {

        Toy toy1 = new Toy("TIGER", 10,50);
//        Toy toy2 = new Toy("FLY", 5,75);
//        System.out.println(toy1);
//        System.out.println(toy2);

        ToysCollection toys = new ToysCollection();
        ToysCollection prizeToys = new ToysCollection();

        toys.addToy(new Toy("BEER", 10,50));
        toys.addToy(new Toy("FLY", 5,75));
        toys.addToy(toy1);
        toys.addToy(new Toy("BIRD", 1,25));
//        toys.remove(3);
        System.out.println(toys);
        ToyChoice.turn(3, toys, prizeToys);
        System.out.println(toys);
        System.out.println(prizeToys);
        GetPrize.getPrize(prizeToys);
        System.out.println(prizeToys);



    }
}
