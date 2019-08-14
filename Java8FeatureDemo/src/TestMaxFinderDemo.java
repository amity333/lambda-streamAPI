import java.util.function.*;
public class TestMaxFinderDemo {

	public static void main(String[] args) {
		
		MaxFinder mf=(int num1,int num2)->num1>num2?num1:num2;
		System.out.println("Greater no of two : "+mf.maximum(55,68));
		
		System.out.println("-----------------------------------");
		
		Consumer<String> c=(String str)-> System.out.println(str);
		c.accept("Hello");
		

	}

}
