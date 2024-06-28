/*package realtimeprogram;

import java.io.File;
import java.io.FileInputStream;


public class HandleExcelsheet 
{
	public static void main(String[] args) 
	{
	String path =("user.dir")+"\\demo.xlsx\\";
        
    File file =new File(path);
    
   FileInputStream fis= new FileInputStream(file);
  
   XSSFWorkbook wb = new XSSFWorkbook(fis);

//	To locate the sheet

	XSSFSheet sh1 = wb.getSheetAt(0);
    
    int rowcount = sheet.getLastRowNum();
    
    int columncount=sheet.getRow(rowcount).getLastCellNum();
   
		
	}

}
*/