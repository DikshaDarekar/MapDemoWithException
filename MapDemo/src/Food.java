


public class Food implements Comparable<Food>{
	
	private String foodName;
	private int cost;
	private String category;
	

	public Food(String foodName, int cost, String category) {
		super();
		this.foodName = foodName;
		this.cost = cost;
		this.category = category;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", cost=" + cost + ", category=" + category + "]";
	}

	@Override
	public int compareTo(Food food) {
		// TODO Auto-generated method stub
		return this.cost-food.cost;
	}

	
	
		
}
