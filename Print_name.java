import java.util.Scanner;

public class Print_name {
  	public static void main(String[] args) {
  	    System.out.printf("Введите имя: ");
  		  Scanner scan = new Scanner(System.in);
  		  String name = scan.next();
  		  System.out.printf("Привет, %s", name);
  	}
}
