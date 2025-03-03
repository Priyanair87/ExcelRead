package excel;

import java.io.IOException;

public class ExcelMain {

		// TODO Auto-generated method stub
		
		
		public static void main(String[] args) throws IOException {



			String name =Excel.readStringData(1,0);  // row and coloumn(name)



			System.out.println("Name :"+ "\t"+name);



			String id= Excel.readIntegerData(1, 1); // row and coloumn(ID)



			System.out.println("id :"+"\t"+ id);



			}

	}



	

