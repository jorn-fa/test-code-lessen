package service.mapper;

import business.Getal;
import service.DTO.GetalDTO;
import common.service.AbstractMapper;



public class getalMapper extends AbstractMapper<Getal, GetalDTO> {

	@Override
	public GetalDTO mapToDTO(Getal b) {
		if (b==null) {return null;}
		GetalDTO dto = new GetalDTO();
		dto.setGetal(String.valueOf(b.getNumber()));
		return dto;
	}

	@Override
	public Getal mapToObj(GetalDTO d) {
		if(d==null) {return null;}
		
		Getal getal = new Getal();
		getal.setNumber(Integer.parseInt(d.getGetal()));
		
		return getal;
	}

}
