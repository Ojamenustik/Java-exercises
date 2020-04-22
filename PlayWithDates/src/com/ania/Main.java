package com.ania;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> dates = new ArrayList<>();
//        ArrayList<String> datesInFormat = new ArrayList<>();
//        String day;
//        String month;
//        String year;

        int numberOfCases = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < numberOfCases; i++){
            dates.add(scanner.nextLine());
        }

//        for(String date : dates){
//            String[] dateArray = date.split(" ");
//            day = dateArray[0];
//            month = dateArray[1];
//            year = dateArray[2];
//           //String properDate = year+month+day;
//            String properDate = day + "-"+month+"-"+year;
//            datesInFormat.add(properDate);
//        }
        for(String date: dates) {
            SimpleDateFormat simpleDateformat = new SimpleDateFormat("dd MM yyyy");
            try {
                Date someDate = simpleDateformat.parse(date);
                simpleDateformat.applyPattern("EEEE");
                System.out.println(simpleDateformat.format(someDate));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}
