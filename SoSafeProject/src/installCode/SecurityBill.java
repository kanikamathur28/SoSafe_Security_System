package installCode;
	import java.io.PrintWriter;
	import java.util.ArrayList;

	import sensorFactory.*;

	public class SecurityBill extends BillTemplate{
		
		@Override
		
		public void setPrice(){
			this.price = 20.0;
		};
	
		public void createBillFile(){
			try{

				this.writer = new PrintWriter("SecurityBill.txt", "UTF-8");

			}catch (Exception e) {
		        e.printStackTrace();
		        }
		};
		
		}



