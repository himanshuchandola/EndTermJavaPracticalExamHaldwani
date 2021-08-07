import java.io.FileWriter;    
import java.io.IOException;   
import java.io.File;   
import java.io.BufferedReader;  
import java.io.FileReader;  
public class Countword {
  public static void main(String[] args) {
	  
	String line;  
    int count = 0;  
	File file = new File("kamleshsingh.txt");    
	boolean result;  
	try   
	{  
	result = file.createNewFile();  //creates a new file  
	if(result)        
	{  
	System.out.println("file created "+file.getCanonicalPath());   
	}  
	else  
	{  
	System.out.println("File already exist at location: "+file.getCanonicalPath());  
	}  
	}   
		catch (IOException e)   
	{  
	e.printStackTrace();     
	} 
		
		
		
    try {
      FileWriter myWriter = new FileWriter("kamleshsingh.txt");
	  String s = "Kamlesh singh stduent id  : 20561023 , university rollno : 2098007";
      myWriter.write(s);
      myWriter.close();
      System.out.println("Successfully wrote to the file.\nFile content is: "+s);
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
	
	
	
	try  
	{  
	 
	FileReader fr=new FileReader(file);    
	BufferedReader br=new BufferedReader(fr);     
	StringBuffer sb=new StringBuffer();      

	while((line=br.readLine())!=null)  
	{  
	String words[] = line.split(" ");      
    count = count + words.length;  
	}  
	fr.close();    //closes the stream and release the resources  
  
	System.out.println("Number of words present in given file: " + count);    
}  
catch(IOException e)  
{  
e.printStackTrace();  
}  
 
	
	
  }
}
