package de.hfu;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	 * This Program replaces every lowercase characters in a string
	 *
	 */
    public static void main(String[] args) {

    	/**
    	 * Here we declare a potential string
    	 *
    	 */
        String str1="Das ist ein Teststring";
        StringBuffer newStr=new StringBuffer(str1);

        for(int i = 0; i < str1.length(); i++) {
        	
        	
            if(Character.isLowerCase(str1.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
            }

        }
        System.out.println("String after case conversion : " + newStr);
    }
}
