
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class FoodMain {

	public static void main(String[] args) {
		Map<Food,List<Review>> map = new HashMap<>();
		
		TreeSet<Food> food = new TreeSet<>();
		
		Food f1 = new Food("Dosa", 80, "Veg");
		Food f2 = new Food("Chicken Briyani", 120, "Non Veg");
		Food f3 = new Food("Idli", 50, "Veg");
		Food f4 = new Food("Paneer Sandwich", 55, "Veg");
		Food f5 = new Food("Egg Sandwich", 65, "Non Veg");
		
		food.add(f1);
		food.add(f2);
		food.add(f3);
		food.add(f4);
		food.add(f5);
		
		
		List<Review> revList1 = new ArrayList<>();
		
		Review r1A = new Review("", 3, "Satisfied");
		Review r1B = new Review("B", 4, "Very Good");
		Review r1C = new Review("C", 2, "Not Good ");
		
		revList1.add(r1A);
		revList1.add(r1B);
		revList1.add(r1C);
		map.put(f1, revList1);
		
		
		List<Review> revList2 = new ArrayList<>();
		List<Review> revList3 = new ArrayList<>();
		List<Review> revList4 = new ArrayList<>();
		List<Review> revList5 = new ArrayList<>();
		
		
		
		Review r2 = new Review(null, 4, "Very Good");
		Review r3 = new Review("fgh", 2, "Not Good ");
		Review r4 = new Review("kjj", 4, "Very Good");
		Review r5 = new Review("osj", 5, "Excellent");
		
		
		revList2.add(r2);
		revList3.add(r3);
		revList4.add(r4);
		revList5.add(r5);
		
		
		map.put(f2, revList2);
		map.put(f3, revList3);
		map.put(f4, revList4);
		map.put(f5, revList5);
		
		for(Map.Entry<Food,List<Review>> entry : map.entrySet())
		{
			 Food key = entry.getKey();
			 List<Review> value = entry.getValue();
			 
			 System.out.println("-------"+ key.getFoodName()+"-------");
			 System.out.println("Price rs. "+key.getCost());
			 System.out.println("Category "+key.getCategory());
			  
			 System.out.println(" --- Reviews --- ");
			 for (Review review : value) {
				 
			 try {
				 if(review.checkUser() == true) {
					for(int i=0;i<review.getPoints();i++)
					{
						System.out.print("*");
					}
					
					 System.out.print(review.getComments());
					 System.out.print("\n");
				 }
			 }
			 catch(Exception e) {
				 System.out.println("User not Found!");
			 }
		
			 
		}
			
		
	}
}
		
}
