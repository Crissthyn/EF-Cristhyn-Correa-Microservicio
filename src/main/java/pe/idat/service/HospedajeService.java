package pe.idat.service;

import java.util.List;


import pe.idat.dto.HospedajeDTO;

public interface HospedajeService {

	List<HospedajeDTO> listar();
	void guardar(HospedajeDTO hospedaje);
}
