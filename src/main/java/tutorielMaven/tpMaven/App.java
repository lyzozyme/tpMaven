package tutorielMaven.tpMaven;

import com.itextpdf.text.Document;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
    	int variableInutile;
    	int testCarre = 2;
    	int test=4;
    	int multiplieur = 2;
    	
    	if(testCarre < 8) {
    		testCarre = 7*multiplieur;
    	}
    	if(test<8) {
    		test = 7*multiplieur;
    	}
        System.out.println("Hello World!");
    }
    
    /**
     * code mort, cette méthode n'est pas utilisée dans le main
     * @param n
     * @return
     */    
    private static int carre2(int n)
    {
    	return n*n;
    }
}
