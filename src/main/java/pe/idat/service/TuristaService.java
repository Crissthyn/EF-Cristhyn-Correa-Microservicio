package pe.idat.service;

import java.util.List;

import pe.idat.dto.TuristaDTO;

public interface TuristaService {

	List<TuristaDTO> listar();
	void guardar(TuristaDTO turista);
}
