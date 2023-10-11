import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class App {

    public static void main(String[] args) {
        
        /*ParserPDF parserPDF = new ParserPDF();
        try {
            parserPDF.pdfParser("src/main/resources/first.pdf");
            
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        /*ParserXLS test = new ParserXLS();
        try {
            test.xlsParser("src/main/resources/DefaultConnectionList.xls");
            
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        ParserXLSX parserXLSX = new ParserXLSX();
        
        try {
            parserXLSX.xlsxParser("src/main/resources/ilovepdf_first.xlsx");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
