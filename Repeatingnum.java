package lesum;

import java.util.HashSet;

public class Repeatingnum {

	static void printFirstRepeating(int arr[])
    {
        int min = -1;
 
        HashSet<Integer> set = new HashSet<>();
 
        for (int i=arr.length-1; i>=0; i--)
        {
            if (set.contains(arr[i]))
                min = i;
 
            else   
                set.add(arr[i]);
        }
 
        if (min != -1)
          System.out.println("The first repeating element is " + arr[min]);
        else
          System.out.println("There are no repeating elements");
    }
 
    public static void main (String[] args)     {
        int arr[] = {10, 1, 3, 4, 3, 5, 6};
        printFirstRepeating(arr);
    }

}
