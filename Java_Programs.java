1.WAP to separaete the numbers,Alphates and special character

package pro;

public class Test0 {

	public static void main(String[] args) {

		String s="#$asds#$$4545A";

		String alpa="";
		String numb="";
		String spchar="";

		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>='a'&& s.charAt(i)<='z' ||
			        s.charAt(i)>='A' && s.charAt(i)<='Z') {

				alpa=alpa+s.charAt(i);
			}
			else if(s.charAt(i)>=0 && s.charAt(i)<=9) {
				numb=numb+s.charAt(i);
			}


			else
			{
				spchar=spchar+s.charAt(i);
			}


		}

		System.out.println(alpa+numb+spchar);
	}

}


2.Palidrom word
package pro;

public class Test1 {

	public static void main(String[] args) {

		String s="mom";
		String rev="";

		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("pali");
		}
		else
		{
			System.out.println("it not pali");
		}
	}

}
3.Reverse the string
package pro;

public class Test10 {

	public static void main(String[] args) {

		String s="welcometo new year";
		String rev="";
		String[] str = s.split(" ");

		for(int i=0; i<str.length; i++) {
			rev=str[i]+" "+rev;
		}
		System.out.println(rev);
	}

}
4.Reverse the word
package pro;

public class Test11 {

	public static void main(String[] args) {

		String s="hello";
		String rev="";

		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}

5.Even and odd number
package pro;

public class Test12 {

	public static void main(String[] args) {
		int num=7;

		if(num%2==0) {
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
6.WAP to print common numbers between two arrays
package pro;

public class Test2 {

	public static void main(String[] args) {

		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,3,6,7};

		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {

				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}



	}

}
7.Factorial
package pro;

public class Test4 {

	public static void main(String[] args) {

		int n=5;
		int fact=1;

		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
8.Fibonanice series
package pro;

public class Test5 {

	public static void main(String[] args) {

		int fib1=0;
		int fib2=1;
		int fib3;

		for(int i=0; i<=10; i++) {
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;

			System.out.println(fib3);
		}
	}




}
9.WAP TO print count of the each character
package pro;

import java.util.LinkedHashSet;

public class Test6 {

	public static void main(String[] args) {

		String s="Hello Ganesha";

		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++) {
			set.add(s.charAt(i));
		}

		for(Character ch:set) {
			int count =0;

			for(int i=0; i<s.length(); i++) {
				if(ch==s.charAt(i)) {
					count ++;
				}

			}
			System.out.print(ch);
			System.out.print(count);
		}

	}

}
10.Remove the duplicate letter
package pro;

import java.util.LinkedHashSet;

public class Test7 {

	public static void main(String[] args) {

		String s="Hello";

		char[] chars = s.toCharArray();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for(char c:chars) {
			set.add(c);
		}

		StringBuilder sb=new StringBuilder();
		for(Character charcter:set) {
			sb.append(charcter);
		}
		System.out.println(sb);
	}

}
11.WAP to remove duplicate character
package pro;

import java.util.LinkedHashSet;

public class Test8 {

	public static void main(String[] args) {

		String s="heeeelllooo";
		char[] chars = s.toCharArray();
		LinkedHashSet<Character>charset=new LinkedHashSet<Character>();
		for(char c:chars) {
			charset.add(c);
		}

		StringBuilder sb=new StringBuilder();
		for(Character character:charset) {
			sb.append(character);
		}
		System.out.println(sb);
	}

}
12.Number palidrom
package pro1;

public class Test11 {

	public static void main(String[] args) {

		String s="131";
		String rev="";

		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("pali");
		}
		else
		{
			System.out.println("not pali");
		}
	}
}
13.descending order number
package pro1;

public class Test2 {

	public static void main(String[] args) {

		int arr[]= {1,3,4,5,2};

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}

	}

}
14.Reverse each letter in the sentance
package progr;

public class Test63 {

	public static void main(String[] args) {

		String s="Ganesha The lord";
		String rev="";

		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}



