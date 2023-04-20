
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		
	}

}
