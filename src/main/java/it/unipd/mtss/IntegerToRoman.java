////////////////////////////////////////////////////////////////////
// Alberto Pignat 2111044
// Marco   Cossi  2113204
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number){
      if (number < 1 || number > 3) {
        throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 3");
    }
    switch(number)
    {
        case 1: return "I";   
        case 2: return "II";  
        case 3: return "III"; 
    }
    return "";
    }
}
