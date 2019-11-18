public class SubMealBuilderA extends MealBuilder {
    public void buildFood(){
        meal.setFood("套餐A主食");
        System.out.println("套餐A主食");
    }
    public void buildDrink(){
        meal.setDrink("套餐A饮料");
        System.out.println("套餐A饮料");
    }
}
