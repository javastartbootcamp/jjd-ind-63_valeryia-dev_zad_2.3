package pl.javastart.task;

public class Main {
    public static void main(String[] args) {

        Ingredient ing1 = new Ingredient();
        ing1.ingName= "woda";
        ing1.ingVolume= 150;

        Ingredient ing2 = new Ingredient();
        ing2.ingName= "sok cytrynowy";
        ing2.ingVolume= 10;

        Ingredient ing3 = new Ingredient();
        ing3.ingName= "wódka";
        ing3.ingVolume= 50;

        int drinkVolume = ing1.ingVolume+ ing2.ingVolume + ing3.ingVolume;
        Drink drink1 = new Drink();
        drink1.name= "Mojito";
        drink1.price= 13f;
        drink1.alkohol= true;

        drink1.ing1 = ing1;
        drink1.ing2 = ing2;
        drink1.ing3 = ing3;
    System.out.printf("Drink: %s\nCena: %.1fzł\nCzy zawiera alkohol?:%b\nSkładniki:\n%s\n%s\n%s\nPojemność: %dmł",
                drink1.name,drink1.price,drink1.alkohol,drink1.ing1.ingName,drink1.ing2.ingName,drink1.ing3.ingName,drinkVolume);



    }
}
