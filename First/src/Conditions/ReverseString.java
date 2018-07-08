package Conditions;

public class ReverseString {
	 public static void main(String[] args) {
		   
         // Initialize a String that needs to be reversed
         String originalString = "Divya";

         // Empty String to store the reverse of the original string
String reverseString = "";

int len= originalString.length();

         // Started with the last position of a string till it reach to its 0 position
         for(int i=len-1; i>=0;i--){

          // Original string is stored in the reverse order
            reverseString = reverseString+originalString.charAt(i);
}

         // To print the value of reversed string
System.out.println(reverseString);
  
}

}


