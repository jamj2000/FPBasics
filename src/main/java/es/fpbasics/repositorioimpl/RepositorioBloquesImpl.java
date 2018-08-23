package es.fpbasics.repositorioimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.fpbasics.mapper.BloqueMapper;
import es.fpbasics.modelo.TablaBloques;
import es.fpbasics.repositorio.RepositorioBloques;

@Repository
public class RepositorioBloquesImpl implements RepositorioBloques {
	
	@Autowired
	private BloqueMapper mapper;
	

	public List<TablaBloques> consultarTodosLosRegistrosDeLaTablaBloques() {
		
		return this.mapper.consultarTodosLosRegistrosDeLaTablaBloques();
	}

	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorEmpresaYIdBloque(Integer idResultado, Integer emmpresa) {
		return this.mapper.consultarRegistrosDeLaTablaBloquePorEmpresaYIdBloque(idResultado, emmpresa);
	}

	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdFormadorResponsable(Integer idFormadorResponsable) {
		return this.mapper.consultarRegistrosDeLaTablaBloquePorIdFormadorResponsable(idFormadorResponsable);

	}

	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdModulo(Integer idModulo) {
		return this.mapper.consultarRegistrosDeLaTablaBloquePorIdModulo(idModulo);
	}

	public void modificarRegistroDeLaTablaBloques(TablaBloques registro) {
		this.mapper.modificarRegistroDeLaTablaBloques(registro);
	}

	public List<TablaBloques> consultarRegistrosDeLaTablaBloqueFiltrado(String filtro) {
		filtro = ""+filtro+"%";
		return this.mapper.consultarRegistrosDeLaTablaBloqueFiltrado(filtro);
	}
	
	
}
