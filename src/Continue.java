import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
//        for (int i=1;i<20;i++){
//            if (i%5!=0){
//                continue;
//            }
//            System.out.println(i);
//        }
        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap so: ");
            number = scanner.nextInt();
            sum += number;
            if (sum>100){
                break;
            }
        } while (number>0);
        System.out.println(sum);
    }
}
