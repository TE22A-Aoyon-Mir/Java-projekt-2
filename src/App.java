import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    static void meny(){

        Scanner tangentbord = new Scanner(System.in);

        int val = tangentbord.nextInt();
        System.out.println("Hej! \n\nVälkommen till buss bokningssystem \n\n1. Boka \n2. Lediga platser \n3. Vinst \n4. Avsluta \n\nAnge ditt val: ");
        
        if(val==1){
            
        }
        else if(val==2){

        }
        else if(val==3){

        }
        else if(val==4){

        }
        else{
            System.out.println("Ange ditt val mellan 1-4");
        }

        try{
            val = tangentbord.nextInt();
        } catch (Exception e) {
            System.out.println("Ange ditt val i siffror");
        }
    }
}
