import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        showMeny();
        try{
            String user = scanner.nextLine();
            Plant[] plantNames = getPlant();

            showPlant(plantNames, user);

        } catch (Exception e) {
            System.out.println("Du skrev inte in något av namnen");
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

        Plant[] plantNames = {
                new Palm("Laura", 5.0),
                new Cactus("Igge", 20),
                new Carnivorous("Meatloaf", 0.7),
                new Palm("Olof", 1.0)
        };

        return plantNames;

    }


    public static void showPlant(Plant[] plantNames, String user) {
        for (int i = 0; i < plantNames.length; i += 1) {

            if (user.equals(plantNames[i].getName())) {
                System.out.println("Växt: " + plantNames[i].getName());
                System.out.println("Höjd: " + plantNames[i].getHeight() + " meter");
                System.out.println("Vätska: " + plantNames[i].getLiquid());
                plantNames[i].printLiquid();
            }

        }

    }
}