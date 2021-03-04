import java.util.Scanner;

public class TinhGiaTriBieuThuc {
    public static void main(String[] args) {
        int n;
        int rs=1;
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("nhap n:");
            n=scanner.nextInt();
        }while (n<0);

        for (int i=0;i<=n;i++){
            rs*=(2*i+1);
        }
        System.out.println(rs);
    }
}
