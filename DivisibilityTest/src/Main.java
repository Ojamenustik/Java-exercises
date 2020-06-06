import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testCases = in.nextInt();
        for (int i =0; i< testCases; ++i)
        {
           int P0 = in.nextInt();
           int P1 = in.nextInt();
           int Q = in.nextInt();
           int N = in.nextInt();

           if (generateNumber(P0, P1, Q, N))
           {
               System.out.println("NO");

           }
           else
           {
               System.out.println("YES");

           }
        }

    }



    static boolean generateNumber(int P0, int P1, int Q, int N)
    {
        long res = P0;
        res = res*10 + P1;
        int Pj = P0;
        int Pi = P1;
        long sum = Pi + Pj;
        int H = 0;
        for (int i = 0; i <= N; ++i)
        {
            res *= 10;
            int newP= (4*Pi + Pj) % Q;
            H = Pj;
            Pj = Pi;
            Pi = newP;
            sum += newP;
            res += newP;
        }

        switch (Q)
        {
            case 1:
                return true;
            case 2:
                if(Pi % 2 == 0) {
                    return true;
                }
                else {
                    return  false;
                }
            case 3:
                if (sum % 3 ==0)
                {
                    return true;
                }
                else {
                    return  false;
                }
            case 4:
                if (Pi % 4 == 0 && Pj % 4 ==0)
                {
                    return true;
                }
                else {
                    return false;
                }
            case 5:
                if (Pi == 5 && Pi == 0)
                {
                    return true;
                }
                else {
                    return false;
                }
            case 6:
                if (sum % 6 ==0)
                {
                    return  true;
                }
                else {
                    return false;
                }
            case 7:
                if (res % 7 == 0)
                {
                    return  true;
                }
                else {
                    return false;
                }
            case 8:
                if (H % 2 ==0 &&( (Pj * 10 + Pi ) % 8 ==0))
                {
                    return true;
                }
                else {
                    return false;
                }

            case 9:
                if (sum % 9 == 0)
                {
                    return true;
                }
                else {
                    return false;
                }

        }

        return false;
    }
}
