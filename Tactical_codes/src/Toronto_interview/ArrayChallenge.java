package Workwith.Toronto_interview;

import java.util.*;

public class ArrayChallenge
{

    public static String ArrayCouples(int[] arr)
    {
        int size=arr.length;
        TreeMap<Integer, Integer> maptable = new TreeMap<Integer, Integer>();
        for (int x = 0; x < size - 1; x += 2)
        {
            boolean found = false;
            for (Map.Entry<Integer, Integer> y :maptable.entrySet())
            {
                Map.Entry<Integer, Integer> current = y;
                if ((current.getKey() == arr[x] && current.getValue() == arr[x + 1]) || (current.getKey() == arr[x + 1] && current.getValue() == arr[x]))
                {
                    maptable.remove(current.getKey());
                    found = true;
                    break;
                }
            }

            if (!found)
            {
                maptable.put(arr[x], arr[x + 1]);
            }
        }
        if (maptable.isEmpty())
        {
            return "yes";
        }
        StringBuilder convert = new StringBuilder();

        for (Map.Entry<Integer, Integer> yy :maptable.entrySet())
        {
            Map.Entry<Integer, Integer> current = yy;
            convert.append(current.getKey()).append(",").append(current.getValue());

            if (current.getKey() != maptable.lastKey())
            {
                convert.append(",");
            }
        }

        return convert.toString();
    }

    public static void main(String[] args)
    {

        int[] D = {2,1,1,2,3,3};
        int[] C = {5,4,6,7,7,6,4,5};

        System.out.println(ArrayCouples(C));
        System.out.println(ArrayCouples(D));
    }
}
