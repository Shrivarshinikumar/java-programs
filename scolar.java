import java.util.Scanner;
public class scolar {
    public static void main(String args[]){
         Scanner shri = new Scanner(System.in);
         int income = shri.nextInt();



        if(income>=7000){
        System.out.print("scolarship");
    }
        else{
        System.out.print("no scolarship");
    }
    shri.close();
    }
   

    
}

