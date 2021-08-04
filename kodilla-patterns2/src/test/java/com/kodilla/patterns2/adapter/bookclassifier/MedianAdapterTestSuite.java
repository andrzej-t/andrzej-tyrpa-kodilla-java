package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

    //Given
    MedianAdapter medianAdapter = new MedianAdapter();
    Set<Book> bookSet = new HashSet<>();
    bookSet.add(new Book("Author1", "Title1", 1995, "2485"));
    bookSet.add(new Book("Author2", "Title2", 1894, "0481"));
    bookSet.add(new Book("Author3", "Title3", 1984, "1487"));
    bookSet.add(new Book("Author4", "Title4", 1985, "1687"));
    bookSet.add(new Book("Author5", "Title5", 1947, "1487"));

    //When
        int median = medianAdapter.publicationYearMedian(bookSet);

    //Then
        System.out.println(median);
        Assertions.assertEquals(1984, median);
    }

}
