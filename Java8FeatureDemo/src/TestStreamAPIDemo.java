import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStreamAPIDemo {

	public static void main(String[] args) {
		
		
		
		System.out.println("******filter******");
		List<Integer> listInt1=Arrays.asList(1,20,7,60,33);
		
		/*Stream streamlistInt1=listInt1.stream();
		Predicate<Integer> mypredicate=(num)-> num>10;
		streamlistInt1.filter(mypredicate).forEach(num -> System.out.print(" : "+num));*/
		
		listInt1.stream().filter((num)->num>10).forEach(num->System.out.println(" : "+num));
		
		long myCount=listInt1.stream().filter(num-> num>10).count();
		
		System.out.println("values greater than 10: "+myCount);
		
		System.out.println("******filter string******");
		
		List<String> cityList=Arrays.asList("Pune","Mumbai","Chennai","","Pune","Noida","");
		
		cityList.stream().distinct().filter(city -> city.length()>0).
		forEach(city -> System.out.println(" : "+city));
		
		long count=cityList.stream().filter(city -> city.equals("")).count();
	     System.out.println(" city with empty lengths: "+count );
	     
	     cityList.stream().distinct().filter(city -> city.length()>0).
			forEach(city -> System.out.println(" : "+city+" "+city.length()));//length of strings
	    
	     cityList.stream().map(str->str.length()).forEach(len->System.out.println(" : "+len));;
		
		

	}

}
