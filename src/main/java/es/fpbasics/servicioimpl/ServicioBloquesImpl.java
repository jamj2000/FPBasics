package es.fpbasics.servicioimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fpbasics.modelo.TablaBloques;
import es.fpbasics.repositorio.RepositorioBloques;
import es.fpbasics.servicio.ServicioBloques;

@Service("servicioBloques")
public class ServicioBloquesImpl implements ServicioBloques {
	
	@Autowired
	RepositorioBloques repositorioTablaBloques;


	public List<TablaBloques> consultarTodosLosRegistrosDeLaTablaBloques() {
		return this.repositorioTablaBloques.consultarTodosLosRegistrosDeLaTablaBloques();
	}


	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorEmpresaYIdBloque(Integer idResultado,
			Integer emmpresa) {
		return this.repositorioTablaBloques.consultarRegistrosDeLaTablaBloquePorEmpresaYIdBloque(idResultado, emmpresa);
	}


	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdFormadorResponsable(Integer idFormadorResponsable) {
		return this.repositorioTablaBloques.consultarRegistrosDeLaTablaBloquePorIdFormadorResponsable(idFormadorResponsable);
	}


	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdModulo(Integer idModulo) {
		return this.repositorioTablaBloques.consultarRegistrosDeLaTablaBloquePorIdModulo(idModulo);
	}


	public void modificarRegistroDeLaTablaBloques(TablaBloques registro) {
		this.repositorioTablaBloques.modificarRegistroDeLaTablaBloques(registro);
	}


	public List<TablaBloques> consultarRegistrosDeLaTablaBloqueFiltrado(String filtro) {
		return this.repositorioTablaBloques.consultarRegistrosDeLaTablaBloqueFiltrado(filtro);
	}
	


}