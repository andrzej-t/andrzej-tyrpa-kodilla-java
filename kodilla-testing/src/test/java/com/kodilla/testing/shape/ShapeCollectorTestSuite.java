package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests."); }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("\nAll tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\nPreparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for methods with Interface type")

    class TestMethodsWithInterfaceType {
        @Test
        void testAddFigure() {
            //Given
            Square square = new Square(4);
            ArrayList<Shape> list = new ArrayList<>();
            //When
            list.add(square);
            //Then
            Assertions.assertTrue(list.add(square));
        }

        @Test
        void testRemoveFigure() {
            //Given
            Square square = new Square(4);
            ArrayList<Shape> list = new ArrayList();
            list.add(square);
            //When
            boolean result = list.remove(square);
            //Then
            Assertions.assertTrue(result);

        }

    }

    @Nested
    @DisplayName("Tests for non-interface type methods ")

    class TestMethodsWithOtherType {
        @Test
        void testGetFigure() {
            //Given
            Square square = new Square(5);
            Triangle triangle = new Triangle(4,5);
            ArrayList<Shape> list = new ArrayList<>();
            list.add(square);
            //When
            Shape retrievedShape = list.get(0);
            //Then
            Assertions.assertEquals(square,list.get(0));
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(5);
            ArrayList<Shape> list = new ArrayList<>();
            list.add(square);

            //When
            shapeCollector.showFigures();
            String expected = "Circle, Square, Triangle";
            //Then
            Assertions.assertEquals(expected, shapeCollector.showFigures());
        }
    }
}
