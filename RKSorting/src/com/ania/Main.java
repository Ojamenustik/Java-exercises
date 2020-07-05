package com.ania;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;

public class Main {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        long number = sc.nextLong();
        sc.nextLine();

        Map<Long, Long> map = new LinkedHashMap <>();
        for (int i = 0 ; i<number;++i)
        {
            long newNumber= sc.nextLong();
            Long val = map.get(newNumber);
            if(val == null) {
                map.put(newNumber, 0l);
            }
            else {
                map.replace(newNumber, ++val);
            }
        }

         map.entrySet().stream().sorted(comparingByValue(Collections.reverseOrder())).forEach(e-> {
            for (int j = 0; j <= e.getValue(); ++j) {
                System.out.print(e.getKey() +" ");
            }
        });
    }
}

//                //.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)->e2, LinkedHashMap::new)).entrySet().stream().;
//
//        String numbers = sc.nextLine();
//        String array[] = numbers.split(" ");
//
//
//
//        int [] arr = new int [array.length];
//        for(int i=0; i<array.length; i++) {
//            arr[i] = Integer.parseInt(array[i]);
//        }
//
//        Map<Integer, Integer> map = new HashMap<>();
//        List<Integer> outputArray = new ArrayList<>();
//
//        for (int current : arr) {
//            int count = map.getOrDefault(current, 0);
//            map.put(current, count + 1);
//            outputArray.add(current);
//        }
//
//        // Compare the map by value
//        SortComparator comp = new SortComparator(map);
//
//        // Sort the map using Collections CLass
//        Collections.sort(outputArray, comp);
//
//        // Final Output
//        for (Integer i : outputArray) {
//            System.out.print(i + " ");
//        }

//// Implement Comparator Interface to sort the values
//class SortComparator implements Comparator<Integer> {
//    private final Map<Integer, Integer> freqMap;
//
//    // Assign the specified map
//    SortComparator(Map<Integer, Integer> tFreqMap)
//    {
//        this.freqMap = tFreqMap;
//    }
//
//    // Compare the values
//    public int compare(Integer k1, Integer k2)
//    {
//
//        // Compare value by frequency
//        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));
//
//        // Compare value if frequency is equal
//        int valueCompare = k1.compareTo(k2);
//
//        // If frequency is equal, then just compare by value, otherwise -
//        // compare by the frequency.
//        if (freqCompare == 0)
//            return valueCompare;
//        else
//            return freqCompare;
//    }
//}