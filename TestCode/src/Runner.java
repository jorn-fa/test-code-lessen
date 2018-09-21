import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import service.DTO.Term1DTO;
import service.DTO.Term2DTO;
import service.manager.AddManager;

public class Runner {
	
	private static String read() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
	

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		
		Term1DTO dtoEen = new Term1DTO();
		System.out.print("?");
		dtoEen.setGetal(read());
		Term2DTO dto2 = new Term2DTO();
		System.out.print("?");
		dto2.setGetal(read());
		
		AddManager addManager = new AddManager();	
		
		System.out.println(addManager.add(dtoEen, dto2));	
		
		System.out.println("test 2");
		

	}

}
