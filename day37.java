import java.util.Scanner;
public class day37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) System.out.println("Angkanya positif");
        else if (n < 0) System.out.println("Angkanya negatif");
        else System.out.println("Angkanya nol");
    }
}
