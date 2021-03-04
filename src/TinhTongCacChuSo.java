import java.util.Scanner;

public class TinhTongCacChuSo {
    public static void main(String[] args) {
        int number,soDU=0,tong=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so:");
        number = scanner.nextInt();

        while (number>0){
            soDU = number%10;
            number=number/10;
            tong+=soDU;
        }
        System.out.println(tong);
    }
}
