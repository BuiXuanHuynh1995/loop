import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
       for (;;){
           System.out.println("1. Nhập");
           System.out.println("2. Xem");
           System.out.println("3. Thoát");
           do{
               System.out.println("Bam de chon: ");
               choice=scanner.nextInt();
           }while (choice<1 || choice>3);

           switch (choice){
               case 1:
                   System.out.println("Bạn chọn chức năng nhập!");
                   break;
               case 2:
                   System.out.println("Bạn chọn chức năng xem!");
                   break;
               case 3:
                   System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                   System.exit(0); // thoát chương trình
                   break;
           }
       }
    }
}
