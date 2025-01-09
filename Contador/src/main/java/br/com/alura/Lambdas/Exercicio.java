package br.com.alura.Lambdas;

import java.util.Arrays;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {

    //1 multiplicação
        Multiplicacao multiplicacao = ((a, b) -> a * b);
        int resultado = multiplicacao.multiplicacao(5,3);
        System.out.println("Resultado: " + resultado);

        System.out.println("=====X=====X=====X=====X=====X=====");
    //2 primos
        Primo primo = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println(primo.verificarPrimo(11));
        System.out.println(primo.verificarPrimo(12));

        System.out.println("=====X=====X=====X=====X=====X=====");
    //3 string para maiúsculo
        Transformador toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.transformar("java"));

        System.out.println("=====X=====X=====X=====X=====X=====");
    //4 palíndromo
        Palindromo palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(palindromo.verificarPalindromo("radar"));
        System.out.println(palindromo.verificarPalindromo("java"));

        System.out.println("=====X=====X=====X=====X=====X=====");
    //5 lista de inteiros e retorna uma nova com replaceall *3 em cada numero
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.replaceAll(n -> n * 3);
        System.out.println(numeros);



        System.out.println("=====X=====X=====X=====X=====X=====");
    //6 lista string ordem alfabetica (sort+foreach)
        List<String> nomes = Arrays.asList("Lucas", "Maria", "João", "Ana");
        nomes.sort((a, b) -> a.compareTo(b));
        System.out.println(nomes);


        System.out.println("=====X=====X=====X=====X=====X=====");
    //7 dois numeros e divide o primeiro pelo segundo. Lançar ArithmeticException se o div for zero
        Divisor divisor = (a, b) -> {
            if (b == 0) throw new ArithmeticException("Divisão por zero");
            return a / b;
        };

        try {
            System.out.println(divisor.dividir(10, 2));
            System.out.println(divisor.dividir(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


    }
}
