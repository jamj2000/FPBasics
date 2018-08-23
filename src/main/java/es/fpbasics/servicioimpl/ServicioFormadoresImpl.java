package es.fpbasics.servicioimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fpbasics.modelo.TablaFormadores;
import es.fpbasics.repositorio.RepositorioFormadores;
import es.fpbasics.servicio.ServicioFormadores;

@Service("servicioFormadores")
public class ServicioFormadoresImpl implements ServicioFormadores {
	
	@Autowired
	RepositorioFormadores repositorioTablaFormadores;

	public List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores() {
		return this.repositorioTablaFormadores.consultarTodosLosRegistrosDeLaTablaFormadores();
	}

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormador(Integer idFormador) {
		return this.repositorioTablaFormadores.consultarRegistrosDeLaTablaFormadoresPorIdFormador(idFormador);
	}

	public void modificarRegistroDeLaTablaFormadores(TablaFormadores registro) {
		this.repositorioTablaFormadores.modificarRegistroDeLaTablaFormadores(registro);;
	}

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresFiltrado(String filtro) {
		return this.repositorioTablaFormadores.consultarRegistrosDeLaTablaFormadoresFiltrado(filtro);

	}

}
