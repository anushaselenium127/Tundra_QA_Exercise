package com.dictionary.word.search;

import java.util.List;
import java.util.Set;

public class Dictionary {

    public static Set<String> isEnglishWord(String word){

        DictionaryUtil dictionaryUtil = new DictionaryUtil();
        List<String> dictionaryWordsList = dictionaryUtil.loadDictionaryFile();

        WordGenerator wordGenerator = new WordGenerator();
        return wordGenerator.verifyWordsInDictionary(word,dictionaryWordsList);
    }


}
