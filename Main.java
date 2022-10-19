import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz :");
        int sayi = input.nextInt();
        int toplam=0;
        for (int i=1; i<(sayi/2); i++) {
            if (sayi % i==0){
                toplam+=i;
            }

        }
        if (toplam==sayi){
            System.out.print(sayi + " Mükemmel sayıdır.");
        }else {
            System.out.print(sayi + " Mükemmel sayı değildir.");
        }
    }
}