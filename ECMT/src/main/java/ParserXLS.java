
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ParserXLS {

    private static String inputFileName = "src/main/resources/DefaultConnectionList.xls";
    
    public static void xlsParser(String fileLocation) throws Exception {
        
        HSSFWorkbook wb = readWorkbook(fileLocation);
        
        HSSFSheet sheet= wb.getSheetAt(0);
        Integer rowsNumber = 0;
        rowsNumber = sheet.getLastRowNum();
        
        HSSFRow row;
        HSSFCell cell;
        
        for( int i = 0; i <= rowsNumber; i++) {
            row = sheet.getRow(i);
            
            for(int j = 0; j < row.getLastCellNum(); j++) {
                cell = row.getCell(j);
                System.out.println(cell);
            }
            System.out.println();
        }
    }
    
    public static HSSFWorkbook readWorkbook(String fileLocation) throws Exception {

        File file = new File(fileLocation);
        
        FileInputStream fileInputStream = new FileInputStream(file);
        POIFSFileSystem fs = new POIFSFileSystem(fileInputStream);
        HSSFWorkbook wb = new HSSFWorkbook(fs);
        return wb;
    }
}
