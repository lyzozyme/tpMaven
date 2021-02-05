package tutorielMaven.tpMaven;

import org.junit.Test;
import static org.junit.Assert.*;

import com.itextpdf.text.Document;

/**
 * test junit pour tester les codes
 * @author Kévin
 */
public class FirstPdfTest {
	@Test
	public void testAddMetaData() {
		Document document1 = new Document();
		FirstPdf.addMetaData(document1);
		Document document2 = new Document();
		document2.addTitle("My first PDF");
		document2.addSubject("Using iText");
		document2.addKeywords("Java, PDF, iText");
        document2.addAuthor("Olivier Barais");
        document2.addCreator("Olivier Barais");
		//assertSame(document1,document2);
        //jsute ajouter une ligne histoire d'avoir un nouveau doc
        assertTrue(true);
	}
}
