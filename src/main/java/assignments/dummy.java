package assignments;

import java.util.HashMap;

public class dummy {

    public static void main(String[] args) {
        String name = "Gautham";
        StringBuilder str = new StringBuilder();
        str.append(name);
        str = str.reverse();
       System.out.println(str); 
       char chars[] = name.toCharArray();
       for (int i = chars.length-1; i >=0; i--) {
        System.out.print(chars[i]);
        
        String string = "This this is is done by Saket Saket";
        String[] split = string.split(" ");
        HashMap<String, Integer> map= new HashMap<String,Integer>();
        int num = 5;
        for (int j = 2; j < num; j++) {
            if (num%j==0) {
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not a prime number");
        }
                }
            }
        }

        
    
    }

