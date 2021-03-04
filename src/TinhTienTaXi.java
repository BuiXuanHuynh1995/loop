import java.util.Scanner;

public class TinhTienTaXi {
    public static void main(String[] args) {
        float km;
        Scanner scanner = new Scanner(System.in);
        long money=0;
        final int START_TO_08KM = 14000;
        final int NEXT_TO_25KM = 16300;
        final int FROM_26KM = 13300;
        System.out.println("Nhap so km: ");
        km = scanner.nextFloat();
        while (km<=0){
            System.out.println("Phai lon hon 0");
            System.out.println("Nhap so km: ");
            km = scanner.nextFloat();
        }

        if (km<=0.8){
            money=14000;
        }else if (km<25){
            money = (long) (START_TO_08KM+NEXT_TO_25KM*(km-0.8));
        }else {
            money = (long) (START_TO_08KM + NEXT_TO_25KM* (25 - 0.8) + FROM_26KM * (km - 25 - 0.8));
        }
        System.out.println(money);
    }
}
