import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Valor de soma = 91
        quest1();
        quest2();
    }

    public static void quest1() {
        int indice = 13, soma = 0, k = 0;

        while(k < indice) {
            k += 1;
            soma = soma + k;
        }
        System.out.println(soma);
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

}
