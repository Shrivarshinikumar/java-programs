import java.util.Scanner;
public class div {
    public static void main(String args[]){
        Scanner shri = new Scanner(System.in);
        
        System.out.print("enter the number");
        int num = shri.nextInt();

        if(num%2==0 && num%3==0){
            System.out.print("divisible by 2 and 3");


        }
        else{
            System.out.print("not divisible");
        }

        shri.close();


    }
    
}
