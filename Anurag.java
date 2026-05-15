import java.util.Scanner;
public class Anurag {
    public static void main(String[] args){
        Scanner  sc=new Scanner(System.in);
//        int num= sc.nextInt();
//        if(num>50&&num%2==0){
//            System.out.println("Special number");
//        }else {
//            System.out.println("normal number");
//        }
//     String username=sc.nextLine();
//     String password= sc.nextLine();
//     if(username.equals("admin")&&password.equals("1234")){
//         System.out.println("login succesful");
//     }else{
//         System.out.println("login failed");
//
//     }
    int marks=sc.nextInt();
    if (marks>75){
        System.out.println("Distinction");
    } else if (marks>33) {
        System.out.println("pass");

    }else {
        System.out.println("fail");
    }

    }
}
