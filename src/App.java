
/*
* File: App.java
* Author: Szivák Gergő
* Copyright: 2021, Szivák Gergő
* Group: Szoft II N
* Date: 2021-11-29.
* Github: https://github.com/Gergosz-2000/kalori
* Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Leírás: kiszámolja egy ember napi kalória szükségletét\nNév: Szivák Gergő\nDátum: 2021.11.29. ");
        Calcer calcer = new Calcer();
        calcer.getData();
        System.out.println("Női: "+calcer.calcWomanBMR());
        System.out.println("Férfi: "+calcer.calcManBMR());
    }
}
