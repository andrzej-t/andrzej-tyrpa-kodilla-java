package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String sample, com.kodilla.stream.beautifier.PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(sample);
        System.out.println(result);
    }
}
