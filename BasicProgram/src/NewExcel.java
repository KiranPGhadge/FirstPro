import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NewExcel {
	static String path = "D:\\SeleniumExcel\\Sheet1.xlsx";
	 static int m;
	public static void main(String[] args) throws IOException {
		 
		//int c;
		
		//m = WorkbookFactory.create(f1).getSheet("Group Q").getLastRowNum();
	    //c=WorkbookFactory.create(f1).getSheet("Group Q").getFirstRowNum();
	    
		FileInputStream f1 = new FileInputStream(path);
	    //System.out.println(c);
		m = WorkbookFactory.create(f1).getSheet("Group Q").getLastRowNum();
		 System.out.println("Last Count: "+m);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
        FileInputStream f = new FileInputStream(path);
        String val = WorkbookFactory.create(f).getSheet("Group Q").getRow(i).getCell(j).getStringCellValue();
				System.out.print(" " + val + " ");
				// double val2=WorkbookFactory.create(f).getSheet("Group
				// Q").getRow(i).getCell(j).getNumericCellValue();
				// System.out.print(" "+val2+"");
			}
			System.out.println("");
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
				FileInputStream f2 = new FileInputStream(path);
				String val = WorkbookFactory.create(f2).getSheet("Group Q").getRow(j).getCell(i).getStringCellValue();
				System.out.print(" " + val + " ");
				// double val2=WorkbookFactory.create(f).getSheet("Group
				// Q").getRow(i).getCell(j).getNumericCellValue();
				// System.out.print(" "+val2+"");
			}
			System.out.println("");
		}
	}

}
