package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderAllData 
{
	public void readAllData() throws IOException
		{
	String path = System.getProperty("user.dir")+"\\Test_case.xlsx";

			File file = new File(path);

//			to perform Read operation we have to use file input stream class

			FileInputStream fis = new FileInputStream(file);

//			To locate the workbook

			XSSFWorkbook wb = new XSSFWorkbook(fis);

//			To locate the sheet

			XSSFSheet sh1 = wb.getSheetAt(0);

			int rowcount = sh1.getLastRowNum()+1;

			System.out.println("Total number of rows "+ rowcount);

			int columncount = sh1.getRow(1).getLastCellNum();
		
			System.out.println("Total number of columns are "+columncount);


			for(int i=0; i<rowcount; i++)
			{
				for(int j=0; j<columncount; j++)
				{
					String data= sh1.getRow(i).getCell(j).getStringCellValue();
					
					System.out.println(data);
					}
			}
		}
					
	           
					
            
public static void main(String[] args) throws IOException 
{

ExcelReaderAllData er = new ExcelReaderAllData();

er.readAllData();
}

//	WAP to print the data from Excel sheet same as they appear in excel

}