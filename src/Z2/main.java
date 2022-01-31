package Z2;

import java.time.LocalDate;
import java.time.LocalTime;

public class main
{
    public static void main(String[] args)
    {
        Integer[] testInt = new Integer[]{1,2,3,4,5,6};
        String[] testStr = new String[]{"ala", "ma", "kota"};
        LocalDate[] testLD = new LocalDate[]{LocalDate.of(2000, 11, 12), LocalDate.of(2001, 2, 12), LocalDate.of(2005, 11,12)};
        LocalTime[] testLT = new LocalTime[]{LocalTime.of(12, 50), LocalTime.of(2, 20), LocalTime.of(16, 47)};
        Enumeration.printMarginal(testInt);
        Enumeration.printMarginal(testStr);
        Enumeration.printMarginal(testLD);
        Enumeration.printMarginal(testLT);
    }

    static class Enumeration {
        public static <E extends Iterable<E>> void printMarginal(E[] arg) {
            System.out.println(arg[0].iterator());
            System.out.println(", ");
            System.out.println(arg[arg.length - 1].iterator());
        }
    }
}
