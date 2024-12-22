//1
import java.util.Formatter;

public class Spec1 {
    public static void main(String[] args) {
        // создаем объект Formatter
        Formatter formatter = new Formatter();

        // %b — логическое значение
        boolean isJavaFun = true;
        formatter.format("Is Java fun? %b\n", isJavaFun);

        // %d — десятичное целое число
        int number = 42;
        formatter.format("The answer to life is %d\n", number);

        // %f — число с плавающей точкой
        double pi = 3.14159;
        formatter.format("Value of Pi: %f\n", pi);

        // %s — строковое представление
        String name = "Java";
        formatter.format("The name is %s\n", name);

        // %% — вставка знака процента
        formatter.format("Percentage: 50%%\n");

        // вывод 
        System.out.println(formatter.toString());
        formatter.close();
    }
}

//2
//Метод flush() используется для немедленного вывода всех накопленных данных в потоке. Он сбрасывает буфер, если данные находятся в буферизированном потоке.

import java.io.*;

public class FlushExample {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

        writer.print("Hello, ");
        writer.print("world!");
        writer.flush();  // сбрасываем данные в файл немедленно

        writer.close();
    }
}

//3
import java.util.*;

public class Spec2 {
    public static void main(String[] args) {
        // текущие дата и время
        Date now = new Date();

        // создание объекта Formatter
        Formatter formatter = new Formatter();

        // %tY — год в четырехзначном формате
        formatter.format("Year: %tY\n", now);

        // %tB — полное название месяца
        formatter.format("Month: %tB\n", now);

        // %tA — полное название дня недели
        formatter.format("Day of the week: %tA\n", now);

        // %tI — час в 12-часовом формате
        formatter.format("Hour (12-hour format): %tI\n", now);

        // %tM — минуты в двухзначном формате
        formatter.format("Minutes: %tM\n", now);

        System.out.println(formatter.toString());
        formatter.close();
    }
}
