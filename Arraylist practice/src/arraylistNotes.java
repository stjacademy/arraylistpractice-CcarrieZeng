import java.util.ArrayList;

public class arraylistNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<String> band = new ArrayList<String>(); 
		nums.add(2);
		nums.add(3);
		nums.add(5);
		nums.add(7);
		nums.add(11);
		nums.add(13);
		nums.add(17);
		nums.add(19);
		nums.add(0,nums.remove(nums.size()-1)) ; 
	
		System.out.println (nums); 


		
}
}