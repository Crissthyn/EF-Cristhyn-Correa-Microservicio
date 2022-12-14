package pe.idat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.modelo.Turista;

import pe.idat.dto.TuristaDTO;
import pe.idat.repository.TuristaRepository;

@Service
public class TuristaServiceImpl implements TuristaService {

	
	@Autowired
	private TuristaRepository repository;
	
	@Override
	public List<TuristaDTO> listar() {
        List<TuristaDTO> listadto = new ArrayList<>();
        TuristaDTO dto = null;

        for (Turista turista : repository.findAll()) {
            dto = new TuristaDTO();
            dto.setCod(turista.getIdTurista());
            dto.setNomt(turista.getNombreTurista());
            dto.setNum(turista.getNroTurista());
            dto.setDire(turista.getDireccion());
            listadto.add(dto);
        }


        return listadto;
	}

	@Override
	public void guardar(TuristaDTO turista) {
        Turista tur = new Turista();
        tur.setIdTurista(turista.getCod());
        tur.setNombreTurista(turista.getNomt());
        tur.setNroTurista(turista.getNum());
        tur.setDireccion(turista.getDire());

        repository.save(tur);

	}

}
