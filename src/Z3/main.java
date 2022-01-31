package Z3;

import java.util.Arrays;
import java.io.File;
import java.util.Objects;

public class main
{
    public static void main(String[] args)
    {
        File file = new File("src/");
        String[] str = file.list();
        Arrays.stream(str).filter(Objects::nonNull).forEach(System.out::println);
    }
}
