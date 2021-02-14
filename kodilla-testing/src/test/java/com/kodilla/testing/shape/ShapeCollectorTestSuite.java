package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;

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
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(4);
            Circle circle = new Circle(7);
            //When
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);
            //Then
            Assertions.assertEquals(2, shapeCollector.list.size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(4);
            Circle circle = new Circle(4);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);
            //When
            shapeCollector.removeFigure(square);
            //Then
            Assertions.assertEquals(1, shapeCollector.list.size());
        }

    }

    @Nested
    @DisplayName("Tests for non-interface type methods ")

    class TestMethodsWithOtherType {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(4);
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(square, shapeCollector.getFigure(0));

        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(9);
            Square square = new Square(4);
            Triangle triangle = new Triangle(4,7);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            //When
            shapeCollector.showFigures();
            String expected = "Circle, Square, Triangle";
            //Then
            Assertions.assertEquals(expected, shapeCollector.showFigures());
        }
    }
}
