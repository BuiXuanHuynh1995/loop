import java.util.Scanner;

public class GiaTriBT {
    public static void main(String[] args) {
        int rs =0;
        int n;
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("Nhap n:");
            n=scanner.nextInt();
        }while (n<0);

        for (int i=1;i<=n;i++){
            if (i%2==0){
                rs-=i;
            }else {
                rs+=i;
            }
        }
        System.out.println(rs);
    }
}
