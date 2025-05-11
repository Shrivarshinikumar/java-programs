import java.util.Scanner;
class input{
    public static void main(String args[]){
        Scanner shri = new Scanner(System.in);
        System.out.print("enter your name");
        String name = shri.nextLine();
        System.out.print("enter your age");
        int age = shri.nextInt();
        shri.nextLine();
        System.out.print("enter your address");
        String address = shri.nextLine();

        System.out.println("the name is "+ name);
        System.out.println("the age is "+ age);
        System.out.print("the addressis "+ address);

    }
}