package Exceptions;

public class AcimaDeCemException extends Exception {

    public AcimaDeCemException(int soma) {
        super("Sua soma passou de 100: " + soma);
    }
}