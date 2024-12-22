public class B {

    public final int a = 10; // прямая иициализация
    public final int b;
    public final int c; 
    {
        c = 30; // инициализация через логический блок 
    }

    public B(int bValue) {
        this.b = bValue; //инициализация при конструировании
    }

    public static void main(String[] args) {
        B obj1 = new A(20);
        System.out.println("a: " + obj1.a); // 10
        System.out.println("b: " + obj1.b); // 20
        System.out.println("c: " + obj1.c); // 30
    }
}
