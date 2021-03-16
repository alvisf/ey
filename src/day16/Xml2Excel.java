package day16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xml2Excel {
	
	private static final int SUBSTANCE_NAME_COLUMN = 0;
	private static final int SUBSTANCE_ENTRY_FORCE_COLUMN = 0;
	private static final int SUBSTANCE_DIRECTIVE_COLUMN = 0;
	private static final int PRODUCT_NAME_COLUMN = 0;
	private static final int PRODUCT_CODE_COLUMN = 0;
	private static final int PRODUCT_MRL_COLUMN = 0;
	private static final int APPLICATION_DATE_COLUMN = 0;

	public static void main(String[] args) throws IOException {
		File xmlFile = File.createTempFile("substances", "tmp");
		String xmlFileUrl = "http://ec.europa.eu/food/plant/pesticides/eu-pesticides-database/public/?event=Execute.DownLoadXML&id=1";
		URL url = new URL(xmlFileUrl);
		System.out.println("downloading file from " + xmlFileUrl + " ...");
		FileUtils.copyURLToFile(url, xmlFile);
		System.out.println("downloading finished, parsing...");
		
		
		
		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFCellStyle style = workbook.createCellStyle();
		XSSFFont boldFont = workbook.createFont();
		boldFont.setBold(true);
		style.setFont(boldFont);
		
		XSSFSheet sheet = workbook.createSheet();
		int rowNum = 0;
		XSSFRow row = sheet.createRow(rowNum++);
		XSSFCell cell = row.createCell(SUBSTANCE_NAME_COLUMN);
		cell.setCellValue("Substance name");
		cell.setCellStyle(style);

		cell = row.createCell(SUBSTANCE_ENTRY_FORCE_COLUMN);
		cell.setCellValue("Substance entry_force");
		cell.setCellStyle(style);

		cell = row.createCell(SUBSTANCE_DIRECTIVE_COLUMN);
		cell.setCellValue("Substance directive");
		cell.setCellStyle(style);

		cell = row.createCell(PRODUCT_NAME_COLUMN);
		cell.setCellValue("Product name");
		cell.setCellStyle(style);

		cell = row.createCell(PRODUCT_CODE_COLUMN);
		cell.setCellValue("Product code");
		cell.setCellStyle(style);

		cell = row.createCell(PRODUCT_MRL_COLUMN);
		cell.setCellValue("MRL");
		cell.setCellStyle(style);

		cell = row.createCell(APPLICATION_DATE_COLUMN);
		cell.setCellValue("Application Date");
		cell.setCellStyle(style);
		
		FileOutputStream fileOut = new FileOutputStream("C:/Temp/Excel-Out.xlsx");
		workbook.write(fileOut);
		workbook.close();
		fileOut.close();
		
		if (xmlFile.exists()) {
		    System.out.println("delete file-> " + xmlFile.getAbsolutePath());
		    if (!xmlFile.delete()) {
		        System.out.println("file '" + xmlFile.getAbsolutePath() + "' was not deleted!");
		    }
		}
	}

}
