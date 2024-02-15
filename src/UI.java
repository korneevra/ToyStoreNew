public class UI {
    ConsoleView view;
    ToysCollection toys;
    ToysCollection prizeToys;
    PrizeToFile prizeToFile;
    String n = "\n-------------------------------------\n";


    public UI() {
        view = new ConsoleView();
        toys = new ToysCollection();
        prizeToys = new ToysCollection();
//        prizeToFile = new PrizeToFile();
    }

//    GetPrize.getPrize(prizeToys);
//    System.out.println(prizeToys);

    private void startMenu() {
        while (true) {
            view.printString(n + "1. Enter new Toy.\n" +
                    "2. Edit Toy weight.\n" +
                    "3. Game!\n" +
                    "4. Upload the result.\n" +
                    ":>_");
            switch (view.getString()) {
                case "1":
                    toys.addToy(enterToy());
                    continue;
                case "2":
                    view.printString(toys.toString());
                    view.printString("Enter number of the toy:>_");
                    int n = Integer.parseInt(view.getString());
                    if (toyNumControl(n, toys)) {
                        view.printString("Wrong number!");
                        continue;
                    }
                    view.printString("Enter weight (0...100):>_");
                    toys.getToy(n).weight = Integer.parseInt(view.getString());
                    view.printString(toys.getToy(n).toString());
                    continue;
                case "3":
                    return;
            }
        }
    }

    private Toy enterToy() {
        view.printString("Enter name:>_");
        String name = view.getString();
        view.printString("Enter quantity:>_");
        String quantity = view.getString();
        view.printString("Enter weight:>_");
        String weight = view.getString();
        return new Toy(name, Integer.parseInt(quantity), Integer.parseInt(weight));
    }

    public Boolean toyNumControl(int n, ToysCollection toys) {
        return n < 1 || n > toys.length();
    }

    private Toy toyChose() {
        view.printString(n);
        view.printString(toys.toString());
        view.printString(n + "Enter the number of the toy:>_");
        return toys.getToy(Integer.parseInt(view.getString()));
    }

    public void start() {
        toys.addToy(new Toy("BEER", 10,50));
        toys.addToy(new Toy("FLY", 5,75));
        toys.addToy(new Toy("TIGER", 10,50));
        toys.addToy(new Toy("BIRD", 1,25));

        startMenu();

        while (true) {
            view.printString(n);
            view.printString(toys.toString());
            view.printString("Enter the number of the toy you want to try to catch:>_");
            if (ToyChoice.turn(Integer.parseInt(view.getString()), toys, prizeToys)) {
                view.printString("You are Win! The Toy in the container.\n" + n +
                        prizeToys.toNames() + n +
                        "Want to try again? (y/n):>_");
                if (view.getString().equals("y")) {
                    continue;
                } else {
                    startMenu();
                }

            } else {
                view.printString(n + "You are Loose! Try again.\n" +
                        "Want to try again? (y/n):>_");
                if (view.getString().equals("y")) {
                    continue;
                } else {
                    startMenu();
                }
            }
        }
    }
}
