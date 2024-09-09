import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class Receipt
{
	
	private double total = 0;
	private LocalDateTime dateNtime = LocalDateTime.now(); //
	private DateTimeFormatter template = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss"); 
	private String print = "=======================\n" + dateNtime.format(template)+ "\n\n"; //always initialized users reciept with date and time 
	
	public Receipt(ArrayList<Product> arrayList) 
  {//Takes in an arrayList and turns it into a string of products and prices
		String holder = arrayList.toString();
		for(Product x : arrayList) 
    {
			if(holder.contains(x.toString()) && !(this.print.contains(x.toString()))) 
      {
				 this.print += duplicateCounter(x,arrayList) + "X " + x.toString() + "\n"; 
				 this.total += duplicateCounter(x,arrayList) * x.price();
			}
		}
		this.print += String.format("=======================\n\nTotal: \t\t$%.2f",this.total);
	}
  
	public String printReciept() 
  { //Creates a file which stores users order and returns it as a string 
		try 
      {
			File recieptfile = new File("Receipt records.txt");
        
			if(!recieptfile.exists())
      { 
				recieptfile.createNewFile();
			}
        
			FileWriter writer = new FileWriter(recieptfile,true);
			writer.write(this.print + "\n=======================\n");
			writer.close();
        
		  } catch(IOException e) 
      {
			  System.out.println(e.getMessage());
		  }
		
		return this.print;
    
	}
	
	private int duplicateCounter(Product x,ArrayList<Product> arrayList) 
  {// check for duplicate items in an arrayList of products, then returns the amount of duplicates.
		int count = 0;
		for(Product a: arrayList) 
    {
			if(a.toString().equals(x.toString())) 
      {
				count++;
			}
		}
    
		return count;
	}
	
}
