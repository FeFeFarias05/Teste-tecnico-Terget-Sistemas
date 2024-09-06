import java.util.ArrayList;
import java.util.Scanner;

public class Desafios{
    /*
        * 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
        * (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
        * ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
        */
        static ArrayList<Integer> fibonacci(int n, ArrayList<Integer> lista) throws Exception{
            if (n < 0) {
                throw new Exception("Número inválido");
            }
            if (n == 0) {
                lista.add(0);
                return lista;
            }
            if (n == 1) {
                lista.add(0);
                lista.add(1);
                return lista;
            }
    
            fibonacci(n - 1, lista);
            int size = lista.size();
            lista.add(lista.get(size - 1) + lista.get(size - 2));
            return lista;
        }
        
        static void pertenceFibonacci(int n) throws Exception {
            ArrayList<Integer> listaFibonacci = fibonacci(n, new ArrayList<Integer>());
            if (listaFibonacci.contains(n)) {
                System.out.println("Pertence a sequência de Fibonacci");
            } else {
                System.out.println("Não pertence a sequência de Fibonacci");
            }
        }

        /*
         * 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, 
         * seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
         */
        static void verificaString(String p)
        {
            int count = 0;
            for(int i = 0; i< p.length(); i++){
                if((p.substring(i,i+1).toLowerCase()).equals("a")) //Converte tudo para minúscula mesmo que a entrada seja maiúscula
                {
                    count++;
                }
            }
            System.out.println("A palavra " + p + " possui " + count + " letra a");
        }
        public static void main(String[] args) throws Exception {
            Scanner t = new Scanner(System.in);
            System.out.println("Digite a posição que deseja seu Fibonacci");
            int num = t.nextInt();
            t.nextLine();
            pertenceFibonacci(num);

            System.out.println("Digite uma palavra");
            String palavra = t.nextLine();
            verificaString(palavra);

        }
}