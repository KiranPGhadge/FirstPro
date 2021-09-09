import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfile2 {
	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
			String path="D:\\SeleniumExcel\\Sheet1.xlsx";
			FileInputStream f= new FileInputStream(path);
			String val=WorkbookFactory.create(f).getSheet("Group Q").getRow(i).getCell(j).getStringCellValue();
		    System.out.print(" "+val+" ");
		   // double val2=WorkbookFactory.create(f).getSheet("Group Q").getRow(i).getCell(j).getNumericCellValue();
		    //System.out.print(" "+val2+"");
		}
			System.out.println("");
		}	
		for(int i=4;i<=8;i++) {
			for(int j=5;j<=9;j++) {
			String path="D:\\SeleniumExcel\\Sheet1.xlsx";
			FileInputStream f= new FileInputStream(path);
			double val2=WorkbookFactory.create(f).getSheet("Group Q").getRow(i).getCell(j).getNumericCellValue();
		    System.out.print(" "+val2+" ");
		}
			System.out.println("");
		}	
	}
	

}
