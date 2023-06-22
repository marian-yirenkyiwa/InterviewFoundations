package io.turntabl.foundation;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class CharacterCountTest {
    CharacterCount underTest = new CharacterCount(List.of('a', 'e', 'i', 'o', 'u', 'e'));

    @Test
    public void testTotalCountOfCharacters() {
//        List<Character> listOfChar = underTest.getListOfCharacters();


        assertEquals(5, underTest.totalCountOfCharacters().size());
    }
}