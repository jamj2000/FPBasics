package es.fpbasics.repositorio;

import java.util.List;

import es.fpbasics.modelo.TablaBloques;


public interface RepositorioBloques {
	List<TablaBloques> consultarTodosLosRegistrosDeLaTablaBloques();
	List<TablaBloques> consultarRegistrosDeLaTablaBloquePorEmpresaYIdBloque(Integer idResultado,Integer emmpresa);
	List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdFormadorResponsable(Integer idFormadorResponsable);
	List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdModulo(Integer idModulo);

	void modificarRegistroDeLaTablaBloques(TablaBloques registro);
	
	List<TablaBloques> consultarRegistrosDeLaTablaBloqueFiltrado(String filtro);

}
