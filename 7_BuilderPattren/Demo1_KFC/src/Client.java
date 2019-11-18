public class Client {
    public static void main(String[] args) throws Exception {
        try{
            Meal meal;
            MealBuilder mealBuilder;
            mealBuilder=(MealBuilder) XMLUtil.getBean();
            KFCWaiter kfcWaiter=new KFCWaiter();
            kfcWaiter.setMealBuilder(mealBuilder);
            meal=kfcWaiter.construct();

            System.out.println("套餐组成：");
            System.out.println(meal.getDrink());
            System.out.println(meal.getFood());


        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
