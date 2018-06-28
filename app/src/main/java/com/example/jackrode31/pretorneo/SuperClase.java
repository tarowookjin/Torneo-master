package com.example.jackrode31.pretorneo;
import java.io.*;

public class SuperClase {

    static String checkReversible (int n)
    {
        String a = null;
        int rev = 0, rem = 0;

        // Calculate reverse of n
        int flag = n;
        while (flag>0)
        {
            rem = flag % 10;
            rev *= 10;
            rev += rem;
            flag /= 10;
        }

        // Calculate sum of number
        // and its reverse
        int sum = rev + n;

        // Check for reverse number
        // reach digit must be odd
        while (sum > 0 && (rem % 2 != 0))
        {
            rem = sum % 10;
            sum /= 10;
        }

        if (sum == 0)
            a= "es reversible";
        else
            a="no es reversible";

        return a;
    }

    static int countReversible (int n)
    {
        int count = 0;

        // Calculate counts of
        // reversible number of 1 to n-digits
        for ( int i = 1; i <= n; i++)
        {
            // All four possible cases
            // and their formula
            switch (i % 4)
            {

                // for i of form 2k
                case 0:
                case 2:
                    count += 20 * Math.pow( 30, ( i / 2 - 1));
                    break;

                // for i of form 4k + 3
                case 3:
                    count += 100 * Math.pow ( 500, i / 4 );
                    break;

                // for i of form 4k + 1 no solution
                case 1:
                    break;
            }
        }
        return count;
    }


}
