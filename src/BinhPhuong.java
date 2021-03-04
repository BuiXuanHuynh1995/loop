import java.util.Scanner;

public class BinhPhuong {
    public static void main(String[] args) {
        int n,i=0,sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
        n= scanner.nextInt();

        while (n<=0){
            System.out.println("Nhap so nguyen duong lon hon 0: ");
            System.out.println("Nhap so: ");
            n= scanner.nextInt();
        }

        while (i<=n){
            sum+=i*i;
            i++;
        }
        System.out.println(sum);
    }
}
