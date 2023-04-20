import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cityName[] = {"Delhi","Kanpur","Lucknow","Mau","Varanasi"};
		ArrayList<String> cityList = new ArrayList<String>(Arrays.asList(cityName));
		//List<String> al = Arrays.asList(cityName);
		cityList.add("Allahabad");
		cityList.add("Gorakhpur");
//		Iterator<String> it = cityList.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}

		for(String city : cityList)
		{
			System.out.println(city);
		}
	}

}
