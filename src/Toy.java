public class Toy {

    private static int idToy;
    private int id;
    String name;
    int quantity;
    int weight;

    public Toy (String name, int quantity, int weight) {
        this.id = ++idToy;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return id + ". Toy " +
                name + ", quantity=" + quantity +
                ", weight=" + weight;
    }
}
