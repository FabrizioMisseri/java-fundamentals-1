package org.lessons.java;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TrainTicket {
    public static void main(String[] args) {
        double basePrice = 0.21;
        double discount20 = 0.8;
        double discount40 = 0.6;

        Scanner scan = new Scanner(System.in);
        String d = "#.##";
        DecimalFormat decimalFormat = new DecimalFormat(d);

        //System.out.print("Number of linux users: ");
        //linuxUsers = Integer.parseInt(scan.nextLine());
        System.out.println("inserisci numero km da percorrere?");
        double km = Integer.parseInt(scan.nextLine());
        //System.out.println(km);
        System.out.println("inserisci età del passeggero?");
        double eta = Integer.parseInt(scan.nextLine());

        double totPrice = basePrice * km;

        if (eta < 18){
            totPrice = totPrice * discount20;
        } else if (eta > 65) {
            totPrice = totPrice * discount40;
        }

        // OUTPUT
        System.out.println("Il prezzo del tuo biglietto è " + decimalFormat.format(totPrice) + "euro");
    }
}

