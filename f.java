
package data_s_ass1;
import java.io.*; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;
import java.io.FileReader;
public class f{ 
	

	public static /*String*/void   DivideInputFileIntoRuns (String Inputfilename, int runSize) {
		
		 String[]  array = new String[666];
			String d;
		 File y ;
	    try { 
	    	for(int i=1;i<=(64/runSize);i++) {
	    		 
	    		String f1 ="file"+i;
	    		File myObj = File.createTempFile(f1,".txt",new File("C:\\AMD"));
	    		
	    		y=myObj;
	    		
	    		d=y.toString();
	    	
	    		
	    		
	    		array[i]=d ;
	    		 
	    		System.out.print(array[i]+"\n");
	    		
	    		
	      if (myObj.createNewFile()) {  
	        System.out.println("File created: " + myObj.getName());  
	      }
 
	    }
		}
	    
	    catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();  
	    }
	    			//return array ;																																			return Arrays[]; 
	  }
	
	public static void  SortEachRunOnMemoryAndWriteItBack (int runSize) throws FileNotFoundException, IOException 
	{ 
		String line=null;
		String inputfile = "C:\\AMD\\Data.txt";
		 try (BufferedReader br = new BufferedReader(new FileReader(inputfile))) {
			// read the content from file		`	`
			try(FileReader fileReader = new FileReader("C:\\AMD\\Data.txt")) {

				String fileName = "data.txt";
	
				// write the content in file 
				 FileWriter fileWriter = new FileWriter("C:\\AMD\\file13676511105027459671.txt");	
					for(int ii=0;ii<64/runSize;ii++) {
					   for(int i=0;i<runSize;i++) {
					         line = br.readLine();
							{
								System.out.print(line+"    ");
								
							    fileWriter.write(line+"\r\n");
							  
							}
	
				}
							fileWriter.close();


				}
					fileReader.close();
					
				}
			}				
	}
		 
	
		
	
		/*
	        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
	  
	        Arrays.sort(arr); 
	  
	        System.out.printf("Modified arr[] : %s", 
	                          Arrays.toString(arr)); 
	    
	}
	
	*/
		
  public static void main(String[]args) throws FileNotFoundException, IOException {
	 String  array [] = null;
/*	 for(int i=0;i<12;i++) {*/
	/*array[i]=*/DivideInputFileIntoRuns ("Data.txt", 12);
	// }
   SortEachRunOnMemoryAndWriteItBack(12);
  }
  }
