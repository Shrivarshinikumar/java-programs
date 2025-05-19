import java.util.Scanner;
public class mark {
    public static void main(String args[]){
         Scanner shri = new Scanner(System.in);
    int mark = shri.nextInt();

    if(mark>35){
        System.out.print("pass");
    }
    else{
        System.out.print("fail");
    }
    shri.close();
    }
   

    
}
