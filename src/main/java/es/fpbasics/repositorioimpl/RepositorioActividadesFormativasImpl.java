package es.fpbasics.repositorioimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.fpbasics.mapper.ActividadFormativaMapper;
import es.fpbasics.modelo.TablaActividadesFormativas;
import es.fpbasics.repositorio.RepositorioActividadesFormativas;

@Repository
public class RepositorioActividadesFormativasImpl implements RepositorioActividadesFormativas{
	
	@Autowired
	private ActividadFormativaMapper mapper;
	

	public List<TablaActividadesFormativas> consultarTodosLosRegistrosDeLaTablaActividadesFormativas() {
		return this.mapper.consultarTodosLosRegistrosDeLaTablaActividadesFormativas();
	}

	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloque(
			Integer idActividad, String Empresa, Integer idBloque) {
		return this.mapper.consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloque(
				 idActividad, Empresa, idBloque);
	}

	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorEmpresaEIdBloque(
			String Empresa, Integer idBloque) {
		return this.mapper.consultarRegistrosDeLaTablaActividadesFormativasPorEmpresaEIdBloque(Empresa, idBloque);
	}

	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloqueViaFormadores(
			Integer idFormador) {
		return this.mapper.consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloqueViaFormadores(
				idFormador);
	}

	public void modificarRegistroDeLaTablaActividadesFormativas(TablaActividadesFormativas registro) {
		this.mapper.modificarRegistroDeLaTablaActividadesFormativas(registro);
	}

	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasFiltrado(String filtro) {
		filtro = ""+filtro+"%";
		return this.mapper.consultarRegistrosDeLaTablaActividadesFormativasFiltrado(filtro);
	}
	
	
}
