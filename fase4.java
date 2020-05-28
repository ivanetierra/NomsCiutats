import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class fase4{

	public static void main(String[] args) {
		
		String a, b, c, d, e, f;
		
		System.out.println("Enter 6 cities: ");
		ArrayList<String> ciutats = new ArrayList<String>();
		
		
		Scanner scanA = new Scanner (System.in); 
        a = (scanA.nextLine());
        
        Scanner scanB = new Scanner (System.in); 
        b = (scanB.nextLine());
        
        Scanner scanC = new Scanner (System.in); 
        c = (scanC.nextLine());
        
        Scanner scanD = new Scanner (System.in); 
        d = (scanD.nextLine());
		
        Scanner scanE = new Scanner (System.in); 
        e = (scanE.nextLine());
        
        Scanner scanF = new Scanner (System.in); 
        f = (scanF.nextLine());
        
        
        ciutats.add(a);ciutats.add(b);ciutats.add(c);ciutats.add(d);ciutats.add(e);ciutats.add(f);
        
        
        
        ArrayList<String[]> ciutats2 = new ArrayList<String[]>();
        
        for (String i: ciutats) {
        	 String[] provisional = new String[i.length()];
        	 
        	for(int j=(i.length()-1); j>=0; j--) {
        		provisional[i.length()-1-j]=Character.toString(i.charAt(j));
        		}	
        	ciutats2.add(provisional);
        }
        
    	
        for(String[] i : ciutats2) {
        	String resultado = "";
        	for(String j : i) {
        		resultado = resultado + j;
        	}
        	
        	System.out.println(resultado);
        }
        
        

	}

}