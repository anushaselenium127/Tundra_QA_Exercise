
package com.dictionary.word.search;
import org.junit.Assert;
import com.dictionary.word.search.WordGenerator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WordGeneratorTest {

    @Test
    public void verifyWordsInDictionaryTest(){
       WordGenerator wordGeneratorTest = new WordGenerator();
       List<String> list = new ArrayList<>();
       Set<String> set = wordGeneratorTest.verifyWordsInDictionary("Test",list);
       Assert.assertEquals(set.size(),0);
    }

    @Test
    public void verifyWordsInDictionaryTest_1(){
        WordGenerator wordGeneratorTest = new WordGenerator();
        List<String> list = new ArrayList<>();
        list.add("abc");
        Set<String> set = wordGeneratorTest.verifyWordsInDictionary("Test",list);
        Assert.assertEquals(set.size(),0);
    }

    @Test
    public void verifyWordsInDictionaryTest_2(){
        WordGenerator wordGeneratorTest = new WordGenerator();
        List<String> list = new ArrayList<>();
        list.add("Test");
        Set<String> set = wordGeneratorTest.verifyWordsInDictionary("Test",list);
        Assert.assertEquals(set.size(),1);
    }
}
