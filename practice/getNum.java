import java.util.Scanner;

public class getNum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String y = in.nextLine();
        int x = 0;
        while(x <= 5){
            System.out.println("Enter a number (exit to quit): " + num);
            x++;
        }
    }
}