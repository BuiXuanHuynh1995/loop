import java.util.Scanner;

public class DemSo {
    public static void main(String[] args) {
        int number,count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so: ");
        number=scanner.nextInt();
        while (number>0){
            number/=10;
            count++;
        }
        System.out.println(count);
    }
}
