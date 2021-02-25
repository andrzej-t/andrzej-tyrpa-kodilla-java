package com.kodilla.testing.forum.Statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCalculator;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {

    @Mock
    private Statistics statisticsMock = mock(Statistics.class);

    @Test
    void testCalculateAdvStatisticsAveragePostForUserWhen0Posts() {

        // Given
        int posts = 0;
        int comments = 0;
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            names.add("name");
        }
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(names);

        // When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, statisticsCalculator.getAveragePostsForUser());
        assertEquals(0, statisticsCalculator.getAverageCommentsForUser());
        assertEquals(0, statisticsCalculator.getAverageCommentsForPost());

    }

    @Test
    void testCalculateAdvStatisticsAveragePostForUserWhen1000Posts() {

        // Given
        int posts = 1000;
        int comments = 2000;
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            names.add("name");
        }
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(names);

        // When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(100, statisticsCalculator.getAveragePostsForUser());
        assertEquals(200, statisticsCalculator.getAverageCommentsForUser());
        assertEquals(2, statisticsCalculator.getAverageCommentsForPost());
    }

    @Test
    void testCalculateAdvStatisticsAveragePostForUserWhen0Comments() {

        // Given
        int posts = 0;
        int comments = 0;
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            names.add("name");
        }
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(names);

        // When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, statisticsCalculator.getAveragePostsForUser());
        assertEquals(0, statisticsCalculator.getAverageCommentsForUser());
        assertEquals(0, statisticsCalculator.getAverageCommentsForPost());
    }

    @Test
    void testCalculateAdvStatisticsAveragePostForUserWhen0Users() {

        // Given
        int posts = 0;
        int comments = 0;
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            names.add("name");
        }
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(names);

        // When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, statisticsCalculator.getAveragePostsForUser());
        assertEquals(0, statisticsCalculator.getAverageCommentsForUser());
        assertEquals(0, statisticsCalculator.getAverageCommentsForPost());
    }

    @Test
    void testCalculateAdvStatisticsAveragePostForUserWhen100Users() {

        // Given
        int posts = 100;
        int comments = 100;
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            names.add("name");
        }
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(names);

        // When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(1, statisticsCalculator.getAveragePostsForUser());
        assertEquals(1, statisticsCalculator.getAverageCommentsForUser());
        assertEquals(1, statisticsCalculator.getAverageCommentsForPost());
    }

    @Test
    void testCalculateAdvStatisticsAveragePostForUserWhenCommentsMoreThanPosts() {

        // Given
        int posts = 10;
        int comments = 100;
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            names.add("name");
        }
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(names);

        // When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(1, statisticsCalculator.getAveragePostsForUser());
        assertEquals(10, statisticsCalculator.getAverageCommentsForUser());
        assertEquals(10, statisticsCalculator.getAverageCommentsForPost());
    }

    @Test
    void testCalculateAdvStatisticsAveragePostForUserWhenCommentsMoreLessPosts() {

        // Given
        int posts = 100;
        int comments = 10;
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            names.add("name");
        }
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(names);

        // When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(10, statisticsCalculator.getAveragePostsForUser());
        assertEquals(1, statisticsCalculator.getAverageCommentsForUser());
        assertEquals(0.1, statisticsCalculator.getAverageCommentsForPost());
    }

}
