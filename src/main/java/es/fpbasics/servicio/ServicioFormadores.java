package es.fpbasics.servicio;

import java.util.List;

import es.fpbasics.modelo.TablaFormadores;
import es.fpbasics.modelo.TablaModulos;

public interface ServicioFormadores {
	
	List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores();
	
	List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormador(Integer idFormador);
	
	void modificarRegistroDeLaTablaFormadores(TablaFormadores registro);
	
	List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresFiltrado(String filtro);

}