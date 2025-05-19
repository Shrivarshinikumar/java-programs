import java.util.Scanner;
public class emc {
    public static void main(String args[]){
        Scanner shri = new Scanner(System.in);
        String input = shri.nextLine();

        if(input.equals("win")){
            System.out.print("E sala cup namde");
        

        }
        else if(input.equals("lose")){
            System.out.print("cup illa");


        }
        else{
            System.out.print("invalid");
        }
        shri.close();

        }
    }
    

