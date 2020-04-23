package com.ania;

import java.util.Scanner;

public class Main {
    public static boolean compare(int[][] oneTable, int[][] secondTable)
    {
        if (oneTable.length != secondTable.length)
        return false;
        for (int i=0,j = 0; i<oneTable.length && j < secondTable.length; i++, j++)
        {
            if (oneTable[i].length!=secondTable[j].length)
            {
                return false;
            }
            for (int ik=0,jk=0; ik < oneTable[i].length && jk < secondTable[i].length; ik++, jk++)
            {
                if(oneTable[i][ik] != secondTable[i][ik])
                {
                        return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String arg = "120";
        //String arg = args[0];
        int numberOfChars = arg.length();
        int[][][] chars = new int[numberOfChars][3][3];
        int[][] one = {{0,0,0}, {0,0,1}, {0,0,1}};
        int[][] two = {{0,1,0}, {0,1,1}, {1,1,0}};
        int[][] three = {{0,1,0}, {0,1,1}, {0,1,1}};
        int[][] four = {{0,0,0}, {1,1,1}, {0,0,1}};
        int[][] five = {{0,1,0}, {1,1,0}, {0,1,1}};
        int[][] six = {{0,1,0}, {1,1,0}, {1,1,1}};
        int[][] seven = {{0,1,0}, {0,0,1}, {0,0,1}};
        int[][] eight = {{0,1,0}, {1,1,1}, {1,1,1}};
        int[][] nine = {{0,1,0}, {1,1,1}, {0,1,1}};
        int[][] zero = {{0,1,0}, {1,0,1}, {1,1,1}};
        int [][][] possibilities = {zero, one, two, three, four, five, six, seven, eight, nine};
        int i, j, k;

        for(i=0; i<numberOfChars; i++){
            if(arg.charAt(i)=='1') chars[i] = one;
            else if(arg.charAt(i)=='2') chars[i] = two;
            else if(arg.charAt(i)=='3') chars[i] = three;
            else if(arg.charAt(i)=='4') chars[i] = four;
            else if(arg.charAt(i)=='5') chars[i] = five;
            else if(arg.charAt(i)=='6') chars[i] = six;
            else if(arg.charAt(i)=='7') chars[i] = seven;
            else if(arg.charAt(i)=='8') chars[i] = eight;
            else if(arg.charAt(i)=='9') chars[i] = nine;
            else if(arg.charAt(i)=='0') chars[i] = zero;
            else chars[i] = four;
        }

        for (j = 0; j < 3; j++) {
            for (i = 0; i < numberOfChars; i++) {
                for (k = 0; k < 3; k++) {
                    if (chars[i][j][k] == 1) {
                        if (k == 1) System.out.print("_");
                        else System.out.print("|");
                    }
                    else System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        Scanner sc = new Scanner(System.in);

        String lineOne = sc.nextLine();
        String lineTwo = sc.nextLine();
        String lineThree = sc.nextLine();
        String [] lines = {lineOne, lineTwo, lineThree};
        int [][][] matrix = new int[lineOne.length()/4][3][3];
        int NumberIndex = 0;
        for (int lineIndex = 0; lineIndex < lines.length; ++lineIndex)
        {

            for(int CharIndex = 0+(NumberIndex*4); CharIndex < 3 + 4*(NumberIndex); ++CharIndex)
            {
                char temp = lines[lineIndex].charAt(CharIndex);
                if (temp == ' ')
                {
                    matrix[NumberIndex][lineIndex][CharIndex-(NumberIndex*4)] = 0;
                }
                else {
                    matrix[NumberIndex][lineIndex][CharIndex-(NumberIndex*4)] = 1;
                }
            }
            NumberIndex ++;
        }

        int resNumber = -1;
        int Add = 1;
        for (int NumberIndex2 = 0; NumberIndex2 < matrix.length; ++NumberIndex2)
        {
            for (int number = 0; number < possibilities.length; ++number)
            if (compare(matrix[NumberIndex2], possibilities[number]))
            {
                resNumber += Add + number;
                Add = 0;
                break;
            }
            resNumber *= 10;
        }
        System.out.println(resNumber);
    }
}