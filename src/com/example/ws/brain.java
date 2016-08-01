package com.example.ws;
import java.io.*; 

public class brain
{ 
public String getImage(String image)
{ 
try 
{ 
	Process proc = Runtime.getRuntime().exec(new String[] { "/bin/bash",  "-c", "cd ~/Desktop ; export PATH=$PATH:/Users/apple/Desktop/NBIS_SOFTWARE/bin ; mindtct ~/Desktop/nbis/mindtct/bin/sample_image.wsq ~/Desktop/nbis/bozorth3/bin/output1;mindtct ~/Desktop/nbis/mindtct/bin/sample_image.wsq ~/Desktop/nbis/bozorth3/bin/output2; cd ~/Desktop/nbis/bozorth3/bin; bozorth3 output1.xyt output2.xyt"}); // for MacOS 
	BufferedReader reader=new BufferedReader(new InputStreamReader(proc.getInputStream())); 
	String line=reader.readLine(); 
	while(line!=null) 
	{ 
	System.out.println(line); 
	return line; 
	
	} 
	
	//return line;
	
	} 
catch(IOException e1) {} 

	return null;
//System.out.println("Done"); 
} 
} 