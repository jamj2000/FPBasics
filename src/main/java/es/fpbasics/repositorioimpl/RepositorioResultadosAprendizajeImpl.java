package es.fpbasics.repositorioimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.fpbasics.mapper.ResultadoAprendizajeMapper;
import es.fpbasics.modelo.TablaResultadosAprendizaje;
import es.fpbasics.repositorio.RepositorioResultadosAprendizaje;

@Repository
public class RepositorioResultadosAprendizajeImpl implements RepositorioResultadosAprendizaje {
	
	@Autowired
	private ResultadoAprendizajeMapper mapper;
	
	
	public List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje() {
		return this.mapper.consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje();
	}

	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados(
			Integer idModulo,Integer idResultado) {
		return this.mapper.consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados(idModulo,idResultado);
	}

	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo(
			Integer idModulo) {
		return this.mapper.consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo(idModulo);

	}

	public void modificarRegistroDeLaTablaResultadosAprendizaje(TablaResultadosAprendizaje registro) {
		this.mapper.modificarRegistroDeLaTablaResultadosAprendizaje(registro);
		
	}

	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajeFiltrado(String filtro) {
		filtro = ""+filtro+"%";
		return this.mapper.consultarRegistrosDeLaTablaResultadoAprendizajeFiltrado(filtro);

	}
	
}
