package es.fpbasics.servicioimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fpbasics.modelo.TablaResultadosAprendizaje;
import es.fpbasics.repositorio.RepositorioResultadosAprendizaje;
import es.fpbasics.servicio.ServicioResultadosAprendizaje;

@Service("servicioResultadosAprendizaje")
public class ServicioResultadosAprendizajeImpl implements ServicioResultadosAprendizaje {

	@Autowired
	RepositorioResultadosAprendizaje repositorioTablaResultadosAprendizaje;


	public List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje() {
		return this.repositorioTablaResultadosAprendizaje.consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje();
	}


	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados(
			Integer idModulo, Integer idResultado) {
		return this.repositorioTablaResultadosAprendizaje.consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados(idModulo, idResultado);
	}


	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo(
			Integer idModulo) {
		return this.repositorioTablaResultadosAprendizaje.consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo(idModulo);
	}


	public void modificarRegistroDeLaTablaResultadosAprendizaje(TablaResultadosAprendizaje registro) {
		this.repositorioTablaResultadosAprendizaje.modificarRegistroDeLaTablaResultadosAprendizaje(registro);
	}


	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajeFiltrado(String filtro) {
		return this.repositorioTablaResultadosAprendizaje.consultarRegistrosDeLaTablaResultadoAprendizajeFiltrado(filtro);

	}
	
}

