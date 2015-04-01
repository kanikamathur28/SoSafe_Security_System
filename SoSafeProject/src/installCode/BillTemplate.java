package installCode;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

import sensorFactory.Sensor;

public abstract class BillTemplate {
	public Customer.CustBuilder cust;
	public ArrayList<Sensor> list;
	public Double TotalCost;
	public Double price;
	public PrintWriter writer;
	public final Double taxRate = 8.7;
	
	public final void setLayout(ArrayList<Sensor> roomlist){
		this.list = roomlist;
	}
	public final void setCustomer(Customer.CustBuilder cust){
		this.cust = cust;
	}
	public abstract void setPrice();
	public final void calculateTotalCost(){
		this.TotalCost = list.size() * price * (1+taxRate/100);
	}
	public abstract void createBillFile();
	public final void printCustomerInfo(){
		writer.println("\t\t *****ALARM BILL *****\n");
		writer.println("CUSTOMER INFORMATION\n");
		writer.println("Contract Id: "+cust.getContractId());
		writer.println("Name: "+cust.getFirstName()+" "+cust.getLastName());
		writer.println("Address: "+cust.getAddress());
		writer.println("Email: "+cust.getEmail());
		writer.println("Emergency Contact1: "+cust.getEmgrPhone1());
		writer.println("Emergency Contact2: "+cust.getEmgrPhone2());
		writer.println("Start Date: "+cust.getStartDate());
		writer.println("End Date: "+cust.getEndDate());
	}
	public final void printLayout(){
		writer.println("\nROOMS COVERED BY ALARM: ");
		for(int i=0;i<list.size();i++){
			writer.print(list.get(i).getSensorID()+",");
		}
		writer.println();
	}
	public final void printPrice(){
		writer.println("\n=============");
		writer.println("\n\nPrice Per Sensor:"+price);
	};

	public final void printTotalCost(){
		writer.println("\n=============");
		writer.println("TOTAL: "+TotalCost);
	}
	public final void genBill(){
		setPrice();
		calculateTotalCost();
		createBillFile();
		printCustomerInfo();
		printLayout();
		printPrice();
		printTotalCost();
		writer.close();
		
	}
}
