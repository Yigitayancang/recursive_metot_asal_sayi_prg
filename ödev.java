import java.util.Scanner;
public class ödev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();
        if (sayi <= 1) {
            System.out.println(sayi + " asal bir sayı değildir.");
        } else {
            boolean asalMi = asalMi(sayi, 2);
            if (asalMi) {
                System.out.println(sayi + " asal bir sayıdır.");
            } else {
                System.out.println(sayi + " asal bir sayı değildir.");
            }
        }
    }
    static boolean asalMi(int sayi, int bölen) {
        if (bölen * bölen > sayi) {
            return true;
        }
        if (sayi % bölen == 0) {
            return false;
        }
        return asalMi(sayi, bölen + 1);
    }
}
