import java.util.ArrayList;
import java.util.List;

public class Candy {
	 public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		 int max=-1;
         for(int i=0; i<candies.length; i++){
             if(candies[i]>max){
                 max=candies[i];
             }
         }
	        List<Boolean> candy = new ArrayList<>();
	        for(int i=0; i<candies.length; i++){
	            if (candies[i]+extraCandies<max)
					candy.add(false);
				else
					candy.add(true);
	        }
	        return candy;
	  }
}
