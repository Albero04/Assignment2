////////////////////////////////////////////////////////////////////
// Alberto Pignat 2111044
// Marco   Cossi  2113204
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

  public static String convert(int number){
    if (number < 1 || number > 10) {
      throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 10");
    }
    switch(number)
    {
      case 1: return "I";   
      case 2: return "II";  
      case 3: return "III";
      case 4: return "IV";  
      case 5: return "V";  
      case 6: return "VI";  
      case 7: return "VII";
      case 8: return "VIII";
      case 9: return "IX";  
      case 10: return "X";
    }
  return "";
  }
}
