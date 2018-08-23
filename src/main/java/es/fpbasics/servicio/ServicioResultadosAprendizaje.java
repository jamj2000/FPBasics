package es.fpbasics.servicio;

import java.util.List;

import es.fpbasics.modelo.TablaResultadosAprendizaje;


public interface ServicioResultadosAprendizaje {

	List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje ();
	
	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados (Integer idModulo,Integer idResultado);
	
	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo (Integer idModulo);
	
	void modificarRegistroDeLaTablaResultadosAprendizaje(TablaResultadosAprendizaje registro);
	
	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajeFiltrado(String filtro);

}