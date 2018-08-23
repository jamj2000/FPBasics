package es.fpbasics.servicioimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fpbasics.modelo.TablaActividadesFormativas;
import es.fpbasics.repositorio.RepositorioActividadesFormativas;
import es.fpbasics.servicio.ServicioActividadesFormativas;

@Service("servicioActividadesFormativas")
public class ServicioActividadesFormativasImpl implements ServicioActividadesFormativas {
	
	@Autowired
	RepositorioActividadesFormativas repositorioActividadesFormativas;

	
	public List<TablaActividadesFormativas> consultarTodosLosRegistrosDeLaTablaActividadesFormativas() {
		return this.repositorioActividadesFormativas.consultarTodosLosRegistrosDeLaTablaActividadesFormativas();
	}

	
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloque(
			Integer idActividad, String Empresa, Integer idBloque) {
		return this.repositorioActividadesFormativas.consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloque(idActividad, Empresa, idBloque);
	}

	
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorEmpresaEIdBloque(
			String Empresa, Integer idBloque) {
		return this.repositorioActividadesFormativas.consultarRegistrosDeLaTablaActividadesFormativasPorEmpresaEIdBloque(Empresa, idBloque);
	}

	
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloqueViaFormadores(
			Integer idFormador) {
		return this.repositorioActividadesFormativas.consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloqueViaFormadores(idFormador);
	}

	
	public void modificarRegistroDeLaTablaActividadesFormativas(TablaActividadesFormativas registro) {
		this.repositorioActividadesFormativas.modificarRegistroDeLaTablaActividadesFormativas(registro);
	}


	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasFiltrado(String filtro) {
		return this.repositorioActividadesFormativas.consultarRegistrosDeLaTablaActividadesFormativasFiltrado(filtro);

	}
	
	
}