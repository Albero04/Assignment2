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


    //test10
    //arrange
    int test7=7;
    int test8=8;
    int test9=9;
    int test10=10;
    
    //act
    String answer7=IntegerToRoman.convert(test7);
    String answer8=IntegerToRoman.convert(test8);
    String answer9=IntegerToRoman.convert(test9);
    String answer10=IntegerToRoman.convert(test10);
    
    //assert
    assertEquals("VII", answer7);
    assertEquals("VIII", answer8);
    assertEquals("IX", answer9);
    assertEquals("X", answer10);


    //test20
    //arrange
    int test15=15;
    int test19=19;
    int test20=20;
    
    //act
    String answer15=IntegerToRoman.convert(test15);
    String answer19=IntegerToRoman.convert(test19);
    String answer20=IntegerToRoman.convert(test20);
    
    //assert
    assertEquals("XV", answer15);
    assertEquals("XIX", answer19);
    assertEquals("XX", answer20);


    //test50
    //arrange
    int test39=39;
    int test40=40;
    int test44=44;
    int test50=50;
    
    //act
    String answer39=IntegerToRoman.convert(test39);
    String answer40=IntegerToRoman.convert(test40);
    String answer44=IntegerToRoman.convert(test44);
    String answer50=IntegerToRoman.convert(test50);
    
    //assert
    assertEquals("XXXIX", answer39);
    assertEquals("XL", answer40);
    assertEquals("XLIV", answer44);
    assertEquals("L", answer50);


    //test100
    //arrange
    int test69=69;
    int test74=74;
    int test89=89;
    int test94=94;
    int test100=100;

    //act
    String answer69=IntegerToRoman.convert(test69);
    String answer74=IntegerToRoman.convert(test74);
    String answer89=IntegerToRoman.convert(test89);
    String answer94=IntegerToRoman.convert(test94);
    String answer100=IntegerToRoman.convert(test100);
    
    //assert
    assertEquals("LXIX", answer69);
    assertEquals("LXXIV", answer74);
    assertEquals("LXXXIX", answer89);
    assertEquals("XCIV", answer94);
    assertEquals("C", answer100);


    //test500
    //arrange
    int test200=200;
    int test300=300;
    int test400=400;
    int test500=500;
    
    //act
    String answer200=IntegerToRoman.convert(test200);
    String answer300=IntegerToRoman.convert(test300);
    String answer400=IntegerToRoman.convert(test400);
    String answer500=IntegerToRoman.convert(test500);
    
    //assert
    assertEquals("CC", answer200);
    assertEquals("CCC", answer300);
    assertEquals("CD", answer400);
    assertEquals("D", answer500);
    }
  
  @Test
    public void testIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(0));
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(501));
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(-1));
    }
}

