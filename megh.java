import java.util.Scanner;
public class megh {
    public static void main(String args[]){
        Scanner shri = new Scanner(System.in);
        String megh = shri.nextLine();

        if(megh.equals("dead")){
            System.out.print("surya meets ramya");

        }
        else{
            System.out.print("surys weds meghna");
        }
        shri.close();
    }

    
}
