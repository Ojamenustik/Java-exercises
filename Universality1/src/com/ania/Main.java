package com.ania;

import java.util.*;

public class Main {

    public static Integer findMin(List<Integer> numbers){
        List<Integer> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList);
        return sortedList.get(0);

    }

    public static Integer findMax(List<Integer> numbers){
        List<Integer> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList);
        return sortedList.get(sortedList.size() - 1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        int sum = 0;
        boolean flag = false;
        int number = scanner.nextInt();

        while(number != 0) {
            sum += number;
            numbers.add(number);

            for (int i = 2; i <= number/2; ++i) {
                if(number % i == 0){
                    flag = true;
                }
            }
            System.out.println(sum);
            System.out.println(findMin(numbers));
            System.out.println(findMax(numbers));
            if(!flag){
                System.out.println(number);
            }

            number = scanner.nextInt();
        }

        scanner.close();
    }
}
