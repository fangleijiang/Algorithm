package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GetFile {
	
	public static String getFile() throws IOException{
		String url = "H:\\b.txt";
		String result="";  
		  FileReader fileReader=null;  
		  BufferedReader bufferedReader=null;  
		  try{  
		   fileReader=new FileReader(url);  
		   bufferedReader=new BufferedReader(fileReader);  
		   try{  
		    String read=null;  
		    while((read=bufferedReader.readLine())!=null ){  
		     result=result+read;  
		    }  
		   }catch(Exception e){  
		    e.printStackTrace();  
		   }  
		  }catch(Exception e){  
		   e.printStackTrace();  
		  }finally{  
		   if(bufferedReader!=null){  
		    bufferedReader.close();  
		   }  
		   if(fileReader!=null){  
		    fileReader.close();  
		   }  
		  }  
		  return result;  
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(getFile());
	}

}
