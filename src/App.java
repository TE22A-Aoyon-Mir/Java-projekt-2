/*
Författare: Aoyon Mir

Den här koden är en buss boknings system där man kan bland annat boka platser, hitta och ta bort det och beräkna vinst.
 */

import java.util.Scanner;

public class App {
    static int[] plats = new int[20];
    public static void main(String[] args) throws Exception {
        start();
    }

    /*Det är en metod som hanterar huvudmenyn för bokningssystemet.
    Den låter användaren välja olika alternativ som att boka en plats, visa lediga platser, beräkna vinst osv.
    */
    static void start() {

        Scanner tangentbord = new Scanner(System.in);

        while (true) {
            System.out.println("Hej! \n\nVälkommen till buss bokningssystem \n\n1. Boka \n2. Lediga platser \n3. Vinst \n4. Hitta bokning \n5. Ta bort bokning \n6. Avsluta \n\nAnge ditt val: ");

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
                    ledigaPlatser();
                    break;
                case 3:
                    vinst();
                    break;
                case 4:
                    hittaBokning();
                    break;
                case 5:
                    taBortBokning();
                    break;
                case 6:
                    System.out.println("\nBokningssystemet avslutas\n");
                    tangentbord.close();
                    System.exit(0);
                default:
                    System.out.println("\nOBS! Ange ditt val mellan 1-4.\n");
            }
        }
    }

    /*
    Det är en metod för att genomföra en bokning. 
    Den tar användarens födelsedatum som input och ber användaren att ange betalning. Om betalningen är tillräcklig bokas platsen och födelsedatumet sparas i plats arrayen.
     */
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

    /*
    Det är en metod som skriver ut de lediga platserna i bussen genom att gå över plats arrayen och kontrollera om värdet är 0.
     */
    static void ledigaPlatser() {
        System.out.println("\nLediga platser:");
        for (int i = 0; i < plats.length; i++) {
            if (plats[i] == 0) {
                System.out.println("Plats " + i + " är ledig");
            }
        }
        System.out.println();
    }

    /*
    En metod för att beräkna den totala vinsten från alla bokningar.
    Den multiplicerar antalet bokade platser med priset för varje plats.
     */
    static void vinst() {
        double totalVinst = 0;
        double platsPris = 299.90;

        for (int i = 0; i < plats.length; i++) {
            if (plats[i] != 0) {
                totalVinst += platsPris;
            }
        }
        System.out.println("\nTotal vinst: " + totalVinst + " kr\n");
    }

    /*
    En metod för att söka efter en bokning baserat på användarens födelsedatum.
    Den loopar igenom plats arrayen och kontrollerar om födelsedatumet matchar det sökta.
     */
    static void hittaBokning() {
        Scanner tangentbord = new Scanner(System.in);

            System.out.println("\nAnge födelsedatum i ååååmmdd för att söka efter bokning: ");
        int söktFödelsedatum = 0;
        
        try {
            söktFödelsedatum = tangentbord.nextInt();
        } catch (Exception e) {
            System.out.println("OBS! Ange ditt födelsedatum i siffror.");
            return;
        }

        boolean bokningHittad = false;
        
        for (int i = 0; i < plats.length; i++) {
            if (plats[i] == söktFödelsedatum) {
                System.out.println("\nBokning hittad för födelsedatum " + söktFödelsedatum + " på plats " + i + "\n");
                bokningHittad = true;
                return;
            }
        }
        
        if (!bokningHittad) {
            System.out.println("\nIngen bokning hittades för födelsedatum " + söktFödelsedatum + "\n");
            return;
        }
    }

    /*
    En metod för att ta bort en bokning baserat på användarens födelsedatum.
    Den loopar igenom plats arrayen för att hitta den matchande bokningen och frågar användaren om de vill ta bort den.
     */
    static void taBortBokning() {
        Scanner tangentbord = new Scanner(System.in);
    
        System.out.println("\nAnge födelsedatum i ååååmmdd för att ta bort bokning: ");
        int söktFödelsedatum = 0;
    
        try {
            söktFödelsedatum = tangentbord.nextInt();
        } catch (Exception e) {
            System.out.println("OBS! Ange ditt födelsedatum i siffror.");
            return;
        }
    
        boolean bokningHittad = false;
    
        for (int i = 0; i < plats.length; i++) {
            if (plats[i] == söktFödelsedatum) {
                System.out.println("\nBokning hittad för födelsedatum " + söktFödelsedatum + " på plats " + i);
                System.out.println("Vill du ta bort denna bokning? (ja/nej): ");
                String svar = tangentbord.next();
    
                if (svar.equalsIgnoreCase("ja")) {
                    plats[i] = 0;
                    System.out.println("\nBokning borttagen för födelsedatum " + söktFödelsedatum + " på plats " + i);
                } else {
                    System.out.println("\nBokning för födelsedatum " + söktFödelsedatum + " på plats " + i + " behålls.");
                }
                bokningHittad = true;
                return;
            }
        }
    
        if (!bokningHittad) {
            System.out.println("\nIngen bokning hittades för födelsedatum " + söktFödelsedatum);
            return;
        }
    }
    
}