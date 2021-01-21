//Question
/* https://www.hackerrank.com/challenges/java-currency-formatter/problem */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Currency_Formatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale locale = new Locale("en", "US");      
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);    
        System.out.println("US: " + currencyFormatter.format(payment));
        Locale locale1 = new Locale("en", "IN");      
        NumberFormat currencyFormatter1 = NumberFormat.getCurrencyInstance(locale1); 
        System.out.println("India: " + currencyFormatter1.format(payment));
        Locale locale2 = new Locale("zh", "CN");      
        NumberFormat currencyFormatter2 = NumberFormat.getCurrencyInstance(locale2); 
        System.out.println("China: " + currencyFormatter2.format(payment));
        Locale locale3 = new Locale("en", "FRANCE");      
        NumberFormat currencyFormatter3 = NumberFormat.getCurrencyInstance(locale3.FRANCE); 
        System.out.println("France: " + currencyFormatter3.format(payment));
    }
}