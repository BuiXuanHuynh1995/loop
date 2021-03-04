import java.util.Scanner;

public class CheckLogin {
    public static void main(String[] args) {
        String user = "user";
        String password ="password";
        String guesUser;
        String guesPass;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Nhap tai khoan: ");
            guesUser=scanner.nextLine();
            System.out.println("Nhap mat khau: ");
            guesPass=scanner.nextLine();
        }while ((!guesUser.equals(user)) || (!guesPass.equals(guesPass)));
        System.out.println("Hello "+user);
    }
}
