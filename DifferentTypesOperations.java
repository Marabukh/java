public class DifferentTypesOperations {
  	public static void main(String[] args) {
  	    float f = 0.1f;
  	    double d = 0.1;
  	    System.out.println(f + d); // 0.20000000149011612 - связанно с переводом чисел из десятиричной сс в двоичную
  	    byte b = 100;
  	    int i = 1000;
  	    System.out.println(i - b); // 900
  	}
}
