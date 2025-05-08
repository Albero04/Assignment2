////////////////////////////////////////////////////////////////////
// Alberto Pignat 2111044
// Marco   Cossi  2113204
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

  public static String convert(int number){
    if (number < 1 || number > 500) {
      throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 500");
    }

    String[] romanLetters = {"D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int[] values = {500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    StringBuilder romanNumber = new StringBuilder();

    for (int i = 0; i < values.length; i++) {
      while (number >= values[i]) {
        number -= values[i];
        romanNumber.append(romanLetters[i]);
      }
    }

    return romanNumber.toString();
  }
}
