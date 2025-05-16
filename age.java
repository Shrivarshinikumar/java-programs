import java.util.Scanner;


class age{
    public static void main(String args[]){
        Scanner shri = new Scanner(System.in);
        String name = shri.nextLine();
        int age = shri.nextInt();
        shri.close();

        if(age>=18){
            System.out.print("eligible");
    
        }

        else{
            System.out.print("not eligible");
        }



    }
}
