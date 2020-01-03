import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountWords {
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String str[] = input.split(" ");
		//Map<String,Integer> hash = new LinkedHashMap<String,Integer>();
		Set<String> set = new LinkedHashSet<String>();
		int size = str.length;
		int count=0;
		for(int i=0;i<size;i++)
		{
			
			
				//count=count+1;
				set.add(str[i]);
			//	System.out.println(str[i]+" : "+hash.get(str[i]));
			
				
		}

		System.out.println(set);
		StringBuffer st= new StringBuffer();
		for(String s : set) {
		
		st.append(s);
		}
	System.out.println(st.toString());
	}

}
