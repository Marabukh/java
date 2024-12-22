//1
public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());  // NullPointerException

            int result = 10 / 0;  // ArithmeticException
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Произошло исключение: " + e);
        }
    }
}

class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class ExceptionsHierarchy {
    public static void main(String[] args) {
        try {
            throw new Ex3();
        } catch (Ex3 e) {
            System.out.println("Ex3 caught");
        } catch (Ex2 e) {
            System.out.println("Ex2 caught");
        } catch (Ex1 e) {
            System.out.println("Ex1 caught");
        }
    }
}

//2
//Ключевое слово final в блоке catch используется для того, чтобы переменная, которая будет ссылаться на исключение, не могла быть переинициализирована внутри блока catch. То есть, после того как исключение будет перехвачено, переменная e не может быть изменена в пределах этого блока
