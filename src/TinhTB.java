import java.util.Scanner;

public class TinhTB {
    public static void main(String[] args) {
        int n,number;
        float sum =0;
        float tb=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so: ");
        n= scanner.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Nhap so thu "+i+" la: ");
            number=scanner.nextInt();
            sum+=number;
            tb=sum/n;
        }
        System.out.println(tb);
    }
}
