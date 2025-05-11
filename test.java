import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner shri = new Scanner(System.in);
        String name = shri.nextLine();
        Double mark = shri.nextDouble();
        shri.nextLine();
        String dept = shri.nextLine();

        System.out.println("the name is"+name);
        System.out.println("the mark is"+mark/10+"/10");
        System.out.print("the dept is"+ dept);

    }
}



    