import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        }

    static void meny(){

        Scanner tangentbord = new Scanner(System.in);
        
        while (true) {
            System.out.println("Hej! \n\nVälkommen till buss bokningssystem \n\n1. Boka \n2. Lediga platser \n3. Vinst \n4. Avsluta \n\nAnge ditt val: ");
            int val = tangentbord.nextInt();

            if(val==1){

            }
            else if(val==2){
                System.out.println("\nHär är lediga platserna: ");
                break;
            }
            else if(val==3){

            }
            else if(val==4){
            System.out.println("Bokningssystemet avslutas");
            continue;
            }
            else{
            System.out.println("Obs ange ditt val mellan 1-4");
            }

            //checka
            try{
            val = tangentbord.nextInt();
            } catch (Exception e) {
            System.out.println("Obs ange ditt val i siffror");
            }
        }
    }
}
