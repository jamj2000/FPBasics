package es.fpbasics.repositorio;

import java.util.List;

import es.fpbasics.modelo.TablaFormadores;
import es.fpbasics.modelo.TablaResultadosAprendizaje;


public interface RepositorioFormadores {
	public List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores();

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormador(Integer idFormador) ;

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormadorViaActividadesFormativas(Integer idActividad,  Integer idEmpresa, Integer idBloque) ;
	
	void modificarRegistroDeLaTablaFormadores(TablaFormadores registro);
	
	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresFiltrado(String filtro);

}
