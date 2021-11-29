/*
* File: Input.java
* Author: Szivák Gergő
* Copyright: 2021, Szivák Gergő
* Group: Szoft II N
* Date: 2021-11-29.
* Github: https://github.com/Gergosz-2000/kalori
* Licenc: GNU GPL
*/

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
