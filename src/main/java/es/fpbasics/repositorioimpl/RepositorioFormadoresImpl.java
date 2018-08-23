package es.fpbasics.repositorioimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.fpbasics.mapper.FormadorMapper;
import es.fpbasics.modelo.TablaFormadores;
import es.fpbasics.repositorio.RepositorioFormadores;

@Repository
public class RepositorioFormadoresImpl implements RepositorioFormadores {

	@Autowired
	private FormadorMapper mapper;


	public List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores() {
		return this.mapper.consultarTodosLosRegistrosDeLaTablaFormadores();
	}

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormador(Integer idFormador) {
		return this.mapper.consultarRegistrosDeLaTablaFormadoresPorIdFormador(idFormador);
	}

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormadorViaActividadesFormativas(
			Integer idActividad, Integer idEmpresa, Integer idBloque) {
		return this.mapper.consultarRegistrosDeLaTablaFormadoresPorIdFormadorViaActividadesFormativas(
				 idActividad,  idEmpresa,  idBloque);
	}

	public void modificarRegistroDeLaTablaFormadores(TablaFormadores registro) {
		this.mapper.modificarRegistroDeLaTablaFormadores(registro);
	}

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresFiltrado(String filtro) {
		filtro = ""+filtro+"%";
		return 	this.mapper.consultarRegistrosDeLaTablaFormadoresFiltrado(filtro);

	}

	

}
