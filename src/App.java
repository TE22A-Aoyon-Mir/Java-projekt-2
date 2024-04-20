import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    static void meny(){

        Scanner tangentbord = new Scanner(System.in);
        
        while (true) {
            System.out.println("Hej! \n\nVälkommen till buss bokningssystem \n\n1. Boka \n2. Lediga platser \n3. Vinst \n4. Avsluta \n\nAnge ditt val: ");
            int val = 0;

            try{
                val = tangentbord.nextInt();
                tangentbord.nextLine();
                } catch (Exception e) {
                    tangentbord.nextLine();
                System.out.print("\nObs ange ditt val i siffror + ");
                }
                
            if(val==1){
                break;
            }
            else if(val==2){

            }
            else if(val==3){

            }
            else if(val==4){
                System.out.println("\nBokningssystemet avslutas\n");
                System.exit(0);
            }
            else{
            System.out.println("\nObs ange ditt val mellan 1-4\n");
            }
        }
    }
}
