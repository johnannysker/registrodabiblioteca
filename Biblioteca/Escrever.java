package entidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Escrever {
    private Scanner escrever;

    public Escrever() {
        escrever = new Scanner(System.in);
    }

    public String dtext(String mensagem) {
        System.out.println(mensagem);
        String texto = escrever.nextLine();
        return texto;
    }

    public int dnum(String mensagem) {
        int num = 0;
        while (true) {
            System.out.println(mensagem);
            try {
                num = Integer.parseInt(escrever.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Digite um numero válido !");
            }
        }
        return num;
    }

    public double dflut(String mensagem) {
        double flut = 0;
        while (true) {
            System.out.println(mensagem);
            try {
                flut = Double.parseDouble(escrever.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Digite um numero valido!");
            }
        }
        return flut;
    }


}