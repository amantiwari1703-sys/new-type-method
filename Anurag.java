import java.util.Scanner;
public class Anurag {
    public static void main(String[] args){
        Scanner  sc=new Scanner(System.in);
        int num= sc.nextInt();
        if(num>50&&num%2==0){
            System.out.println("Special number");
        }else {
            System.out.println("normal number");
        }

    }
}
