package pe.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import pe.idat.modelo.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer>{

}
