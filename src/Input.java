// Szivák Gergő
// 2021.11.29.
// SZOFTIIN
// https://github.com/Gergosz-2000/kalori

import java.util.Scanner;
public class Input {
    static Scanner scanner;
    public static double input(String message){
        scanner = new Scanner(System.in);
        System.out.print(message+": ");
        double num = scanner.nextDouble();
        return num;
    }
}
