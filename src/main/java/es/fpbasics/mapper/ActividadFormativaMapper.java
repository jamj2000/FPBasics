package es.fpbasics.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import es.fpbasics.modelo.TablaActividadesFormativas;


public interface ActividadFormativaMapper {
	int modificarRegistroDeLaTablaActividadesFormativas(@Param("ActividadFormativa") TablaActividadesFormativas ActividadFormativa);
	List<TablaActividadesFormativas> consultarTodosLosRegistrosDeLaTablaActividadesFormativas();
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloque(@Param("idActividad")Integer idActividad,@Param("empresa") String Empresa,@Param("idBloque")Integer idBloque);
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorEmpresaEIdBloque(@Param("empresa") String Empresa,@Param("idBloque")Integer idBloque);
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloqueViaFormadores(@Param("idFormador") Integer idFormador);
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasFiltrado(@Param("filtro")String filtro);
}
