package Prgrams;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class CSVWriter

{
	public void getNumbers()
	{
        PrintWriter pw = null;
        Random rand = new Random();
        
        try {
        	  
            pw = new PrintWriter(new File("NewData.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder builder = new StringBuilder();
        String columnNamesList = "Id,Favorite number";
        // No need give the headers Like: id, Name on builder.append
        builder.append(columnNamesList +"\n");
      //  builder.append("1"+",");
      //  builder.append("50");
    //    builder.append('\n');
        for (int i=1; i <= 1000;i++)
        {
        	int n = rand.nextInt(1000);
        	 builder.append(String.valueOf(i)+",");
             builder.append(String.valueOf(n));
             builder.append('\n'); 
        	
        	
        //	builder.append(String.valueOf(i) + String.valueOf(n));
        }
        	
        	
        	
        pw.write(builder.toString());
        pw.close();
        System.out.println("done!");
    }
}
