import java.util.Scanner;

public class TinhTongCacSoLE {
    public static void main(String[] args) {
        int sum=0;
        int n;
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("Nhap n: ");
            n= scanner.nextInt();
        }while (n<0);

        for (int i=0;i<=n;i++){
            sum += (2*i+1);
        }
        System.out.println(sum);
    }
}
