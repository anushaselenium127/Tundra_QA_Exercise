package com.dictionary.word.search;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WordGenerator
{
    private static final Logger logger = LogManager.getLogger(WordGenerator.class);

    public Set<String> verifyWordsInDictionary(String word,List<String> dictionaryWordsList)
    {

        StringBuffer str = new StringBuffer(word);
        int n = str.length();
        WordGenerator wordGenerator = new WordGenerator();
        List<String> list =new ArrayList<String>();
        list = wordGenerator.permute(str.toString(), 0, n-1,list);
        Set<String> wordsList = new TreeSet<String>();
        DictionaryUtil dictionaryUtil = new DictionaryUtil();
        list.forEach(e->{
            wordGenerator.combineAndVerifyDict(e, new StringBuffer(), 0,wordsList,dictionaryWordsList);
        });
        logger.info("Final OutPut: "+wordsList.size());

        return wordsList;
    }


    private Set<String> combineAndVerifyDict(String instr, StringBuffer outstr, int index,
                                             Set<String> wordsList, List<String> dictionaryWordsList)
    {
        for (int i = index; i < instr.length(); i++)
        {
            outstr.append(instr.charAt(i));
            if(outstr.length()>1 && isWordMatchingInDictionary(outstr.toString(),dictionaryWordsList)) {
                wordsList.add(outstr.toString());
            }
            combineAndVerifyDict(instr, outstr, i + 1,wordsList,dictionaryWordsList);
            outstr.deleteCharAt(outstr.length() - 1);
        }
        return wordsList;
    }





    private List<String> permute(String str, int l, int r,List<String> list)
    {
    if (l == r) {
            list.add(str);
        }else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r,list);
                str = swap(str,l,i);
            }
        }

        return list;
    }

    private String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public boolean isWordMatchingInDictionary(String word,List<String> dictionaryList){
        return dictionaryList.contains(word);
    }

}





