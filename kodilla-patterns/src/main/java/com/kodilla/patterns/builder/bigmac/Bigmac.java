package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    private final String bun;
    private final String burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        private String bun;
        private String burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(String burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            List<String> possibleIngredients = new ArrayList<>();
            possibleIngredients.add("bun with sesame");
            possibleIngredients.add("bun without sesame");
            possibleIngredients.add("one burger");
            possibleIngredients.add("two burgers");
            possibleIngredients.add("three burgers");
            possibleIngredients.add("standard sauce");
            possibleIngredients.add("BBQ sauce");
            possibleIngredients.add("Thousand Island dressing");
            possibleIngredients.add("Thousand Island dressing");
            possibleIngredients.add("lettuce");
            possibleIngredients.add("onion");
            possibleIngredients.add("beckon");
            possibleIngredients.add("cucumber");
            possibleIngredients.add("chili pepper");
            possibleIngredients.add("mushrooms");
            possibleIngredients.add("prawns");
            possibleIngredients.add("cheese");


            Bigmac bigmacIngredients = new Bigmac(bun, burgers, sauce, ingredients);

            int ingredientIndex = 0;
            for (int i=0; i<ingredients.size(); i++) {
                ingredientIndex = i;
            }

            if (possibleIngredients.contains(bigmacIngredients.getBun()) &&
            possibleIngredients.contains(bigmacIngredients.getBurgers()) &&
            possibleIngredients.contains(bigmacIngredients.getSauce()) &&
            possibleIngredients.contains(bigmacIngredients.getIngredients().get(ingredientIndex))) {
                return bigmacIngredients;
            } else {
                throw new IllegalStateException ("You can order ingredients only from the menu... Choose bun, how many burgers, sauce and burger toppings!");
            }
        }
    }

    private Bigmac(final String bun, final String burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public String getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
