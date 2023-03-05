import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        quest1();
        quest2();
        quest3();
        quest4();
        quest5();
    }

    public static void quest1() {
        int indice = 13, soma = 0, k = 0;

        while(k < indice) {
            k += 1;
            soma = soma + k;
        }
        System.out.println("Soma = " + soma);
    }

    public static void quest2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int num = input.nextInt();
        int a = 0, b = 1, c;
        boolean pertence = false;
        while (b <= num) {
            if (b == num) {
                pertence = true;
            }
            c = a + b;
            a = b;
            b = c;
        }
        if (pertence) {
            System.out.println(num + " pertence a sequencia de Fibonacci");
        } else {
            System.out.println(num + " nao pertence a sequencia de Fibonacci");
        }
    }

    public static void quest3(){
        // adicionar 2 ao número anterior
        int a1 = 1, a2 = 3, a3 = 5, a4 = 7;
        int a5 = a4 + 2;
        System.out.println("Proximo elemento da sequencia a): " + a5);

        // multiplicar por 2 o número anterior
        int b1 = 2, b2 = 4, b3 = 8, b4 = 16, b5 = 32, b6 = 64;
        int b7 = b6 * 2;
        System.out.println("Proximo elemento da sequencia b): " + b7);

        // elevar ao quadrado o índice do elemento na sequência
        int c1 = 0, c2 = 1, c3 = 4, c4 = 9, c5 = 16, c6 = 25, c7 = 36;
        int c8 = (int) Math.pow((int) Math.sqrt(c7) + 1, 2);
        System.out.println("Proximo elemento da sequencia c): " + c8);

        // adicionar 12 ao número anterior
        int d1 = 4, d2 = 16, d3 = 36, d4 = 64;
        int d5 = d4 + 12;
        System.out.println("Proximo elemento da sequencia d): " + d5);

        // somar os dois números anteriores
        int e1 = 1, e2 = 1, e3 = 2, e4 = 3, e5 = 5, e6 = 8;
        int e7 = e6 + e5;
        System.out.println("Proximo elemento da sequencia e): " + e7);

        // adicionar 1, 2 ou 3 ao número anterior
        int f1 = 2, f2 = 10, f3 = 12, f4 = 16, f5 = 17, f6 = 18, f7 = 19;
        int f8 = f7 + 1;
        System.out.println("Proximo elemento da sequencia f): " + f8);
    }

    public static void quest4(){
        int distanciaTotal = 100; // distância entre as cidades
        double velocidadeCarro = 110; // km/h
        double velocidadeCaminhao = 80; // km/h
        int pedagios = 2; // quantidade de pedágios no trajeto
        int tempoPedagioCaminhao = 5; // minutos que o caminhão leva a mais em cada pedágio

        // converte a velocidade do carro e do caminhão de km/h para km/min
        double velocidadeCarroMin = velocidadeCarro / 60;
        double velocidadeCaminhaoMin = velocidadeCaminhao / 60;

        // calcula a distância percorrida pelo carro e pelo caminhão até o cruzamento
        double tempoCarroCruzamento = distanciaTotal / velocidadeCarroMin;
        double tempoCaminhaoCruzamento = (distanciaTotal / velocidadeCaminhaoMin) + (pedagios * tempoPedagioCaminhao);

        // verifical qual veículo demora menos tempo
        if (tempoCarroCruzamento < tempoCaminhaoCruzamento) {
            System.out.println("O carro esta mais proximo de Ribeirao Preto.");
        } else {
            System.out.println("O caminhão esta mais proximo de Ribeirao Preto.");
        }
    }

    public static void quest5(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = input.nextLine();

        char[] caracteres = texto.toCharArray();

        int tamanho = caracteres.length;
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
        }

        String textoInvertido = new String(caracteres);
        System.out.println(textoInvertido);
    }

}
