package service.manager;


import service.DTO.ResultDTO;
import service.DTO.Term1DTO;
import service.DTO.Term2DTO;

public class AddManager {
	
	public ResultDTO add(Term1DTO term1Dto, Term2DTO term2dto) {
		
		ResultDTO r = new ResultDTO();
		r.setGetal(String.valueOf((Integer.parseInt(term1Dto.getGetal())+Integer.parseInt(term2dto.getGetal()))));
		return r;	
	
	}

}
