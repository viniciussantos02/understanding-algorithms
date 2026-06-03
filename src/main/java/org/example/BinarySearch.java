package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A busca binária é um algoritmo de alta eficiência para localizar um elemento em uma lista de dados.
 * Ela funciona dividindo o espaço de busca pela metade a cada tentativa, exigindo obrigatoriamente que a estrutura esteja ordenada.
 * Left, Right e Mid sao indices dentro da lista.
 * O(logn) é a notacao big O para a complexidade de tempo do algoritimo
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("====== Binary Search using Numbers ======");
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = binarySearch(list, target);
        System.out.println("Target " + target + " found at index: " + result);

        System.out.println("====== Binary Search using Strings ======");

        String[] namesList = {"Alice", "Bob", "Charlie", "David", "Emma", "Frank", "George", "Hanna"};
        String targett = "Charlie";

        int resultt = binarySearchString(namesList, targett);
        System.out.println("The name '" + targett + "' was found at index: " + resultt);

        System.out.println("====== Java Binary Search using Numbers and Strings ======");
        javaBinarySearch();
    }

    private static int binarySearch(int[] list, int target) {
        var left = 0;
        var right = list.length - 1;
        var mid = 0;
        var tryy = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            tryy = list[mid];
            if (tryy == target)
                return mid;
            if (tryy > target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return -1;
    }

    private static int binarySearchString(String[] list, String target) {
        var left = 0;
        var right = list.length - 1;
        var mid = 0;
        String attempt;

        while (left <= right) {
            mid = (left + right) / 2;
            attempt = list[mid];

            int comparison = attempt.compareToIgnoreCase(target); //compareTo() ele retorna 0 se as strings forem iguais, 1 se a string esta em posicao maior na ordem alfabetica, e -1 se tiver em posicao menor.

            if (comparison == 0)
                return mid;
            if (comparison > 0)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return -1;
    }

    //Busca binaria usando recursos nativos do Java
    private static void javaBinarySearch() {
        long[] userIds = {100023L, 200045L, 350012L, 480099L, 500123L};

        int index = Arrays.binarySearch(userIds, 350012L);
        System.out.println("Usuário encontrado na posição: " + index);

        List<String> videoTags = Arrays.asList("anime", "comedy", "drama", "horror", "sci-fi");

        int tagIndex = Collections.binarySearch(videoTags, "horror");
        System.out.println("Tag encontrada na posição: " + tagIndex);
    }
}