public class ToyChoice {

    public static void turn(int id, ToysCollection toys, ToysCollection prizeToys) {
        if(toys.trying(id)) {
            prizeToys.addToy(toys.getToy(id));
            toys.remove(id);
        } else {
            System.out.println("LOOS!!!");
        }

    }

}
