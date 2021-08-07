import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.FileWriter; 

// Nikhil Joshi 20711105 Haldwani Campus
 
public class CountWord
{  
    public static void main(String[] args) throws Exception {  
        String line;  
        int count = 0;  
        FileWriter fw=new FileWriter("Nikhil.txt");    
        fw.write("Welcome to file to count the words and display on console");   
        fw.close();  
        FileReader file = new FileReader("Nikhil.txt");  
        BufferedReader br = new BufferedReader(file);   
        while((line = br.readLine()) != null) {  
        System.out.println("Content Of file is- "+line);
        String[] wordList = line.split("\\s+");
        count += wordList.length;
        }  
  
        System.out.println("Number of words present in given file: " + count);  
        br.close(); 
        
    }  
}  