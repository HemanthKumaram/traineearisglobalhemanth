package training;

public class StringExamples {
public static void main(String[] args) {
	//String str1 = "";
   /* char arr[] = { 'j', 'a', 'v', 'a', ' ', 'p', 
    'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g' };
    String str2 = new String(arr);
    String str3 = new String(str2);
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);*/
    
    String str = "Java Programming";
    String str1 = "Java Programming";
    String str2 = str1;
    if (str.equals(str1))
        System.out.println("Equal Case 1");
    if (str == str1)
        System.out.println("Equal Case 2");
// 	String str = "Java";
//	String str1 = "Programming";
	//System.out.println(str.concat(str1));
//	System.out.println("j" + "a" + "v" + "a");
}
}
