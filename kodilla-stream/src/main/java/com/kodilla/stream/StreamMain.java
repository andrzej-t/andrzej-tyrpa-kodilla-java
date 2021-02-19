package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Sample text", sample -> sample + " ABC");
        poemBeautifier.beautify("Sample text", sample -> "ABC " + sample);
        poemBeautifier.beautify("Sample text", sample -> sample.toUpperCase());
        poemBeautifier.beautify ("SAMPLE TEXT", sample -> sample.toLowerCase());
        poemBeautifier.beautify("Sample text ", sample -> sample.repeat(2));
        poemBeautifier.beautify("SAmple text ", sample -> sample.replace("A","a"));
        poemBeautifier.beautify("    Sample text", sample -> sample.trim());

    }
}
