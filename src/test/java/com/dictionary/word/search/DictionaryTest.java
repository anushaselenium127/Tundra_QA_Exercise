package com.dictionary.word.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class DictionaryTest {
    @Test
    public void isEnglishWordTest(){
        Dictionary dictionary = new Dictionary();
        Set<String> set = dictionary.isEnglishWord("ABC");
        Assert.assertNotNull(set);
    }

    @Test
    public void isEnglishWordTest_1(){
        Dictionary dictionary = new Dictionary();
        Set<String> set = dictionary.isEnglishWord("Test");
        Assert.assertNotNull(set);
    }
}
