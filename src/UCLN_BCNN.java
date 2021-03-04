import java.util.Scanner;

public class UCLN_BCNN {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số thứ nhất: ");
        number1 = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        number2 = scanner.nextInt();
        while (number1<=0 ||number2<=0){
            System.out.println("Moi nhap lai:");
            System.out.println("Nhập vào số thứ nhất: ");
            number1 = scanner.nextInt();
            System.out.println("Nhập vào số thứ hai: ");
            number2 = scanner.nextInt();
        }

        int num1 = number1;
        int num2= number2;
        while (num1!=num2){
            if (num1>num2){
                num1-=num2;
            }else {
                num2-=num1;
            }
        }
        System.out.println("UCLL: "+num1);
        System.out.println("BCNN: "+(number1*number2)/num1);
    }
}
