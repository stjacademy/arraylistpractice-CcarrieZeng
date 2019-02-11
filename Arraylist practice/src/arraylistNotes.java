import java.util.ArrayList;

public class arraylistNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> band = new ArrayList<String>();

	    band.add("Lindsey");
	  	band.add("Mick");
		band.add("Stevie");
		band.add("Peter");
		band.remove(3);
		band.add(2, "Christine");

		System.out.println(band);
	
	

}
}