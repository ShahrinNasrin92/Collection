package Collection;

import java.util.Random;
//import java.util.Calendar;
import java.util.Date;
//import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;                               

public class Main {

	public static void main(String[] args) 
	{
		String name = "123";
		double cgpa=3.06;
				int x=Integer.parseInt(name);
				//int x=Integer.valueOf(name);
	System.out.println(x);
	String cg=Double.toString(cgpa);
	System.out.println(cg);
	
	//System.out.println(java.time.LocalDate.now());
	
	//For date
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy ");
	Date date = new Date();
	System.out.println(dateFormat.format(date));
	
	//For Time
	LocalTime time= LocalTime.now();
	DateTimeFormatter tf =  DateTimeFormatter.ofPattern("hh:mm:ss");
	System.out.println(time.format(tf));

	// System.out.println( new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
	
	//For Random numbers
	Random rand = new Random();
    // Obtain a number between [0 - 49].
	int n = rand.nextInt(50);
    System.out.println(n);

    System.out.println("The array Details is:");
    String[] arr=Student.studentArray;
    
    boolean empty=arr[1].isEmpty();
    
   // String space= arr[1].trim().toLowerCase();
    String space= arr[1].trim().toUpperCase();
   
    //boolean check= space.startsWith("rif");
    boolean check= space.startsWith("RIF");
   
    for(int i=0;i<Student.studentArray.length;i++)
    {
    	
    	System.out.println(arr[i]);
    }
    
    if(check){
    	System.out.println(Student.studentArray[1].trim());	
    }
    else {
    	System.out.println("Not validated");
    }
	
	 if(!empty){
	    	System.out.println(Student.studentArray[1].trim());	
	    }
	    else {
	    	System.out.println("Empty");
	    	}
	 
	 int a= arr[4].indexOf("E");
	  System.out.println(a);
	  
	 // String y=arr[4].replace('E','S');
	  String y=arr[4].replace("CSE","EEE");
	  System.out.println("Replaces:" +y);
	  
	  //Ternary Operation
	  int e=10;
	  
	  String b=(e==10)? "10 TK" : "No money";
	  System.out.println("The value of b is" +b);
	  
	    }	
}