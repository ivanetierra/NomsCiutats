import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class fase3 {

	public static void main(String[] args) {
		
		String a, b, c, d, e, f;
		
		System.out.println("Enter 6 cities: ");
		ArrayList<String> ciutats = new ArrayList<String>();
		ArrayList<String> ciutatsModificades = new ArrayList<String>();
		
		Scanner scanA = new Scanner (System.in); 
        a = (scanA.nextLine()).toLowerCase();
        Scanner scanB = new Scanner (System.in); 
        b = (scanB.nextLine()).toLowerCase();
        Scanner scanC = new Scanner (System.in); 
        c = (scanC.nextLine()).toLowerCase();
        Scanner scanD = new Scanner (System.in); 
        d = (scanD.nextLine()).toLowerCase();
        Scanner scanE = new Scanner (System.in); 
        e = (scanE.nextLine()).toLowerCase();
        Scanner scanF = new Scanner (System.in); 
        f = (scanF.nextLine()).toLowerCase();
        
        ciutats.add(a);ciutats.add(b);ciutats.add(c);ciutats.add(d);ciutats.add(e);ciutats.add(f);
        
        for (String i : ciutats) {
        	for(int j=0; j<i.length(); j++) {
        		if(i.charAt(j)=='a') {
        			i=i.replace("a","4");
        		}
        	}
        	ciutatsModificades.add(i);
        }
        
        
        Collections.sort(ciutatsModificades);
        
        System.out.println(ciutatsModificades);

	}

}
