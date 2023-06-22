package io.turntabl.foundation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MostCommonTest {
    MostCommon underTest = new MostCommon(List.of(1,1,1,2,1,2, 3,3,3));
    MostCommon underTest2 = new MostCommon(List.of(1, 9, 3, 5, 4, 5, 9, 9, 7, 5));

    @Test
    public void testMostCommonElement() {
        int mostCommonElement = underTest.mostCommonElement1(List.of(1,1,1,2,2,2));
        assertEquals(2, mostCommonElement);
    }

//    @Test
//    public void testMultipleMostCommonElements(){
//        List<Integer> commonMultipleElements = underTest2.multipleMostCommonElements();
//        List<Integer> expectedOutput = List.of(5,9);
//        assertEquals(expectedOutput, commonMultipleElements);
//
//    }
}