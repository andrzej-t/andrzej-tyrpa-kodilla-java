package com.kodilla.testing.forum.Statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCalculator;
import com.kodilla.testing.library.Book;
import com.kodilla.testing.library.BookLibrary;
import com.kodilla.testing.library.LibraryDatabase;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Test
    void testCalculateAdvStatisticsShowPosts() {

        // Given
        int posts = 3;
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(posts);

        // When
        double numberOfPosts = statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(3, numberOfPosts);
    }
}
