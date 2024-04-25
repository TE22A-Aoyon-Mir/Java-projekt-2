import java.util.Scanner;

public class App {
    static int[] plats = new int[20];
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
                    boka();
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

    static void boka() {
        Scanner tangentbord = new Scanner(System.in);

        while (true) {
            System.out.println("\nAnge ditt födelsedatum i ååååmmdd: ");
            int födelsedatum = 0;

            try {
                födelsedatum = tangentbord.nextInt();
            } catch (Exception e) {
                System.out.println("\nOBS! Ange ditt födelsedatum i siffror.");
                tangentbord.nextLine();
                continue;
            }

            double pris = 299.90;
            System.out.println("\nBokning för en plats kostar " + pris + " kr. Ange betalningen: ");
            
            while (true) {
                double betalning = 0;

                try {
                    betalning = tangentbord.nextDouble();
                } catch (Exception e) {
                    System.out.println("OBS! Ange betalningen i siffror.");
                    tangentbord.nextLine();
                    continue;
                }
            
                if (betalning < pris) {
                    System.out.println("Ogiltig betalning. Du måste betala minst " + pris + " kr.");
                    continue;
                } else {
                    System.out.println("\nBetalning godkänd.");
                    break;
                }
            }

            System.out.println("\nHär är din plats: ");

            for (int i = 0; i < plats.length; i++) {
                if (plats[i] == 0) {
                    System.out.println("\nPlats " + i + " bokad för dig med födelsedatum " + födelsedatum + "\n");
                    plats[i] = födelsedatum;
                    return;
                }
            }
        }
    }
}