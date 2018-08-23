package es.fpbasics.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import es.fpbasics.modelo.TablaFormadores;
import es.fpbasics.modelo.TablaResultadosAprendizaje;

public interface FormadorMapper {

	public int modificarRegistroDeLaTablaFormadores(@Param("formador")TablaFormadores registro);

	public List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores();

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormador(@Param("idFormador")Integer idFormador) ;

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormadorViaActividadesFormativas(@Param("idActividad")Integer idActividad, @Param("idEmpresa") Integer idEmpresa, @Param("idBloque") Integer idBloque) ;
	
	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresFiltrado(@Param("filtro")String filtro);

}