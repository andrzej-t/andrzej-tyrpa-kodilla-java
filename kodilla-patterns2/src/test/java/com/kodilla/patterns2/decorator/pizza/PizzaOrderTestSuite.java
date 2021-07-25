package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.crust.FatCrustDecorator;
import com.kodilla.patterns2.decorator.pizza.sauce.GarlicSauceDecorator;
import com.kodilla.patterns2.decorator.pizza.size.FamilySizeDecorator;
import com.kodilla.patterns2.decorator.pizza.toppings.MushroomsDecorator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testFamilyPizzaWithSauceFatCrustAndToppingsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new FamilySizeDecorator(theOrder);
        theOrder = new GarlicSauceDecorator(theOrder);
        theOrder = new FatCrustDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35), theCost);
    }

    @Test
    public void testFamilyPizzaWithSauceFatCrustAndToppingsDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new FamilySizeDecorator(theOrder);
        theOrder = new GarlicSauceDecorator(theOrder);
        theOrder = new FatCrustDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Standard pizza with cheese and tomato sauce  + family size (50cm) + garlic sauce + fat crust + mushrooms", description);
    }
}
