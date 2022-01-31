package Z1;

import java.time.LocalTime;

public class main
{
    public static void main(String[] args)
    {
        Integer[] sortedInteger = new Integer[]{1,2,3,3,2,1};
        Integer[] unsortedInteger = new Integer[]{1,2,3,4,5,1};
        LocalTime[] sortedLocalTime = new LocalTime[]{LocalTime.of(1, 20), LocalTime.of(3, 15), LocalTime.of(3, 15), LocalTime.of(1, 20)};
        LocalTime[] unsortedLocalTime = new LocalTime[]{LocalTime.of(1, 20), LocalTime.of(3, 15), LocalTime.of(7, 17), LocalTime.of(12, 10)};
        System.out.println(ArrayUtil.jestPalindromem(sortedInteger));
        System.out.println(ArrayUtil.jestPalindromem(unsortedInteger));
        System.out.println(ArrayUtil.jestPalindromem(sortedLocalTime));
        System.out.println(ArrayUtil.jestPalindromem(unsortedLocalTime));
    }

    static class ArrayUtil
    {
        public static <T extends Comparable<T>>boolean jestPalindromem(T[] array)
        {
            int size = array.length - 1;
            for (int i = 0; i < array.length / 2; i++)
            {
                if (array[i].compareTo(array[size]) != 0)
                {
                    return false;
                }
                size = size - 1;
            }
            return true;
        }
    }
}
