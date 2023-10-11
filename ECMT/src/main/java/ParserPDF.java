import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ParserPDF {

    public static void pdfParser(String fileLocation) throws Exception {
        
        File file = new File(fileLocation);
        
        PDDocument document;
        try {
            document = Loader.loadPDF(file);
            PDFTextStripper s = new PDFTextStripper();
            String content = s.getText(document);
            
            System.out.println(content);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
