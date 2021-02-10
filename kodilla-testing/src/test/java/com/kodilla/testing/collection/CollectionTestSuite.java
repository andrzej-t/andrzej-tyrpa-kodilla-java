package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When list is empty, then method displays nothing")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        List<Integer> numbers = new ArrayList<>(Collections.emptyList());

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        Assertions.assertEquals(numbers,result);
    }

    @DisplayName("When list contains odd and even numbers, " +
            "then method should return new list with only even numbers."
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7));
        List<Integer> expectedNumbers = new ArrayList<>(Arrays.asList(2,4,6));

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        Assertions.assertEquals(expectedNumbers,result);
    }
}
