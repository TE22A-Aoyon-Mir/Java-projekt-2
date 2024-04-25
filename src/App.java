import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        start();
    }

    static void start() {

        Scanner tangentbord = new Scanner(System.in);

        while (true) {
            System.out.println(
                "Hej! \n\nVälkommen till buss bokningssystem \n\n1. Boka \n2. Lediga platser \n3. Vinst \n4. Avsluta \n\nAnge ditt val: ");
            int val = 0;

            try {
                val = tangentbord.nextInt();
            } catch (Exception e) {
                System.out.println("\nOBS! Ange ditt val i siffror.\n");
                tangentbord.nextLine();
                continue;
            }

            switch (val) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("\nBokningssystemet avslutas\n");
                    tangentbord.close();
                    System.exit(0);
                default:
                    System.out.println("\nOBS! Ange ditt val mellan 1-4.\n");
            }
        }
    }
}