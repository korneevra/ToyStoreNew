import java.util.ArrayList;

public class ToysCollection {

    ArrayList<Toy> toys;

    public ToysCollection() {
        this.toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void rmToy(Toy toy) {
        toys.remove(toy);
    }

//    @Override
//    public String toString() {
//        return Toys.toString() ;
//    }

    @Override
    public String toString() {
        String res = "";
        for (Toy o: toys) {
            res = res + o + "%\n";
        }
        return res ;
    }

}
