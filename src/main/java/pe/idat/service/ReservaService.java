package pe.idat.service;

import java.util.List;

import pe.idat.dto.ReservaDTO;

public interface ReservaService {

	List<ReservaDTO> listar();
	void guardar(ReservaDTO reserva);
}

