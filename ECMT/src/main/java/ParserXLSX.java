import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ParserXLSX {

    public static void xlsxParser(String fileLocation) throws Exception {

        FileInputStream file = new FileInputStream(new File(fileLocation));
        Workbook workbook = new XSSFWorkbook(file);

        // Sheet sheet = workbook.getSheetAt(0);

        for (Sheet sheet : workbook) {

            for (Row row : sheet) {
                for (Cell cell : row) {

                    switch (cell.getCellType()) {
                    case org.apache.poi.xssf.usermodel.XSSFCell.CELL_TYPE_STRING:
                        System.out.print(cell.getRichStringCellValue().getString() + " ");
                        break;

                    case org.apache.poi.xssf.usermodel.XSSFCell.CELL_TYPE_NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            System.out.print(cell.getDateCellValue() + " ");
                        } else {
                            System.out.print(cell.getNumericCellValue() + " ");
                        }
                        break;
                    }
                }
                System.out.println();
            }
        }
    }
}
