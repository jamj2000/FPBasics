package es.fpbasics.servicioimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fpbasics.modelo.TablaModulos;
import es.fpbasics.repositorio.RepositorioModulos;
import es.fpbasics.servicio.ServicioModulos;
import es.fpbasics.vistas.BotonModificarModulosVista;



@Service("servicioModulos")
public class ServicioModulosImpl implements ServicioModulos {
	
	@Autowired
	RepositorioModulos repositorioModulos;
	
	public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos() {
		return repositorioModulos.consultarTodosLosRegistrosDeLaTablaModulos();
	}

	public TablaModulos consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo) {
		return this.repositorioModulos.consultarRegistrosDeLaTablaModulosPorIdModulo(idModulo);
	}
	
	public boolean modificarRegistroDeLaTablaModulos(BotonModificarModulosVista registro) {
		return this.repositorioModulos.modificarRegistroDeLaTablaModulos(registro);		
	}

	public List<TablaModulos> consultarRegistrosDeLaTablaModulosFiltrado(String filtro) {
		return this.repositorioModulos.consultarRegistrosDeLaTablaModulosFiltrado(filtro);

	}
	

}
