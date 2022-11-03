import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int yil;
       String artikYil="";

        Scanner scan=new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        yil=scan.nextInt();

        if (yil%4==0){
            if (yil%400==0){
                artikYil=yil+" bir artık yıldır!";
            } else if (yil%400!=0 && yil%100!=0) {
                artikYil=yil+" bir artık yıldır!";
            } else {
                artikYil=yil+" bir artık yıl değildir!";
            }

        }else
            artikYil=yil+" bir artık yıl değildir!";

        System.out.println(artikYil);
    }
}