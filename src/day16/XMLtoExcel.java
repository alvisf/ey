package day16;


import java.net.URL;

import EasyXLS.*;


public class XMLtoExcel {
	

    
    
    
    public static void main(String[] args) {
    
    	 try {
             System.out.println("Tutorial 41");
             System.out.println("----------");

             // Create an instance of the class used to import/export Excel files
             ExcelDocument workbook = new ExcelDocument();

             // Import XML Spreadsheet file
             System.out.println("Reading file C:\\Samples\\Tutorial32.xml.");
             FileInputStream file = new FileInputStream("C:\\Samples\\Tutorial32.xml");
             if (workbook.easy_LoadXMLSpreadsheetFile(file))
             {
                 // Get the table of data from the second sheet and add some data in cells (optional step)
                 ExcelTable xlsTable = ((ExcelWorksheet)workbook.easy_getSheetAt(1)).easy_getExcelTable();
                 xlsTable.easy_getCell("A1").setValue("Data added by Tutorial41");

                 for (int column=0; column<5; column++)
                 {
                     xlsTable.easy_getCell(1, column).setValue("Data " + (column + 1));
                 }

                 // Export Excel file
                 System.out.println("Writing file C:\\Samples\\Tutorial41 - convert XML spreadsheet to Excel.xlsx.");
                 workbook.easy_WriteXLSXFile("C:\\Samples\\Tutorial41 - convert XML spreadsheet to Excel.xlsx");

                 // Confirm conversion of XML Spreadsheet to Excel
                 if (workbook.easy_getError().equals(""))
                     System.out.println("File successfully created.");
                 else
                     System.out.println("Error encountered: " + workbook.easy_getError());
             }
             
             // Dispose memory
             workbook.Dispose();
         }
         catch (Exception ex) {
             ex.printStackTrace();
         }
    
    }
    }