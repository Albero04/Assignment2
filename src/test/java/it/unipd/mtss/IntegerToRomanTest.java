////////////////////////////////////////////////////////////////////
// Alberto Pignat 2111044
// Marco   Cossi  2113204
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class IntegerToRomanTest {

  @Test
  public void testConvert(){
    //test3
    //arrange
    int test1=1;
    int test2=2;
    int test3=3;
    
    //act
    String answer1=IntegerToRoman.convert(test1);
    String answer2=IntegerToRoman.convert(test2);
    String answer3=IntegerToRoman.convert(test3);

    //assert
    assertEquals("I", answer1);
    assertEquals("II", answer2);
    assertEquals("III", answer3);

    //test6
    //arrange
    int test4=4;
    int test5=5;
    int test6=6;
   
    //act
    String answer4=IntegerToRoman.convert(test4);
    String answer5=IntegerToRoman.convert(test5);
    String answer6=IntegerToRoman.convert(test6);

    //assert
    assertEquals("IV", answer4);
    assertEquals("V", answer5);
    assertEquals("VI", answer6);
    }
  
  @Test
    public void testIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(0));
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(7));
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(-1));
    }
}

