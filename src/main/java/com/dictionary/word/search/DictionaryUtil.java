package com.dictionary.word.search;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DictionaryUtil {

    private static final Logger LOGGER = LogManager.getLogger(DictionaryUtil.class);
    public List<String> loadDictionaryFile() {
        List<String> list = null;
        URI uri = null;

        try {
            uri = ClassLoader.getSystemResource("dictionary.txt").toURI();
        } catch (URISyntaxException e) {
            LOGGER.error("Failed to load file.", e);
        }

        try (Stream<String> lines = Files.lines(Paths.get(uri))) {
            list = lines.collect(Collectors.toList());
        } catch (IOException e) {
            LOGGER.error("Failed to load file.", e);
        }
        return list;
    }



}
