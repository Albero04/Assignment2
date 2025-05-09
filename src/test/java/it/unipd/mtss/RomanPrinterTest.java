////////////////////////////////////////////////////////////////////
// Alberto Pignat 2111044
// Marco   Cossi  2113204
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanPrinterTest {

  @Test
  public void testPrint(){
    //test3
    //arrange
    int test1=1;
    int test2=2;
    int test3=3;

    
    //act
    String answer1=RomanPrinter.print(test1);
    String answer2=RomanPrinter.print(test2);
    String answer3=RomanPrinter.print(test3);

    
    //assert
    assertEquals("  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n", answer1);
    assertEquals("  _____   _____ \n |_   _| |_   _|\n   | |     | |  \n   | |     | |  \n  _| |_   _| |_ \n |_____| |_____|\n", answer2);
    assertEquals("  _____   _____   _____ \n |_   _| |_   _| |_   _|\n   | |     | |     | |  \n   | |     | |     | |  \n  _| |_   _| |_   _| |_ \n |_____| |_____| |_____|\n", answer3);
    
    //test6
    //arrange
    int test4=4;
    int test5=5;
    int test6=6;

    
    //act
    String answer4=RomanPrinter.print(test4);
    String answer5=RomanPrinter.print(test5);
    String answer6=RomanPrinter.print(test6);

    //assert
    assertEquals("  _____  __      __\n |_   _| \\ \\    / /\n   | |    \\ \\  / / \n   | |     \\ \\/ /  \n  _| |_     \\  /   \n |_____|     \\/    \n", answer4);
    assertEquals(" __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n", answer5);
    assertEquals(" __      __  _____ \n \\ \\    / / |_   _|\n  \\ \\  / /    | |  \n   \\ \\/ /     | |  \n    \\  /     _| |_ \n     \\/     |_____|\n", answer6);
    
    //test10
    //arrange
    int test7=7;
    int test8=8;
    int test9=9;
    int test10=10;
    
    //act
    String answer7=RomanPrinter.print(test7);
    String answer8=RomanPrinter.print(test8);
    String answer9=RomanPrinter.print(test9);
    String answer10=RomanPrinter.print(test10);
    
    //assert
    assertEquals(" __      __  _____   _____ \n \\ \\    / / |_   _| |_   _|\n  \\ \\  / /    | |     | |  \n   \\ \\/ /     | |     | |  \n    \\  /     _| |_   _| |_ \n     \\/     |_____| |_____|\n", answer7);
    assertEquals(" __      __  _____   _____   _____ \n \\ \\    / / |_   _| |_   _| |_   _|\n  \\ \\  / /    | |     | |     | |  \n   \\ \\/ /     | |     | |     | |  \n    \\  /     _| |_   _| |_   _| |_ \n     \\/     |_____| |_____| |_____|\n", answer8);
    assertEquals("  _____  __   __\n |_   _| \\ \\ / /\n   | |    \\ V / \n   | |     > <  \n  _| |_   / . \\ \n |_____| /_/ \\_\\\n", answer9);
    assertEquals(" __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n", answer10);
    
    //test20
    //arrange
    int test15=15;
    int test19=19;
    int test20=20;

    
    //act
    String answer15=RomanPrinter.print(test15);
    String answer19=RomanPrinter.print(test19);
    String answer20=RomanPrinter.print(test20);

    
    //assert
    assertEquals(" __   __ __      __\n \\ \\ / / \\ \\    / /\n  \\ V /   \\ \\  / / \n   > <     \\ \\/ /  \n  / . \\     \\  /   \n /_/ \\_\\     \\/    \n", answer15);
    assertEquals(" __   __  _____  __   __\n \\ \\ / / |_   _| \\ \\ / /\n  \\ V /    | |    \\ V / \n   > <     | |     > <  \n  / . \\   _| |_   / . \\ \n /_/ \\_\\ |_____| /_/ \\_\\\n", answer19);
    assertEquals(" __   __ __   __\n \\ \\ / / \\ \\ / /\n  \\ V /   \\ V / \n   > <     > <  \n  / . \\   / . \\ \n /_/ \\_\\ /_/ \\_\\\n", answer20);
    
    //test50
    //arrange
    int test39=39;
    int test40=40;
    int test44=44;
    int test50=50;

    
    //act
    String answer39=RomanPrinter.print(test39);
    String answer40=RomanPrinter.print(test40);
    String answer44=RomanPrinter.print(test44);
    String answer50=RomanPrinter.print(test50);
    
    //assert
    assertEquals(" __   __ __   __ __   __  _____  __   __\n \\ \\ / / \\ \\ / / \\ \\ / / |_   _| \\ \\ / /\n  \\ V /   \\ V /   \\ V /    | |    \\ V / \n   > <     > <     > <     | |     > <  \n  / . \\   / . \\   / . \\   _| |_   / . \\ \n /_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____| /_/ \\_\\\n", answer39);
    assertEquals(" __   __  _      \n \\ \\ / / | |     \n  \\ V /  | |     \n   > <   | |     \n  / . \\  | |____ \n /_/ \\_\\ |______|\n", answer40);
    assertEquals(" __   __  _        _____  __      __\n \\ \\ / / | |      |_   _| \\ \\    / /\n  \\ V /  | |        | |    \\ \\  / / \n   > <   | |        | |     \\ \\/ /  \n  / . \\  | |____   _| |_     \\  /   \n /_/ \\_\\ |______| |_____|     \\/    \n", answer44);
    assertEquals("  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n", answer50);
    
    //test100
    //arrange
    int test69=69;
    int test74=74;
    int test89=89;
    int test94=94;
    int test100=100;

    
    //act
    String answer69=RomanPrinter.print(test69);
    String answer74=RomanPrinter.print(test74);
    String answer89=RomanPrinter.print(test89);
    String answer94=RomanPrinter.print(test94);
    String answer100=RomanPrinter.print(test100);
    
    //assert
    assertEquals("  _       __   __  _____  __   __\n | |      \\ \\ / / |_   _| \\ \\ / /\n | |       \\ V /    | |    \\ V / \n | |        > <     | |     > <  \n | |____   / . \\   _| |_   / . \\ \n |______| /_/ \\_\\ |_____| /_/ \\_\\\n", answer69);
    assertEquals("  _       __   __ __   __  _____  __      __\n | |      \\ \\ / / \\ \\ / / |_   _| \\ \\    / /\n | |       \\ V /   \\ V /    | |    \\ \\  / / \n | |        > <     > <     | |     \\ \\/ /  \n | |____   / . \\   / . \\   _| |_     \\  /   \n |______| /_/ \\_\\ /_/ \\_\\ |_____|     \\/    \n", answer74);
    assertEquals("  _       __   __ __   __ __   __  _____  __   __\n | |      \\ \\ / / \\ \\ / / \\ \\ / / |_   _| \\ \\ / /\n | |       \\ V /   \\ V /   \\ V /    | |    \\ V / \n | |        > <     > <     > <     | |     > <  \n | |____   / . \\   / . \\   / . \\   _| |_   / . \\ \n |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____| /_/ \\_\\\n", answer89);
    assertEquals(" __   __   _____   _____  __      __\n \\ \\ / /  / ____| |_   _| \\ \\    / /\n  \\ V /  | |        | |    \\ \\  / / \n   > <   | |        | |     \\ \\/ /  \n  / . \\  | |____   _| |_     \\  /   \n /_/ \\_\\  \\_____| |_____|     \\/    \n", answer94);
    assertEquals("   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|\n", answer100);
    
    //test500
    //arrange
    int test200=200;
    int test300=300;
    int test400=400;
    int test500=500;
    
    //act
    String answer200=RomanPrinter.print(test200);
    String answer300=RomanPrinter.print(test300);
    String answer400=RomanPrinter.print(test400);
    String answer500=RomanPrinter.print(test500);
    
    //assert
    assertEquals("   _____    _____ \n  / ____|  / ____|\n | |      | |     \n | |      | |     \n | |____  | |____ \n  \\_____|  \\_____|\n", answer200);
    assertEquals("   _____    _____    _____ \n  / ____|  / ____|  / ____|\n | |      | |      | |     \n | |      | |      | |     \n | |____  | |____  | |____ \n  \\_____|  \\_____|  \\_____|\n", answer300);
    assertEquals("   _____   _____  \n  / ____| |  __ \\ \n | |      | |  | |\n | |      | |  | |\n | |____  | |__| |\n  \\_____| |_____/ \n", answer400);
    assertEquals("  _____  \n |  __ \\ \n | |  | |\n | |  | |\n | |__| |\n |_____/ \n", answer500);
    
    //test1000
    //arrange
    int test600=600;
    int test700=700;
    int test800=800;
    int test900=900;
    int test999=999;
    int test1000=1000;
    
    //act
    String answer600=RomanPrinter.print(test600);
    String answer700=RomanPrinter.print(test700);
    String answer800=RomanPrinter.print(test800);
    String answer900=RomanPrinter.print(test900);
    String answer999=RomanPrinter.print(test999);
    String answer1000=RomanPrinter.print(test1000);
    //assert
    
    assertEquals("  _____     _____ \n |  __ \\   / ____|\n | |  | | | |     \n | |  | | | |     \n | |__| | | |____ \n |_____/   \\_____|\n", answer600);
    assertEquals("  _____     _____    _____ \n |  __ \\   / ____|  / ____|\n | |  | | | |      | |     \n | |  | | | |      | |     \n | |__| | | |____  | |____ \n |_____/   \\_____|  \\_____|\n", answer700);
    assertEquals("  _____     _____    _____    _____ \n |  __ \\   / ____|  / ____|  / ____|\n | |  | | | |      | |      | |     \n | |  | | | |      | |      | |     \n | |__| | | |____  | |____  | |____ \n |_____/   \\_____|  \\_____|  \\_____|\n", answer800);
    assertEquals("   _____   __  __ \n  / ____| |  \\/  |\n | |      | \\  / |\n | |      | |\\/| |\n | |____  | |  | |\n  \\_____| |_|  |_|\n", answer900);
    assertEquals("   _____   __  __  __   __   _____   _____  __   __\n  / ____| |  \\/  | \\ \\ / /  / ____| |_   _| \\ \\ / /\n | |      | \\  / |  \\ V /  | |        | |    \\ V / \n | |      | |\\/| |   > <   | |        | |     > <  \n | |____  | |  | |  / . \\  | |____   _| |_   / . \\ \n  \\_____| |_|  |_| /_/ \\_\\  \\_____| |_____| /_/ \\_\\\n", answer999);
    assertEquals("  __  __ \n |  \\/  |\n | \\  / |\n | |\\/| |\n | |  | |\n |_|  |_|\n", answer1000);
 
 
  }
  @Test
    public void testIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(0));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(1001));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(-1));
    }
  
}
