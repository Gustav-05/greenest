import java.util.Scanner;

class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMeny();

            String user = scanner.nextLine().trim();
            Plant[] plantNames = getPlant();

            if (showPlant(plantNames, user)) {
                break;
            }
        }
    }

    public static void showMeny() {

        System.out.println("Vilken växt ska få vätska?");
        System.out.println("--------------------------");
        System.out.println("Kaktusen Igge");
        System.out.println("Palmen Laura");
        System.out.println("Köttätande växten Meatloaf");
        System.out.println("Palmen Olof");
        System.out.println("--------------------------");
    }



    public static Plant[] getPlant() {

        // Polymorfism: plantNames är en Plant, men varje objekt kan vara exempelvis en Palm, eller Cactus
        Plant[] plantNames = {
                new Palm(Constants.LAURA_NAME, Constants.LAURA_HEIGHT),
                new Cactus(Constants.IGGE_NAME, Constants.IGGE_HEIGHT),
                new Carnivorous(Constants.MEATLOAF_NAME, Constants.MEATLOAF_HEIGHT),
                new Palm(Constants.OLOF_NAME, Constants.OLOF_HEIGHT)
        };

        return plantNames;

    }


    public static boolean showPlant(Plant[] plantNames, String user) {

        boolean found = false;

        //Polymorfism: varje växt använder sin egen implementation av printLiquid()
        for (Plant plant : plantNames) {

            if (user.equalsIgnoreCase(plant.getName())) {

                found = true;

                System.out.println("Växt: " + plant.getName());
                System.out.println("Höjd: " + plant.getHeight() + " meter");
                System.out.println("Vätska: " + plant.getLiquid());
                System.out.println(plant.printLiquid());
            }

        }

        if (!found) {
            System.out.println("Du skrev inte något av namnen");
        }

        return found;
    }
}