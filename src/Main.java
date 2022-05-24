/*Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıda ki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double height, weight, formula;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = inp.nextDouble();

        formula = weight / (height * height);
        System.out.print("Vücut Kitle İndeksiniz : " + formula);

    }
}
