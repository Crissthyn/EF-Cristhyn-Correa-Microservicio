package pe.idat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.modelo.Reserva;


import pe.idat.dto.ReservaDTO;
import pe.idat.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	private ReservaRepository repository;
	
	@Override
	public List<ReservaDTO> listar() {
        List<ReservaDTO> listadto = new ArrayList<>();
        ReservaDTO dto = null;

        for (Reserva reserva : repository.findAll()) {
            dto = new ReservaDTO();
            dto.setCod(reserva.getIdReserva());
            dto.setCost(reserva.getCosto());
            listadto.add(dto);
        }


        return listadto;
	}

	@Override
	public void guardar(ReservaDTO reserva) {
        Reserva res = new Reserva();
        res.setIdReserva(reserva.getCod());
        res.setCosto(reserva.getCost());

        repository.save(res);
	}

}
