package com.dictionary.word.search.main;

import com.dictionary.word.search.Dictionary;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Set;

public class SearchDictionaryMain {
    private static final Logger logger = LogManager.getLogger(SearchDictionaryMain.class);
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Set<String> finalwords = dictionary.isEnglishWord("WORKING"); //change word here
        System.out.println("Final OutPut: "+finalwords);
    }
}
