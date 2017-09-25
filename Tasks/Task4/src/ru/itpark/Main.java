package ru.itpark;

public class MainReadArrayFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // считываю размер массива
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            int min = array[0];
                for (int i = 1; i < array.length; i++) {
                 if (array[i] < min) {
                    min = array[i];