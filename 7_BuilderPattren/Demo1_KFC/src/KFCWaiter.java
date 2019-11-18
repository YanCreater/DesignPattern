public class KFCWaiter {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }
    public Meal construct(){
        mealBuilder.buildDrink();
        mealBuilder.buildFood();
        return mealBuilder.getMeal();
    }
}
