//1
public class StringBuilderBuffer {
    public static void main(String[] args) {
        // создание объектов StringBuffer и StringBuilder
        StringBuffer sbf = new StringBuffer("Hello");
        StringBuilder sbd = new StringBuilder("World");

        // append() - добавляет строку в конец
        sbf.append(", Java!");
        System.out.println("append(): " + sbf);  // Hello, Java!

        // insert() - вставляет строку в указанную позицию
        sbf.insert(5, ",");
        System.out.println("insert(): " + sbf);  // Hello, Java!

        // delete() - удаляет символы с указанного диапазона
        sbf.delete(5, 7);
        System.out.println("delete(): " + sbf);  // HelloJava!

        // replace() - заменяет символы в указанном диапазоне
        sbf.replace(5, 10, "Java 8");
        System.out.println("replace(): " + sbf);  // HelloJava 8

        // reverse() - переворачивает строку
        sbf.reverse();
        System.out.println("reverse(): " + sbf);  // 8avaJolleH

        // capacity() - возвращает емкость строки
        System.out.println("capacity(): " + sbf.capacity());  // 34

        // ensureCapacity() - гарантирует минимум заданную емкость
        sbf.ensureCapacity(50);
        System.out.println("ensureCapacity(): " + sbf.capacity());  // 50

        // charAt() - возвращает символ по индексу
        System.out.println("charAt(): " + sbf.charAt(0));  // 8

        // substring() - извлекает подстроку
        System.out.println("substring(): " + sbf.substring(2, 6));  // vaJ

        // toString() - преобразует StringBuffer/StringBuilder в String
        String result = sbf.toString();
        System.out.println("toString(): " + result);  // vaJolleH
    }
}

//2
public class StringConversion {
    public static void main(String[] args) {
        // создаем объекты String, StringBuffer и StringBuilder
        String str = "Hello, World!";
        StringBuffer sbf = new StringBuffer("Hello, StringBuffer!");
        StringBuilder sbd = new StringBuilder("Hello, StringBuilder!");

        // преобразование String в StringBuffer
        StringBuffer sbfFromString = new StringBuffer(str);
        System.out.println("String to StringBuffer: " + sbfFromString);  // String to StringBuffer: Hello, World!

        // преобразование String в StringBuilder
        StringBuilder sbdFromString = new StringBuilder(str);
        System.out.println("String to StringBuilder: " + sbdFromString);  // String to StringBuilder: Hello, World!

        // преобразование StringBuffer в String
        String strFromStringBuffer = sbf.toString();
        System.out.println("StringBuffer to String: " + strFromStringBuffer);  // StringBuffer to String: Hello, StringBuffer!

        // преобразование StringBuilder в String
        String strFromStringBuilder = sbd.toString();
        System.out.println("StringBuilder to String: " + strFromStringBuilder);  // StringBuilder to String: Hello, StringBuilder!

        // преобразование StringBuffer в StringBuilder 
        StringBuilder sbdFromStringBuffer = new StringBuilder(sbf.toString());
        System.out.println("StringBuffer to StringBuilder: " + sbdFromStringBuffer);  // StringBuffer to StringBuilder: Hello, StringBuffer!
    }
}
