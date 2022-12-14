package pe.idat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.dto.HospedajeDTO;

import pe.idat.modelo.Hospedaje;
import pe.idat.repository.HospedajeRepository;

@Service
public class HospedajeServiceImpl implements HospedajeService {

	@Autowired
	private HospedajeRepository repository;
	
	@Override
	public List<HospedajeDTO> listar() {
		List<HospedajeDTO> listadto = new ArrayList<>();
		HospedajeDTO dto = null;
		
		List<Hospedaje> lista = repository.findAll();
		for (Hospedaje hospedaje : lista) {
			dto = new HospedajeDTO();
			dto.setNom(hospedaje.getNombre());
			dto.setCod(hospedaje.getIdHospedaje());
			listadto.add(dto);
		}
		return listadto;
	}

	@Override
	public void guardar(HospedajeDTO hospedaje) {
		  Hospedaje hos = new Hospedaje();
	        hos.setNombre(hospedaje.getNom());
	        hos.setIdHospedaje(hospedaje.getCod());
	        
	        repository.save(hos);
	}

}
