package es.fpbasics.repositorio;

import java.util.List;

import es.fpbasics.modelo.TablaModulos;
import es.fpbasics.vistas.BotonModificarModulosVista;


public interface RepositorioModulos {


	List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();
	
	TablaModulos consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo);
	
	boolean modificarRegistroDeLaTablaModulos(BotonModificarModulosVista registro);
	
	 List<TablaModulos> consultarRegistrosDeLaTablaModulosFiltrado(String filtro);
	
}
