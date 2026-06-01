package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("====== Binary Search using Numbers ======");
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = binarySearch(list, target);
        System.out.println("Target " + target + " found at index: " + result);

        System.out.println("====== Binary Search using Strings ======");

        String[] namesList = {"Alice", "Bob", "Charlie", "David", "Emma", "Frank", "George"};
        String targett = "David";

        int resultt = binarySearchString(namesList, targett);
        System.out.println("The name '" + targett + "' was found at index: " + resultt);
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
}