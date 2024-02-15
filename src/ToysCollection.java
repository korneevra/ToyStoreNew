import java.util.ArrayList;

public class ToysCollection {

    ArrayList<Toy> toys;

    public ToysCollection() {
        this.toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public Toy getToy(int id) {
        for (Toy o: toys) {
            if(o.getId() == id) {
                return o;
            }
        }
        return null;
    }

    public Toy getToyIndex(int i) {
        return toys.get(i);
    }

    public void removeIndex(int i) {
        toys.remove(i);
    }

    public void remove(int id) {
        int count = 0;
        for (Toy o: toys) {
            int t = o.getId();
            if(o.getId() == id) {
                int quantity = o.getQuantity();
                if (quantity > 1) {
                    o.setQuantity(quantity - 1);
                } else {
                    toys.remove(count);
                }
                break;
            }
            count++;
        }
    }

    public boolean trying(int id) {
        for (Toy o: toys) {
            if(o.getId() == id) {
                int weight = o.weight;
                if (weight == 100) return true;
                if (weight == 0) return false;
                if(RndGen.number() > weight) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
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
