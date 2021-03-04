import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        int n,temp =1;
        int giaiThua = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so: ");
        n = scanner.nextInt();

        while (n<=0){
            System.out.println("Moi nhap so lon hon 0");
            System.out.println("Moi nhap so: ");
            n = scanner.nextInt();
        }

        while (temp<=n){
            giaiThua*=temp;
            temp++;
        }
        System.out.println(giaiThua);
    }
}
