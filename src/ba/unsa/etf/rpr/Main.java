package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    private static int sumaCifara(int x){
        int suma = 0;
        while (x > 0) {
            suma = suma + (x % 10);
            x = x / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.print("Unesite broj: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        System.out.println("Svi brojevi izmedju 1 i " + n + " koji su djeljivi sa sumom svojih cifara su: ");
        for(int i = 2; i < n; i++){
            if(i%sumaCifara(i) == 0) System.out.print(i + " ");
        }
    }
}
