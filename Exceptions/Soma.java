package Exceptions;

import java.util.Scanner;

public class Soma {
    public static Boolean underHundred(int x) {
        return x <= 100;
    }

    public static void main(String[] args) throws AcimaDeCemException {
        Scanner in = new Scanner(System.in);
        int sum = 0, i = 0, aux;
        while (underHundred(sum)) {
            System.out.println("Informe um número para ser usado na soma:");
            aux = in.nextInt();
            sum += aux;
            i++;
            System.out.println("O valor da soma é: " + aux);
            System.out.println("A quantidade de números alocados é: " + i);
            System.out.println("A média dos números é: " + (sum / i));
        }
        if (!underHundred(sum)) {
            throw new AcimaDeCemException(sum);
        }
    }
}