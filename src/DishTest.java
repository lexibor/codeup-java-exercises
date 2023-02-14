

public class DishTest
{
    //        Add a main method and inside the method...
    //        1) instantiate a Dish object and assign to a variable called dish1
    //    2) assign creative values for each of the properties
    //    3) test the printSummary() method by invoking it and checking if all instance values are correctly printed

    public static void main(String[] args)
    {
        Dish dish1 = new Dish();
        Dish dish2 = new Dish();

        dish1.nameOfDish = "Menudo";
        dish1.costInCents = 1000;
        dish1.wouldRecommend = true;

        dish2.nameOfDish = "Carne Asada";
        dish2.costInCents = 2000;
        dish2.wouldRecommend = true;

        dish1.printSummary();

        System.out.println(DishTools.shoutDishName(dish1));
        System.out.println(DishTools.analyzeDishCost(dish1));
        System.out.println(DishTools.flipRecommendation(dish1));

        System.out.println(Dish.moreExpensive(dish1, dish2));

    }

}
