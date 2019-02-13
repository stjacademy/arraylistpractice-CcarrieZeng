import java.util.ArrayList;

public class arraylistminilab {

	public static void main(String[] args) {
		
		ArrayList<Integer>testing=new ArrayList<Integer>();
		testing.add(2);
		testing.add(2);
		testing.add(1);
		testing.add(50);
		testing.add(80);

		System.out.println(getListOfFactors(762));
		keepOnlyCompositeNumbers(testing);

	}
	 public static ArrayList<Integer> getListOfFactors(int number)
	  {  
		 ArrayList<Integer>factor=new ArrayList<Integer>();
		 for(int i=1;i<=number;i++) {
			if(number%i==0) {
				factor.add(i);
			} 
			factor.remove(Integer.valueOf(1));
			factor.remove(Integer.valueOf(number));
		 }
		 
		 return factor;
	  }
	 
	  public static void keepOnlyCompositeNumbers( ArrayList<Integer> nums )
	  {
		  for(int i=0;i<nums.size();i++) {
			  int num=nums.get(i);
			  if(getListOfFactors(num).size()<=0) {
				  nums.remove(i);
				  i--;
			  }
				 
		  }
		 System.out.println(nums);
		  }
	  }


