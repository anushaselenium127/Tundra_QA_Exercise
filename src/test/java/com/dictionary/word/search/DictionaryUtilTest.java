package com.dictionary.word.search;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Set;

public class DictionaryUtilTest {

    @Test
    public void isEnglishWordTest(){
        DictionaryUtil dictionaryUtil = new DictionaryUtil();
        List<String> list = dictionaryUtil.loadDictionaryFile();
        Assert.assertNotNull(list);
    }


}
