package installCode;
import java.io.PrintWriter;
import java.util.ArrayList;

import sensorFactory.*;

public class FireBill extends BillTemplate{
	
	@Override

	public void setPrice(){
		this.price = 10.0;
	};

	public void createBillFile(){
		try{

			this.writer = new PrintWriter("FireBill.txt", "UTF-8");

		}catch (Exception e) {
	        e.printStackTrace();
	        }
	};
	
	

}
