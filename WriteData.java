package Prgrams;
	import java.io.FileWriter;
	import java.io.BufferedWriter;
	
public class WriteData {
	private FileWriter fw;
	private BufferedWriter bw;
	
	public WriteData (){

	try {
		fw = new FileWriter("ExampleOutput.txt");
	}catch (Exception e) {
		System.out.println("ERROR OCCURED:" + e.toString());
	}
}
	public void outputSingleLine(String userInput) {
		bw = new BufferedWriter(fw);
		
		try {
			bw.write(userInput);
			bw.close();
		}catch (Exception e) {
			System.out.println("Write out error (or close error):" + e.toString());
			
		}
	}
}
