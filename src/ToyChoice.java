public class ToyChoice {

    public static Boolean turn(int id, ToysCollection toys, ToysCollection prizeToys) {
        if(toys.trying(id)) {
            prizeToys.addToy(toys.getToy(id));
            toys.remove(id);
            return true;
        } else {
            return false;
        }

    }

}
