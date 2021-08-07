    import java.net.*;  
    import java.io.*;  
    class  Server{ 
	
	public static String reverseString(String str){  
    char ch[]=str.toCharArray();  
    String rev="";  
    for(int i=ch.length-1;i>=0;i--){  
        rev+=ch[i];  
    }  
    return rev;  
	}
    public static void main(String args[])throws Exception{  
    ServerSocket ss=new ServerSocket(3333);  
    Socket s=ss.accept();  
    DataInputStream din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      
    String str=""; 
      
    str=din.readUTF();  
    String output =  reverseString(str);
  
    dout.writeUTF(output);  
    dout.flush();  
   

    din.close();  
    s.close();  
    ss.close();  
    }}  