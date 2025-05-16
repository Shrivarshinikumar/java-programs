import java.util.Scanner;
public class positive {
    public static void main(String args[]){
        Scanner shri = new Scanner(System.in);
        System.out.print("enter the value ");
        
        int num = shri.nextInt();

        if(num>0){
            System.out.print("positive");

        }
        else if(num<0){
            System.out.print("negative");

        }
        else{
            System.out.print("zero");
        }
;    }
    
}
