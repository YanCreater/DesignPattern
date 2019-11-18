public class SubMealBuilderB extends MealBuilder {
    public void buildFood(){
        meal.setFood("套餐B主食");
        System.out.println("套餐B主食");
    }
    public void buildDrink(){
        meal.setDrink("套餐B饮料");
        System.out.println("套餐B饮料");
    }
}
