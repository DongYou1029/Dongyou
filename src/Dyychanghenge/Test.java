package Dyychanghenge;

public class Test { 
	 public static void main(String args[]) throws A{ 
	 Changhenge changhege; 
	 String b; 
	 b=""; 
	 try { 
	 changhege=new Changhenge(b); 
	 if (b=="") { 
	 throw new A("����������ַ�"); 
	 } 
	 else { 
	 System.out.print(changhege); 
	 } 
	 } 
	 catch(A r) { 
	 r.printStackTrace(); 
	 } 
	 finally { 
	 System.out.print("�������н���"); 
	 } 
	   } 
	 } 