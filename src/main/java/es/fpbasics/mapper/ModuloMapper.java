package es.fpbasics.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import es.fpbasics.modelo.TablaModulos;
import es.fpbasics.vistas.BotonModificarModulosVista;


public interface ModuloMapper {

	public boolean modificarRegistroDeLaTablaModulos(@Param("modulo")BotonModificarModulosVista registro);	
	
	public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();

	public TablaModulos consultarRegistrosDeLaTablaModulosPorIdModulo(@Param("idModulo")Integer idModulo) ;

	public List<TablaModulos> consultarRegistrosDeLaTablaModuloFiltrado(@Param("filtro")String filtro);
}
