import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                Quadrado quadrado = new Quadrado();
                Quadrilatero quadrilatero = new Quadrilatero();
                Triangulo triangulo = new Triangulo();
                Circulo circulo = new Circulo();

                int opcao;
                double raio;
                double lado1;
                double lado2;
                double altura;
                double base;
                int cont = 0;

                while (cont < 2) {
                        cont += 1;

                        System.out.println("Escolha uma das opções abaixo:");
                        System.out.println("1 - Calcular área de um círculo");
                        System.out.println("2 - Calcular área de um triângulo equilátero");
                        System.out.println("3 - Calcular área de um quadrado");
                        System.out.println("4 - Calcular área de um quadrilátero");
                        System.out.println("0 - Sair do programa");
                        opcao = in.nextInt();

                        while (opcao >= 4) {

                                if (opcao == 1) {
                                        System.out.print("Insira o raio: ");
                                        raio = in.nextDouble();
                                        circulo = new Circulo(raio);
                                        System.out.println("Área: " + circulo.calculaArea());
                                }

                                if (opcao == 2) {
                                        System.out.print("Insira a base: ");
                                        base = in.nextDouble();
                                        System.out.print("Insira a altura: ");
                                        altura = in.nextDouble();
                                        triangulo = new Triangulo(base, altura);
                                        System.out.println("Área: " + triangulo.calculaArea());
                                }

                                if (opcao == 3) {
                                        System.out.print("Insira o lado : ");
                                        lado1 = in.nextDouble();
                                        quadrado = new Quadrado(lado1);
                                        System.out.println("Área: " + quadrado.calculaArea());
                                }

                                if (opcao == 4) {
                                        System.out.print("Insira o lado 1: ");
                                        lado1 = in.nextDouble();
                                        System.out.print("Insira o lado 2: ");
                                        lado2 = in.nextDouble();
                                        quadrilatero = new Quadrilatero(lado1, lado2);
                                        System.out.println("Área: " + quadrilatero.calculaArea());
                                }

                                if (opcao == 0) {
                                        System.out.println("Programa encerrado!");
                                        opcao = 5;
                                        cont = 2;
                                }
                        }

                }
        }
}