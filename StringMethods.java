//1
public class StringMethods {
    public static void main(String[] args) {
        String str = "   Hello, World!   ";

        // length() - возвращает длину строки
        System.out.println("Длина строки: " + str.length());  // 19
															  
        // toUpperCase() - преобразует строку в верхний регистр
        System.out.println("Верхний регистр: " + str.toUpperCase());  // "   HELLO, WORLD!   "

        // toLowerCase() - преобразует строку в нижний регистр
        System.out.println("Нижний регистр: " + str.toLowerCase());  // "   hello, world!   "

        // startsWith() - проверяет, начинается ли строка с заданной подстроки
        System.out.println("Начинается с '   Hello': " + str.startsWith("   Hello"));  // true

        // endsWith() - проверяет, заканчивается ли строка на заданную подстроку
        System.out.println("Заканчивается на 'World!': " + str.endsWith("World!"));  // false
																					 
        // trim() - удаляет начальные и конечные пробелы
        System.out.println("После trim: '" + str.trim() + "'");

        // substring() - извлекает подстроку с заданных позиций
        System.out.println("Подстрока (7-12): " + str.substring(7, 12));  // "World"

        // charAt() - возвращает символ по индексу
        System.out.println("Символ на индексе 0: " + str.charAt(0));  // ' '

        // contains() - проверяет, содержится ли подстрока в строке
        System.out.println("Содержит 'World': " + str.contains("World"));  // true

        // replace() - заменяет часть строки на другую строку
        System.out.println("Замена 'World' на 'Java': " + str.replace("World", "Java"));  // "   Hello, Java!   "

    }
}


//2
import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        // StringJoiner с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("One").add("two").add("three");
        
        System.out.println("StringJoiner: " + joiner.toString());  // One, two, three

        // StringJoiner с разделителем и обрамляющими скобками
        StringJoiner joinerWithBrackets = new StringJoiner(", ", "[", "]");
        joinerWithBrackets.add("First").add("Second").add("Third");
        
        System.out.println("StringJoiner с скобками: " + joinerWithBrackets.toString());  // [First, Second, Third]
    }
}


//3
//Три двойные кавычки (""") позволяют создавать многострочные строки

public class TextBlockExample {
    public static void main(String[] args) {
        String textBlock = """
            As for God, his way is perfect:
            The Lord's word is flawless;
            he shields all who take refuge in him.
            """;
        
        System.out.println(textBlock);
    }
}
